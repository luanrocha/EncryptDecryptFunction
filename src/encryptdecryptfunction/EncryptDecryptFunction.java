package encryptdecryptfunction;

import com.axway.xib.api.dml.Function;
import encryptdecryptfunction.crypto.Crypto;
import encryptdecryptfunction.utils.Utils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

public class EncryptDecryptFunction implements Function {

    public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, InvalidKeySpecException, IOException, ProtocolException, MalformedURLException, KeyManagementException {
        Object[] paramPublic = new Object[1];
        Object[] paramPrivate = new Object[1];

        paramPublic[0] = "https://apmcu8j880.execute-api.us-east-1.amazonaws.com/dev/AIMWebService/api/Accounts?AppID=RESTAPI&Safe=LAM_SEC_APL_ADM_PRD&Object=Operating%20System-UnixSSHKeys-127.0.0.1-Key_Public";
        paramPrivate[0] = "https://apmcu8j880.execute-api.us-east-1.amazonaws.com/dev/AIMWebService/api/Accounts?AppID=RESTAPI&Safe=LAM_SEC_APL_ADM_PRD&Object=Operating%20System-UnixSSHKeys-127.0.0.1-Key_private";

        String publicKey = String.valueOf(getPublicKey(paramPublic));
        String privateKey = String.valueOf(getPrivateKey(paramPrivate));

        //System.out.println("publicKey: " + publicKey);
        //System.out.println("privateKey: " + privateKey);
        //System.out.println("-------------------------------------------------");

        List<String> tst = new ArrayList<>();
        tst.add("certificado|fecha_inicio|fecha_fin|effective_date|rut|insured|birthdate|tarjeta|collector|CSV|prima");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5018672895048950||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6386012755192980||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6390178261619080||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6395930711557150||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|604373874271472||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4913016794048630||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4508998850324040||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|36604496583441||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6763336314355130||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6761253678396030||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|30061943251401||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|36281634611945||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|36803465638463||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5578460905654390||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|30029036632852||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|30196581964681||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|3535273480788740000||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5402643881308240||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5453245616488320||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6011464293826220000||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|3528160466962380||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|3537295079057160||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4024007156538240||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4718367922211450||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4024007127565970000||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5397061161715280||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5556546858810520||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5492970551185600||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|376804262864300||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|374544959987111||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|377305094837836||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6394324295190670||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6385341290821860||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6393728426638660||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4844081522686540||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4026606752605600||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4508434529920600||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6759375552928250||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6763884086135130||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5018753691117150||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|36013976609512||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|36744152381902||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|36026893859853||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|30075332875885||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|30198979449531||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|30393726027975||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5543366251490110||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5450521594309160||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5452087094230230||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|3543873587261720||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|3589151577237160||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|3541245651190540000||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6011431878636230||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6011680432656960||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6011494661745400000||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|341509580734091||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|341687938709393||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|370590077857227||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|2720991700366990||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5305616904743810||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|2221007795521850||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4539143963953850||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4716608496885690||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4916516223613720000||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6380184021905360||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6393695879232460||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6374119699785030||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4917714792119010||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4175009202116570||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4844818722121820||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5018672895048950||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5038289027333990||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5038103185544670||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|36448444309776||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|36342833290137||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|36441929848087||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|30305124305571||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|30119165792708||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|30493697852219||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5557122660140920||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5474902524040920||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5524097315177510||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|3545460237500080||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|3528038309682780||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|3538493888853700000||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6011980233258160||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6011459478295960||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6011384886140130000||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|348470101312359||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|343019173042272||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|346588502114389||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5104050958113690||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|2221008559631560||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|5304719590190620||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4532667045483650||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4024007129355920||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4539600051753220000||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4175009658878950||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6386012755192980||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6390178261619080||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6395930711557150||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|604373874271472||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4913016794048630||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|4508998850324040||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|36604496583441||543|158000");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|FernandoCosta|12021989|6763336314355130||543|158000");
        tst.add("01012020|31012020|01012020|78469515-8|Teste 1|12021989|4108154592389039|VISA|543|158000");
        tst.add("13248485|52561285|97345120|89151884-2|Teste 2|56135148|5142309908278073|MASTERCARD|123|789570");
        tst.add("59195191|51251847|98425158|98451557-5|Teste 3|78945110|345799213360333|AMEX|789|123460");
        tst.add("89456148|12345745|21684851|35484151-8|Teste 4|53168494|38089713984861|DINERS CLUB|159|753418");
        tst.add("25218827|94548548|98745151|98415354-8|Teste 5|98415533|6011435206398473|DISCOVER|753|789651");
        tst.add("02188252|51201840|61021548|32186748-8|Teste 6|98745151|3587532422549151|JCB|456|753210");
        tst.add("FERNANDO01|01012020|31012020|01012020|78469515-8|Fernando Costa|12021989|3214324178941234|VISA|543|158000");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;4654123546541345;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;4175009658878950;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;6386012755192980;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;6390178261619080;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;6395930711557150;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;604373874271472;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;4913016794048630;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;4508998850324040;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;36604496583441;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;6763336314355130;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;6761253678396030;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;30061943251401;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;36281634611945;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;36803465638463;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;5578460905654390;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;30029036632852;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        tst.add("288DG;01032020;;1;1;2;218041198;SCOTIABANK_218041198_CPP;;GP_218041198;310000493;NANCY VERONICA;IRIBARRA;;01101980;;;;;;;F;;;;1;;10000000;10000000;;;0,3500;21000;01032020;30196581964681;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

        for (String str : tst) {
            Object[] testeEncrypt = new Object[2];
            testeEncrypt[0] = publicKey;
            testeEncrypt[1] = str;

            String encpt = null;
            try {
                encpt = encrypt(testeEncrypt).toString();
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
                ex.printStackTrace();
            }

            Object[] testeDecrypt = new Object[2];
            testeDecrypt[0] = privateKey;
            testeDecrypt[1] = encpt;

            String decpt = null;
            try {
                decpt = decrypt(testeDecrypt).toString();
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
                ex.printStackTrace();
            }

            System.out.println(encpt);
            System.out.println(decpt);
            System.out.println(str);
            
            boolean estadoValido = str == null ? decpt == null : str.equals(decpt);
            System.out.println("VALIDO? " + estadoValido);
            
            if(!estadoValido) {
                throw new IllegalStateException("A string final não pode ser diferente da string de entrada");
            }

            System.out.println("==================================================================================================================================================");
        }
    }

    public static Object encrypt(Object[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, InvalidKeySpecException {
        String key = args[0].toString();
        String str = args[1].toString();

        Crypto crypto = new Crypto();
        crypto.getRsaUtil().setPublicKey(key);

        return crypto.regexEncrypt(str);
    }

    public static Object decrypt(Object[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, InvalidKeySpecException {
        String key = args[0].toString();
        String str = args[1].toString();

        Crypto crypto = new Crypto();
        crypto.getRsaUtil().setPrivateKey(key);

        return crypto.regexDecrypt(str);
    }

    public static Object getPrivateKey(Object[] args) throws ProtocolException, IOException, MalformedURLException, KeyManagementException, NoSuchAlgorithmException {
        String url;

        if (args[0] == null || args[0].toString().trim().equals("")) {
           url = "https://apmcu8j880.execute-api.us-east-1.amazonaws.com/dev/AIMWebService/api/Accounts?AppID=RESTAPI&Safe=LAM_SEC_APL_ADM_PRD&Object=Operating%20System-UnixSSHKeys-127.0.0.1-Key_private";
        } else {
            url = args[0].toString().trim();
        }

        return Utils.getPrivateKey(url);
    }

    public static Object getPublicKey(Object[] args) throws ProtocolException, IOException, MalformedURLException, KeyManagementException, NoSuchAlgorithmException {
        String url;

        if (args[0] == null || args[0].toString().trim().equals("")) {
            url = "https://apmcu8j880.execute-api.us-east-1.amazonaws.com/dev/AIMWebService/api/Accounts?AppID=RESTAPI&Safe=LAM_SEC_APL_ADM_PRD&Object=Operating%20System-UnixSSHKeys-127.0.0.1-Key_Public";
        } else {
            url = args[0].toString().trim();
        }

        return Utils.getPublicKey(url);
    }
}
