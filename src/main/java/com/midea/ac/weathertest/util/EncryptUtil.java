package com.midea.ac.weathertest.util;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Locale;

public class EncryptUtil {

    public static String md5(String raw) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(raw.getBytes("UTF-8"));
        byte[] digest = md.digest();
        String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase(Locale.ROOT);
        return myHash;
    }

    public static String base64(String raw){
        byte[] decode = Base64.getDecoder().decode(raw);
        return new String(decode);
    }
}
