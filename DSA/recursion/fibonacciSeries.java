public class fibonacciSeries {
    public static void findFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        findFibo(b, c, n - 1);
    }

    public static void main(String agrs[]) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        findFibo(a, b, n - 2);
    }
}
