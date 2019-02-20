/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.ashiraf.JHash;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ashiraf
 */
public class Main {
    public static void main(String[] args) {
        
        
        try{
            
            //is algorithm sha-1
            if ( args[0].equalsIgnoreCase("sha-1") ) {
                
                HashCalculate hashCalculate = new HashCalculate(args[1]);
                
                System.out.println(hashCalculate.sha1());
                
                
                 //is algorithm sha-256
            }else if( args[0].equalsIgnoreCase("sha-256") ) {
                
                HashCalculate hashCalculate = new HashCalculate(args[1]);
                
                System.out.println(hashCalculate.sha256());
                
                //is algorithm md5
            } else if( args[0].equalsIgnoreCase("md5") ) {
                
                HashCalculate hashCalculate = new HashCalculate(args[1]);
                
                System.out.println(hashCalculate.md5());
                
            }
            
            //when no algorith is invalid or no message
        }catch(NoSuchAlgorithmException | ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
