package com.example.demo.util;

import sun.misc.BASE64Encoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

public class Md5Util {
    public static String encodePassword(String str) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(Objects.requireNonNull(md5).digest(str.getBytes(StandardCharsets.UTF_8)));
    }


    public static boolean checkPassword(String newPassword, String oldPassword) {
        if (encodePassword(newPassword).equals(oldPassword)) {
            return true;
        }
        return false;
    }
}
