public class Main {
    public static void main(String[] args)
    {
        //variable c is the sum of the squares of a and b
        int c;
        int a = 5;
        int b = 6;
              c = a*a+b*b;
        System.out.println("c = a*a+b*b = " +c);
        System.out.println("----------------------------------");
        //variable S is the area of trapezoid
        int S;
        a = 10;
        b = 14;
        c = 7;
        S = (a + b)/2 * c;
        System.out.println("S of trapezoid = " +S);
        System.out.println("----------------------------------");
        //variable x is the three-digit number
        int x = 548;
        a = x/100;
        b = (x-(a*100))/10;
        c = (x-a*100)%(b*10);
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("----------------------------------");

    }
}