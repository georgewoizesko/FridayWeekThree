package com.ProgressiveWorkSpace;
import java.util.Scanner;

public class crypty {

   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String plainText = in.nextLine();
   // key value should be from 0 to 25
    int key = in.nextInt();
    plainText = plainText.toUpperCase();
    char[] plainTextChar = plainText.toCharArray();
    for(int i=0;i<plainTextChar.length;i++) {
        plainTextChar[i] = (char)(((int)plainTextChar[i]+key-65)%26 + 65);
    }
    System.out.println(String.valueOf(plainTextChar));
 }  
}
