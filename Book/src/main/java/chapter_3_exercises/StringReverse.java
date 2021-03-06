package chapter_3_exercises;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {

    public static String reverse(String s) {
        if (s==null) {
            throw new IllegalArgumentException(
                    "String can't be null");
        }

        if (s.equals("")) {
            throw new IllegalArgumentException(
                    "String can't be empty");
        }



        List<String> tempArray = new ArrayList<String>(s.length());
        for (int i = 0; i < s.length(); i++) {
            tempArray.add(s.substring(i, i+1));
        }
        StringBuilder reversedString = new StringBuilder(s.length());
        for (int i = tempArray.size() -1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }

}
