package com.shadab.test;

import java.util.UUID;

public class Calc {

    public static void main (String[] args) {
        
        // creating UUID      
        UUID uid = UUID.nameUUIDFromBytes("/var/www/example.com/html/index.php".getBytes());     
             
        // checking UUID value
        system.out.println("UUID value is : "+uid);    
    }
    
    public Integer add(Integer n1, Integer n2) {
        return n1 + n2;
    }
}
