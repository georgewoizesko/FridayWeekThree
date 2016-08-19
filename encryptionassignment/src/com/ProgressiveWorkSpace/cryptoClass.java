package com.ProgressiveWorkSpace;

import java.util.Scanner;

public class cryptoClass {

	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  	 String userInput;
		 int offSet;
		
		 
		 System.out.println("Welcome to Message Encryption");
		
		 System.out.println("Please enter a message to be encrypted:");
		  userInput = sc.nextLine();
		
		  System.out.println("please enter the offset number you wish to use:");
		 
		  offSet = sc.nextInt();
		  for(int i = 0; i < 100; i++)
		    {
		        System.out.println("1.Encrypt\n2.Decrypt\n3.Exit...");
		        int choice=sc.nextInt();
		        switch(choice)
		        {
		            case 1:
		            /*send input string keyLength to encrypt() method to encrypt it returns 'Encrypted' string*/
		               // System.out.println("Encrypted message..."+encrypt(str,keyLength));
		            	
		            	 System.out.println("Here is your encrypted message:" + encrypt(userInput, offSet));
		                break;
		            case 2:
		                //send retrived string from encrypt() method and keyLength to decrypt() method it returns 'Decrypted' string
		                //System.out.println("Decryptedmessage..."+decrypt(encrypt(str,keyLength),keyLength));
		            	System.out.println("Here is your decrypted message:" + decrypt(encrypt(userInput, offSet), offSet));
		                break;
		            case 3:
		                //exit from the program
		            	System.out.println("Thank you for using Message Encryption. \nGoodbye!");
		                System.exit(0);
		                break;
		            default:
		            System.out.println("Invalid option..");
		        }//switch
		        
		    }//menu for loop
		  sc.close();
		 //keyLength=offSet.length();
		 
		 /* for (int i = 0; i < eMessage.length(); i++) {
				m = eMessage.charAt(i);
					m = m - (offSet % 26);
						if (m > 26) {
							m = m - 26;
						}
				dMessage = dMessage + (char) m;
				
				
				//message[i] = (message[i] + key)(%26);
		  
		}*/
		// System.out.println("Here is your encrypted message:" + eMessage);
		// System.out.println("Here is your decrypted message:" + dMessage);
	  
	  //char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	  
	 
	
	
/*	public static String encrypt(String message, int offSet){
		
			
			
		}*/
	}//main

	public static String encrypt(String userInput, int offSet) {
		String eMessage = " ";
		for (int i = 0; i < userInput.length(); i++) {
			
			int m = userInput.charAt(i);
				m = m + (offSet % 26);
					/*if (m > 26) {
						m = m - 26;
					}*/
			eMessage = eMessage + (char) m;
		  }
		return eMessage;
	}//encrypt

	private static String decrypt(String eMessage, int offSet) {
		String dMessage = " ";
		for (int j = 0; j < eMessage.length(); j++) {
			
			int m = eMessage.charAt(j);
			m = (m - (offSet % 26));
				/*if (m < 26) {
					m = m + 26;
				}*/
		dMessage  = dMessage + (char) m;
			
			
			//message[i] = (message[i] + key)(%26);
	  
	}
		return dMessage;
	}//decrypt
}//cryptoclass
