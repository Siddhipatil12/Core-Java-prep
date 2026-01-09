public class TowerofHanoi {
    public static void process(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println(" transferred Disk" + n + "from" + source + "to" + destination);
            return;
        }
        process(n - 1, source, destination, helper);
        System.out.println("transferred disks" + n + "from" + source + "to" + destination);
        process(n - 1, helper, source, destination);

    }

    public static void main(String args[]) {
        int n = 3;
        process(n, "S", "H", "D");
    }
}
