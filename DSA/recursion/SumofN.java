import java.util.*;

public class SumofN {
    public static void printN(int i, int n, int sum) {

        if (i > n) {
            System.out.println(sum);
            return;
        }
        sum += i;
        printN(i + 1, n, sum);
        System.out.println(i);
    }

    public static void main(String args[]) {
        printN(1, 5, 0);
    }
}
