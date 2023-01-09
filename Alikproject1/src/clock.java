public class clock {
    public static void main(String[] args) {
        int a;
        a = 10;
        int minute = a * 5;
        if (a >= 0 && a <= 12)
            switch (a) {
                case 1,2,3,4,5,6,7,8,9,10,11:
                    System.out.println("It is "+ minute +" minute past:");
                    break;
                case 0,12:
                    System.out.println("It is N hour exactly:");
                    break;
            }
        else
            System.out.println("Input number from 0 to 12");
            System.exit(0);
    }
}
