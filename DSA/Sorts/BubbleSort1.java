import java.util.*;

public class BubbleSort1 {

    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) { // passes
            for (int j = 0; j < n - i - 1; j++) { // comparisons
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, n); // sort array
        printArray(arr); // print sorted array

        sc.close();
    }
}
