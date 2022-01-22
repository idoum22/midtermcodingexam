package string.problems;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class DetermineLargestWord {
    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordLength = findTheLargestWord(s);
        Set<Integer> large = wordLength.keySet();
        int val = Collections.max(large);
        System.out.println("The word with max length is : " + wordLength.get(val));


    }
    static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String>map = new HashMap<Integer, String>();
        String[] words = wordGiven.split("\\s");
        for(int i = 0; i < words.length; i++) {
            map.put(words[i].length(), words[i]);
        }
        return map;
    }
}