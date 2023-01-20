public class Prime {
    public static void main(String[] args) {
        boolean prime = true;
        int a[] = {8, 17, 18, 23, 29, 33, 47};
        int i;
        for (i = 0; i < a.length; i++) {
            for (int j = 2; j < a[i] / 2; j++) {
                if (a[i] % j == 0) {
                    prime = false;
                    break;
                } else
                    System.out.print(a[i] + " ");
            }
        }
    }
}

