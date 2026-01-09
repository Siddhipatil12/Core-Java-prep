import java.util.*;

public class SearchArr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int num[][] = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (x == num[i][j]) {
                    System.out.println("Number found at:" + i + "," + j);
                }

            }
        }

    }
}
