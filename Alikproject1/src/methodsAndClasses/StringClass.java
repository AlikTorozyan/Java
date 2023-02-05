package methodsAndClasses;

public class StringClass {
    public static void main(String[] args) {
        int a = howMany("one one one two,three,four,five,five","five");
        System.out.println(a);


    }
    static int howMany(String text, String word) {
        int a = text.indexOf(word);
        int count = 0;
        if (text.isEmpty() || word.isEmpty())
            return (-2);
        while (a >= 0) {
            count++;
            a = text.indexOf(word, a + 1);
        }
        if (count == 1)
            return (-1);
        return (count);
    }

    static int howMany(String text) {
        String word = "String";
        int a = text.indexOf("string");
        int count = 0;
        if (text.isEmpty())
            return (-2);
        while (a >= 0) {
            count++;
            a = text.indexOf("string", a + 1);
        }
        if (count == 1)
            return (-1);
        return (count);
    }

}
