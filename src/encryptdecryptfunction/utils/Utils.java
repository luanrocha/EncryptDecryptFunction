package encryptdecryptfunction.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

public class Utils {
    public static JSONObject connectURL(String urlConn) throws MalformedURLException, ProtocolException, IOException, KeyManagementException, NoSuchAlgorithmException {
        URL url = new URL(urlConn);
        HttpsTrustManager.allowAllSSL();
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(5000);

        if (conn.getResponseCode() > 299) {
            String lineError;
            StringBuilder responseErrorContent = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()))) {
                while ((lineError = reader.readLine()) != null) {
                    responseErrorContent.append(lineError);
                }
            }

            throw new ConnectException("A API retornou um erro na requisicao\n" + responseErrorContent);
        }

        String line;
        StringBuilder responseContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
        }

        return new JSONObject(responseContent.toString());
    }

    public static String getPublicKey(String urlConn) throws ProtocolException, IOException, MalformedURLException, KeyManagementException, NoSuchAlgorithmException {
        return connectURL(urlConn).getString("Content");
    }

    public static String getPrivateKey(String urlConn) throws ProtocolException, IOException, MalformedURLException, KeyManagementException, NoSuchAlgorithmException {
        return connectURL(urlConn).getString("Content");
    }
}
