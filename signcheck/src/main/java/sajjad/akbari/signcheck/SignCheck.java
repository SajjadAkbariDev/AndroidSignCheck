package sajjad.akbari.signcheck;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;

public class SignCheck {

    public static String GetSignHashCode(Context context) {
        String sigstr = "";
        Signature[] sigs = new Signature[0];
        try {
            sigs = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_SIGNATURES).signatures;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Signature sig : sigs)
        {
            sigstr = sig.hashCode()+"";
        }
        AES256EX aes = new AES256EX("legof", 256, "micronb");
        String data = aes.encrypt(sigstr);
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("label", data);
        clipboard.setPrimaryClip(clip);
        return "sign hash code is copied to ClipBoard";
    }

    public static void CheckSignHashCode(String HashCode , Context context) {
        String sigstr = "";
        Signature[] sigs = new Signature[0];
        try {
            sigs = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_SIGNATURES).signatures;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Signature sig : sigs)
        {
            sigstr = sig.hashCode()+"";
        }
        AES256EX aes = new AES256EX("legof", 256, "micronb");
        String Codes = aes.decrypt(HashCode);
        if (Codes.equals(sigstr) || Codes == sigstr) {
            /// it's equal
        }else {
            AES256EX aes2 = new AES256EX("legofm", 256, "micronbm");
            String PText = aes2.decrypt("kjhkhiiyiyb44848");
        }
    }

}
