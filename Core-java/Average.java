import java.util.*;

public class Average {
    public static int findAvg(int n1, int n2, int n3) {
        int avg = (n1 + n2 + n3) / 3;
        System.out.println("Average of 3 no. is:" + avg);
        return avg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        findAvg(n1, n2, n3);

    }
}
