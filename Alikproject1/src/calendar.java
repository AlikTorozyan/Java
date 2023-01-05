import java.util.Scanner;

public class calendar {
    public static void main(String[]args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input number from 1-12 ");
        int a = k.nextInt();
        int day;
        switch (a){
            case 1:
                day = 31;
                System.out.println("January "+ day);
                break;
            case 2:
                day = 28;
                System.out.println("February "+ day);
                break;
            case 3:
                day = 31;
                System.out.println("March "+ day);
                break;
            case 4:
                day = 30;
                System.out.println("April "+ day);
                break;
            case 5:
                day = 31;
                System.out.println("May "+ day);
                break;
            case 6:
                day = 30;
                System.out.println("June "+ day);
                break;
            case 7:
                day = 31;
                System.out.println("July "+ day);
                break;
            case 8:
                day = 31;
                System.out.println("August "+ day);
                break;
            case 9:
                day = 30;
                System.out.println("September "+ day);
                break;
            case 10:
                day = 31;
                System.out.println("October "+ day);
                break;
            case 11:
                day = 30;
                System.out.println("November "+ day);
                break;
            case 12:
                day = 31;
                System.out.println("December "+ day);
                break;
            default:
                System.out.println("Invalid number , End of program");
                System.exit(0);

        }
    }



}

