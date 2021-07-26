/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

/**
 * ICE 3: create a simple password validator. the password must have:​

A length of at least 8​

At least one special character​

At least one uppercase character​
 * @author: Huỳnh Thị Thanh Diệu
 */
import java.util.Scanner;
public class PasswordValidator {

    public static void main(String[] args) 
   {
       Scanner in= new Scanner(System.in); 
       
       boolean valid=false;
       do
       {
       String pass= in.next();
       if(checkLength(pass)) // && checkUpper(pass) && checkSpecial(pass))
       {
           valid = true;
       }
       }while(!valid);
       
       System.out.println("valid password" +valid);
      }
    public static boolean checkLength(String pass){
        int flag=0;
        if (pass.length() >= 8) {
           flag=1;
       }

       int upperCnt = 0, specialCnt = 0;
       char ch;
       for (int i = 0; i < pass.length(); i++) {
           ch = pass.charAt(i);
           if (Character.isUpperCase(ch)) {
               upperCnt++;
           }
           if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
               specialCnt++;
           }
       }
      
       if(flag==0)
       {
           System.out.println("** Password length must be atleast 8 **");
       }
       if(upperCnt<1){
        System.out.println("Must Contain atleast one uppercase letter.");
        
       }
       
       if(specialCnt<1){

        System.out.println("Must Contain atleast one special case letter.");
        }
       
        return !(upperCnt <1 || specialCnt < 1 || flag==0);
    }
    }
    
