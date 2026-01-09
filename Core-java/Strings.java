// import java.util.*;

// public class Strings {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         // String reverse = "";

//         // for (int i = str.length() - 1; i >= 0; i--) {
//         // reverse = reverse + str.charAt(i);
//         // }

//         // System.out.println(reverse);

// // using StringBuilder
//         StringBuilder sb = new StringBuilder(str);
//         sb.reverse();

//         System.out.println(sb.toString());

//     }
// }

import java.util.*;

public class Strings {

    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Reversed string: " + reverseString(str));
        sc.close();
    }
}
