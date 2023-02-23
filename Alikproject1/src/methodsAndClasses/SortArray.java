package methodsAndClasses;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, -23, 5, 12, -23, 5, 5, 12, 12, 12, -23, 5, -23};
        int a;
        boolean check = true;
        while (check) {
            check = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                    check = true;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }

    }
}




































