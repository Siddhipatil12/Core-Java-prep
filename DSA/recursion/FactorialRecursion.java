public class FactorialRecursion {
    public static int findfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int factorial_nm1 = findfactorial(n - 1);
        int factorialn = n * factorial_nm1;
        return factorialn;
    }

    public static void main(String args[]) {
        int n = 5;
        int ans = findfactorial(n);
        System.out.println(ans);
    }
}
