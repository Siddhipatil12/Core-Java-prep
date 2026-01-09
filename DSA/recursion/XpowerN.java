public class XpowerN {
    public static int findPow(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {// even n
            return findPow(x, n / 2) * findPow(x, n / 2);
        } else {// odd n
            return findPow(x, n / 2) * findPow(x, n / 2) * x;
        }
    }

    public static void main(String args[]) {
        int n = 5, x = 2;
        int ans = findPow(x, n);
        System.out.println(ans);
    }

}
