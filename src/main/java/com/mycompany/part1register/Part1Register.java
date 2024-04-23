
package com.mycompany.part1register;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1Register {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    UserInput ma = new UserInput();
    
    System.out.println("~~~REGISTER AN ACCOUNT~~~");
    System.out.println("Enter username");
    
    ma.setUsername(scanner.nextLine());
    boolean validPassword = false; while(!validPassword){
        System.out.println("Enter password(must contain special characters, alphabets and numbers)");
        String password = scanner.nextLine();
        if
                (isValidPassword(password)){
            ma.setPassword(password);
            validPassword = true; 

        } else 
        
           {
               System.out.println("Password is not valid. Please try again");
           }
        
        }
    System.out.println("Account registered successfully!");
    
    System.out.println("Username:" + ma.getUsername());
    System.out.println("Password:" + ma.getPassword());
    }
   public static boolean isValidPassword(String password) {
       String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%&*()_+=<>?{}\\[\\]~-]).{8,}$";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(password);
       
       return matcher.matches();
      
    }
}


       
    

