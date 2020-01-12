package fci.engaly.security;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.ArrayList;
import javax.xml.bind.DatatypeConverter;

public class Hashes {

    public static ArrayList lists = new ArrayList();
    static int counter = 0;
    static ArrayList hashs;
    static String[] endFiles;

    public static String getMd5(String path) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(Files.readAllBytes(Paths.get(path)));
            byte[] digest = md.digest();
            String digestInHex = DatatypeConverter.printHexBinary(digest).toLowerCase();
            System.out.println(digestInHex);
            return digestInHex;
        } catch (Exception e) {
            return null;
        }
    }

}
