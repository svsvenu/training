package com.training.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.*;

	public class Scheduling {
	
		static Logger log = Logger.getLogger(Scheduling.class);

	public static void main(String[] args) {
	
	BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	
    String s;
    
	try {
		
		log.debug("Enter the input in the following format ");
		
		log.debug(" Username ^ yyyy-MM-dd HH:mm ( start time) ^ yyyy-MM-dd HH:mm ( end time )");
		
		s = bufferRead.readLine();

	    validate(s);

	    
	} catch (IOException e) {
		// TODO Auto-generated catch block
		log.error(e.getStackTrace());
	}

}

	public static String validate(String input) {
	
		String validationErrorMessage = "";
	
		String delimiter = "\\^";
		
		String[] tokens = input.split(delimiter);
		
		for (String token : tokens){
			
			log.debug(token); 
		}
		
		
	
		String regexUserName = "^[a-zA-Z0-9]{5}";
	
		String regexDate = "^[a-zA-Z0-9]{5}";
		
	
	
		if (input.matches(regexUserName)){
		
			log.debug(input + "matches" + regexUserName);
		
		}
	
		else {
		
			log.debug(input + " does not match" + regexUserName);
		}
	
	return validationErrorMessage;
	
}
	
}
