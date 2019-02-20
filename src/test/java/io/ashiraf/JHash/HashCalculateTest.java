/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.ashiraf.JHash;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ashiraf
 */
public class HashCalculateTest {
     
    private HashCalculate hashCalculate;
    
     @Test
     public void testMd5() throws NoSuchAlgorithmException {
            hashCalculate = new HashCalculate("hello");
            String result = hashCalculate.md5();
            assertEquals(result, "5d41402abc4b2a76b9719d911017c592");
     }
     
     
    @Test
    public void testSha1() throws NoSuchAlgorithmException {
            hashCalculate = new HashCalculate("hello");
            String result = hashCalculate.sha1();
            assertEquals(result, "aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d");
    }
     
     
    @Test
    public void testSha256() throws NoSuchAlgorithmException {
            hashCalculate = new HashCalculate("hello");
            String result = hashCalculate.sha256();
            assertEquals(result, "2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824");
    }
}
