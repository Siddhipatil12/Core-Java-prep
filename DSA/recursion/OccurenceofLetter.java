package recursion;

import java.util.*;

public class OccurenceofLetter {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        int currChar = str.charAt(idx);
        if (currChar == element) {
            first = idx;
        } else {
            last = idx;
        }

        findOccurence(str, idx + 1, element);
    }

    public static void main(String args[]) {
        String str = "abaacdaefaab";
        findOccurence(str, 0, 'a');
    }

}
