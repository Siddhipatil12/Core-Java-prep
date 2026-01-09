import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        // input from user
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        // output
        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
    }
}
