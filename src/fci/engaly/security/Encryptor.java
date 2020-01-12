package fci.engaly.security;


import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Encryptor {

    private final static String HEX = "0123456789ABCDEF";
    private final static String secret = "1234567890oijhyg";

    public static String encryption(String message) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, generateKey(secret));
            byte[] cipherText = cipher.doFinal(message.getBytes("UTF-8"));
            return toHex(cipherText);
        } catch (Exception e) {
            return null;
        }
    }

    public static String decryption(String plainText) {
        try {
            byte[] cipherText = toByte(plainText);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, generateKey(secret));
            return new String(cipher.doFinal(cipherText), "UTF-8");
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    private static SecretKey generateKey(String password) {
        try {
            return new SecretKeySpec(password.getBytes(), "AES");
        } catch (Exception e) {
            return null;
        }
    }

    private static String toHex(byte[] buf) {
        if (buf == null) {
            return "";
        }
        StringBuffer result = new StringBuffer(2 * buf.length);
        for (int i = 0; i < buf.length; i++) {
            appendHex(result, buf[i]);
        }
        return result.toString();
    }

    private static byte[] toByte(String hexString) {
        int len = hexString.length() / 2;
        byte[] result = new byte[len];
        for (int i = 0; i < len; i++) {
            result[i] = Integer.valueOf(hexString.substring(2 * i, 2 * i + 2), 16).byteValue();
        }
        return result;
    }

    private static void appendHex(StringBuffer sb, byte b) {
        sb.append(HEX.charAt((b >> 4) & 0x0f)).append(HEX.charAt(b & 0x0f));
    }

    public static void main(String[] args) {
        System.out.println(Encryptor.encryption("D04E6DA26370907310B29724AAC46B3D"));
//        System.out.println(Encryptor.decryption("09107E02863DA564E9AEEFC5553C80596B4FCA1EE0508D6832BAD9CD6C7B3638"));

    }

}
