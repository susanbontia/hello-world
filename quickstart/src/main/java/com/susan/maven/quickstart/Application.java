package com.susan.maven.quickstart;


/**
 * Hello world!
 *
 */
public class Application {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        
        LombokModel lombokModel = new LombokModel();
        
        System.out.println(lombokModel.getName());
        System.out.println(lombokModel.getAge());
        System.out.println(lombokModel.getAddress());
        
    }
    
   
    
}


