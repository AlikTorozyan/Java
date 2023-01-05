import java.util.Scanner;

public class triangle {
    public static void main(String[]args) {
    Scanner k = new Scanner(System.in);
    System.out.println("Input three number for sides of triangle a,b,c.\n /Input number and click <space> or <enter> button/ ");
    int a = k.nextInt();
    int b = k.nextInt();
    int c = k.nextInt();

    if (a + b > c && b + c > a && a + c> b)
        System.out.println("Triangle is available");
    else
        System.out.println("Triangle is not available");
}

        }
