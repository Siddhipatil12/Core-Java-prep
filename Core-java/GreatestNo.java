import java.util.*;

public class GreatestNo {
    public static int findGreatest(int n1, int n2) {
        if (n1 > n2) {
            return n1;

        } else if (n2 > n1) {
            return n2;
        } else {
            System.out.println("Both numbers are equal");
            return n1;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no:");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd no:");
        int n2 = sc.nextInt();
        System.out.println(findGreatest(n1, n2));
    }
}
