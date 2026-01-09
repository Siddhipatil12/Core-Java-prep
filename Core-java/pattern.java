import java.util.Scanner;
import java.util.*;

class pattern {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println(a);
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            int odd = 2 * i - 1;
            for (int j = 1; j <= odd; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            int odd = 2 * i - 1;
            for (int j = 1; j <= odd; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
