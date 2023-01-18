public class BinayToDecimal {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 1, 1, 0, 0, 1};
        int n = 1, decNumber = 0;
        for (int i = a.length - 1; i >= 0; i--, n *= 2) {
            decNumber = decNumber + (n * a[i]);
        }
        System.out.println(decNumber);
    }
}
