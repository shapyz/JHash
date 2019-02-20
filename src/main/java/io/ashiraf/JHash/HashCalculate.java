package io.ashiraf.JHash;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ashiraf
 */
public class HashCalculate {

    MessageDigest messageDigest;
    
    String message;
    
    public HashCalculate(String message ) {
        
        this.message = message;
        }

        
    
    public String md5() throws NoSuchAlgorithmException {
        messageDigest = MessageDigest.getInstance("MD5");
        
            
            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            System.out.println("HashCode for "+message);
            byte[] messageDigested = messageDigest.digest(message.getBytes());
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigested);
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext; 
        
    }

    public String sha1() throws NoSuchAlgorithmException {
        messageDigest = MessageDigest.getInstance("SHA1");
        
            
            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            System.out.println("HashCode for "+message);
            byte[] messageDigested = messageDigest.digest(message.getBytes());
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigested);
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext; 
    }
    
     public String sha256() throws NoSuchAlgorithmException {
        messageDigest = MessageDigest.getInstance("SHA-256");
        
            
            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            System.out.println("HashCode for "+message);
            byte[] messageDigested = messageDigest.digest(message.getBytes());
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigested);
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext; 
    }
}
