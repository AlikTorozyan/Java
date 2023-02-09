package methodsAndClasses;

public class charArray {
    public static void main(String[] args) {
        int i = 0;
        char c[] = new char[3];
        c[i] = intToChar(100, 101, 102);
        System.out.println(c[i]);
    }

    public static char intToChar(int... a) {
        char b[] = new char[a.length];
        int i;
        for (i = 0; i < a.length; i++) {
            b[i] = (char) a[i];
            System.out.println(b[i]);
        }
        return b[i];
    }
}