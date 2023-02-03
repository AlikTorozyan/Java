package methodsAndClasses;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isNumberArmstrong(153));
    }
    static int deg(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res = res * a;
        }
        return res;
    }
    static int isNumberArmstrong(int x) {
        int i = 0;
        int result1 = 0;
        int count = 0;
        int[] arr1 = new int[10];
        while (x > 0) {
            int y = x % 10;
            arr1[i] = y;
            x /= 10;
            y++;
            count++;
            if (i < arr1.length - 1) {
                i++;
            }
        }
        for (int k = 0; k <= count; k++) {
            for (int j = 0; j <= count; j++) {
            }
            result1 = result1 + deg(arr1[k], count);
        }
        return result1;
    }






}
