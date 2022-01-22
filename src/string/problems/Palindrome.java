package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String str1, str2="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to check whether it is palindrome or not: ");
        str1= sc.nextLine();
        int i, n= str1.length();
        for(i=n-1; i>=0; i--)
        {
            str2= str2+ str1.charAt(i);
        }
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("The String is palindrome");
        }
        else
        {
            System.out.println("The String is not palindrome");
        }
    }
}