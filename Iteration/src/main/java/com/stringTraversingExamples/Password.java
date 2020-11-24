package com.stringTraversingExamples;
import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        Scanner input= new Scanner(System.in);
        System.out.println("Enter password: ");
        String pwd= input.nextLine();
        if (Password.passwordCheck(pwd))
            System.out.println("Your password is valid");
        else
            System.out.println("Your password is not valid");
    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        //String 
        String lowerCase= password.toLowerCase();
        if (password.length()>= 8)
        {
            for (int i=0; i<password.length(); i++)
            {
                String check= lowerCase.substring(i, i+1);
                char charac= lowerCase.charAt(i);
                int ascii= (int)charac;
                if (!((ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57)))
                    return false;
            }
            return true;
        }
        else
            return false;
    }
}