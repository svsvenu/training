package com.training.training;

/**
 * Hello world! After tag1 
 *
 */
public class App 

//I am happy with my current code commit 4

// Firs master commit after new idea

{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! commit4" );
        
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
