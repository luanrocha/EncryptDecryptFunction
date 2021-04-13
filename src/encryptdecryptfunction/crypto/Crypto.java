package encryptdecryptfunction.crypto;

import encryptdecryptfunction.rsa.RSAUtil;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Crypto {

    private final RSAUtil rsaUtil;

    public Crypto() {
        this.rsaUtil = new RSAUtil();
    }

    public RSAUtil getRsaUtil() {
        return rsaUtil;
    }

    public String encrypt(String str) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeySpecException {
        String encryptedString = Base64.getEncoder().encodeToString(rsaUtil.encrypt(str, rsaUtil.getPublicKey()));

        //System.out.println("ENC --------> " + str);

        return "<obfuscated>" + encryptedString + "</obfuscated>";
    }

    public String decrypt(String str) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException {
        String decryptedString = rsaUtil.decrypt(str, rsaUtil.getPrivateKey());

        //System.out.println("DEC --------> " + decryptedString);

        return decryptedString;
    }

    public String regexEncrypt(String str) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, InvalidKeySpecException {
        String replaceCardPattern = "(?<=\\W)\\d{14,19}(?=\\W)";

        Pattern pattern = Pattern.compile(replaceCardPattern);

        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            String cardNumber = matcher.group(0).replaceAll("\\-", "").replaceAll("\\|", "").replaceAll("\\,", "").replaceAll("\\;", "").trim();

            String cardInitialNumbers = cardNumber.substring(0,2);
            String cardFinalNumbers = cardNumber.substring(cardNumber.length()-4);

            //cardNumber = cardNumber.replaceFirst(cardInitialNumbers,"");
            //cardNumber = cardNumber.replaceFirst(cardFinalNumbers, "");
            
            String cardMiddleNumbers = cardNumber.substring(2, cardNumber.length()-4);
            
            //System.out.println("INI ====> " + cardInitialNumbers);
            //System.out.println("MID ====> " + cardMiddleNumbers);
            //System.out.println("FIN ====> " + cardFinalNumbers);
                                    
            return str.replaceAll(replaceCardPattern, cardInitialNumbers + encrypt(cardMiddleNumbers) + cardFinalNumbers);
        } else {
            return str;
        }
    }

    public String regexDecrypt(String str) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException, InvalidKeySpecException {
        String tagPattern = "(?<=<obfuscated>).*?(?=<\\/obfuscated>)";

        Pattern pattern = Pattern.compile(tagPattern);

        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            String criptString = matcher.group(0);
            
            return str.replaceAll(tagPattern, decrypt(criptString)).replaceAll("<[^>]+>", "");
        } else {
            return str;
        }
    }
}
