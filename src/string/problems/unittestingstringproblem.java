package string.problems;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static string.problems.DuplicateWord.averageLengthOfWords;
import static string.problems.DuplicateWord.duplicateElement;

public class UnitTestingStringProblem {
    @Test
    public void test0() {

        String firstString = "CAT";
        String secondString = "ACT";
        char str1[] = firstString.toCharArray();
        char str2[] = secondString.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        String s1 = new String(str1);
        String s2 = new String(str2);

        if (s1.equals(s2)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
        Assert.assertEquals(s1, s2);
        System.out.println("test 0 passed");

    }

    @Test
    public void test1() {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordLength = findTheLargestWord(s);
        Set<Integer> large = wordLength.keySet();
        int val = Collections.max(large);
        System.out.println("The word with max length is : " + wordLength.get(val));

    }

    static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[] words = wordGiven.split("\\s");
        for (int i = 0; i < words.length; i++) {
            map.put(words[i].length(), words[i]);
        }
        return map;

        Assert.assertEquals(Collections.max(large), i);
        System.out.println("test 1 passed");
    }


    @Test
    public void test2() {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        HashMap<String,Integer> frequencyCount = new HashMap<String,Integer>();
        frequencyCount = duplicateElement(st);

        System.out.println("Duplicate Element : Frequency");
        for(Map.Entry<String,Integer> x:frequencyCount.entrySet()){
            System.out.println(x.getKey()+" : "+x.getValue());
        }

        System.out.println("Average Length of Words in String : "+String.format("",averageLengthOfWords(st)));
        Assert.assertEquals("Average Length of Words in String : ", "Duplicate Element : Frequency");
        System.out.println("test 2 passed");
    }

    @Test
    public void test3() {

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
            Assert.assertEquals(i, n);
            System.out.println("test 3 passed");
        }
    }
    @Test
    public void test4() {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        System.out.println("The permutation of the given string are :");
        find_permutations(str, "");
    }
    static void find_permutations(String str,String res){
        if (str.length() == 0){
            System.out.print(res + " ");
            return;
        }
        boolean flag[] = new boolean[26];
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String rem_str = str.substring(0, i) + str.substring(i + 1);
            if (flag[ch - 'A'] == false)
                find_permutations(rem_str, res + ch);
            flag[ch - 'A'] = true;
            Assert.assertEquals(ch, flag);
            System.out.println("test 4 passed");
        }
    }

}
