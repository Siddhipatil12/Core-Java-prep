
public class ArraySortedorNot {
    public static boolean isSorted(int idx, int[] arr) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            // Array is not sorted
            return false;
        }
        return isSorted(idx + 1, arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };
        System.out.println(isSorted(0, arr));
    }
}
