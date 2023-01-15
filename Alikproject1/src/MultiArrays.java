import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        //Task 1
        int[][] multiarray = {
                {4, 7, 12, -5},
                {9, 15, -8, 33, 50},
                {3, 11, 17}
        };
        for (int i = 0; i < multiarray.length; i++) {
            for (int j = 0; j < multiarray[i].length; j = j + multiarray[i].length - 1) {
                System.out.print(multiarray[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("------------------------------------");
        //Task 3
        int[] arr1 = {2, 5, 10, 14, -5, 9, 7, 30};
        int x = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] < arr1[i + 1])
                x++;
        }
        System.out.println(x);
        System.out.println("------------------------------------");
        //Task 2
        int[][] multyarr2 = {
                {12, 18, 28, 51, -5},
                {10, 20, -3, 44, 70, 81}
        };
        int k = 0;
        int maxarr = multyarr2[k].length;

        for (int i = 0; i < multyarr2.length; i++) {
            for (int j = 0; j < multyarr2[i].length; j++) {
                if (multyarr2[i].length > maxarr)
                    maxarr = multyarr2[i].length;
            }
        }
        System.out.println(maxarr);
    }
}


