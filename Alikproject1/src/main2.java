import org.w3c.dom.ls.LSOutput;

public class main2
{
    public static void main(String[] args) {
        //Task 1 .when x/y without a reminder,return "true", else "false"
        int x = 50;
        int y = 25;
        double z = x * 1.0 / y;
        int i = x / y;
        double ii = z - i;
        boolean bb = ii == 0;
        System.out.println(bb);
        System.out.println("-------------------------------------------");
        // Task 2.Return  /a+b+c/3+/d+e+f/3 in int format
            int a = 10;
            int b = 14;
            int c = 16;
            int d = 17;
            int e = 19;
            int f = 28;
            double g = 1.0*(a + b + c) / 3;
            double h = 1.0*(d + e + f) / 3;
        System.out.println(g);
        System.out.println(h);
        int k = (int)(g+h);
        System.out.println(k);
        System.out.println("-------------------------------------------");
        //Task 3.Return the decimal part of number
        double aa = 47.853;
        int cc = (int)(aa);
        double dd = (aa-cc);
        System.out.printf("%.3f",dd);


        }

    }








