package com.ProgressiveWorkSpace;

import java.util.Scanner;

public class cleanCryptoClass {

	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  	 String userInput;
		 int offSet;
				 
		 System.out.println("Welcome to Message Encryption\n");
		
		 System.out.println("Please enter a message to be encrypted:");
		  	userInput = sc.nextLine();
		
		  System.out.println("please enter the offset number you wish to use:");
		  	offSet = sc.nextInt();
		  	
		  for(int i = 0; i < 100; i++) {
			  	
			  	//Menu
		        System.out.println("1: Encrypt Message");
		        System.out.println("2: Decrypt Message");
		        System.out.println("3: Exit Message Encryptor");
		        int action=sc.nextInt();
		        
		        switch(action) {
		            case 1://send userInput and offSet to encrypt() method
		               	System.out.println("Here is your encrypted message: " + encrypt(userInput, offSet));
		                break;
		            case 2://sends eMessage and offSet from encrypt() to decrypt() method
		               	System.out.println("Here is your decrypted message: " + decrypt(encrypt(userInput, offSet), offSet));
		                break;
		            case 3: //exit Message Encryption program
		               	System.out.println("\nThank you for using Message Encryption.\n\nGoodbye!");
		                System.exit(0);
		                break;
		            default:
		            System.out.println("Please choose a valid menu option!");
		        }//switch
		        
		    }//menu for loop
		  sc.close();

	}//main

	public static String encrypt(String userInput, int offSet) {
		
		//Takes userInput string and offsets each character by offSet value using string.length() and char.at()
		
		String eMessage = "";
		for (int i = 0; i < userInput.length(); i++) {
			
			int m = userInput.charAt(i);
				m = m + (offSet % 26);
					
			eMessage = eMessage + (char) m;
		  }
		return eMessage;
	}//encrypt

	private static String decrypt(String eMessage, int offSet) {
		
		//Takes eMessage from encrypt() method and performs a reverse offset operation established in encrypt() method
		
		String dMessage = "";
		for (int j = 0; j < eMessage.length(); j++) {
			
			int m = eMessage.charAt(j);
			
			m = (m - (offSet % 26));				
		dMessage  = dMessage + (char) m;
		}//decrypt loop
		return dMessage;
	}//decrypt
}//cryptoclass

