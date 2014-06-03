package com.training.training;

import org.apache.log4j.Logger;

/**
 * Hello world! After tag1 
 *
 */

// Venu master commit first after srivats branch

public class App 

//I am happy with my current code commit 4

// Firs master commit after new idea

{
	
	// New idea implemented second commit
	
	static Logger log = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
       // System.out.println( "Hello World! commit4" );
        
        log.debug("this message is from the logger");
        
        Integer a = 10;
        
        Integer b = 5;
        
        //System.out.println(a + b);
        
        try {
        
        MathUtil util = new MathUtilImpl();
        
       Integer sum = util.add(a, b);
       
       System.out.println("Sum of " + a + " and " + b + " is " + sum);
        
        }
        
        catch(Exception e){
        	
        	e.printStackTrace();
        	
        }
        
    }
}

// Srivats first commit on bottom

// Srivats second gommit on bottom
