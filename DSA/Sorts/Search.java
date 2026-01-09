import java.util.*;

public class Search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        System.out.println("Enter elements:");
        int num[] = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter Search element:");
        int x = sc.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (x == num[i]) {
                System.out.println("Number found at:" + i);
            }
        }
    }

}
