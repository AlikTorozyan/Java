package methodsAndClasses;

public class ReverseString {
    public static void main(String[] args) {
        String a = "on March 4th we will have a java exam";
        char[] b = a.toCharArray();
        String c = "";
        for (int i = b.length - 1; i >= 0; i--) {
            c = c + b[i];
        }
        System.out.println(c);
    }
}






