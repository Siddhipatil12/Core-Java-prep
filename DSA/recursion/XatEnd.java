public class XatEnd {
    public static void moveAllX(String str, int count, int idx, String newStr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, count, idx + 1, newStr);
        } else {
            newStr += currChar;
            moveAllX(str, count, idx + 1, newStr);
        }
    }

    public static void main(String[] agrs) {
        String str = "axbexxd";
        moveAllX(str, 0, 0, "");

    }
}
