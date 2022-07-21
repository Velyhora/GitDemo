package InterviewTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class findCountEachLetterString {

    //Giving string "United states of America"
    // How to find count of each letter in the String?
    //Make all letter Uppercase and get rid of space between words

    public static Map<Character,Integer> countLetter(String str){


        Map<Character, Integer> result = new LinkedHashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (result.containsKey(ch)) {
                    int count = result.get(ch); //1
                    result.replace(ch, ++count);
                } else {
                    result.put(ch, 1);
                }
            }
            return result;
        }

    public static void main(String[] args) {
        String s = "United states of America";
        s = s.toUpperCase().replace(" ", "");
        System.out.println(countLetter(s));
    }
}
