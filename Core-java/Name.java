import java.util.*;

public class Name {
    public static void myName(String name) {
        System.out.print(name);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        myName(name);

    }

}
