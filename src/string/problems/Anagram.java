package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String firstString = "CAT";
        String secondString = "ACT";

        char str1[] = firstString.toCharArray();
        char str2[] = secondString.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        String s1 = new String(str1);
        String s2 = new String(str2);

        if(s1.equals(s2)){
            System.out.println("Strings are anagram");
        }
        else{
            System.out.println("Strings are not anagram");
        }
    }
}
