import java.util.Arrays;

public class arraycopy {
    public static void main(String[] args) {
        double[] a = {20.5,-2.1,-2.7,-9,1};
        //double[] a = {10,12.2,15,9.9,7};
        //double[] a = {-3.5,2,-2.7,4,5};
        double[] acopy = new double[5];
        if (a[0]>0)
            acopy[0]=a[0];
        else acopy[0]=0;
        if (a[1]>0)
            acopy[1]= a[1];
        else acopy[1]=0;
        if (a[2]>0)
            acopy[2]=a[2];
        else acopy[2]=0;
        if (a[3]>0)
           acopy[3]= a[3];
        else acopy[3]=0;
        if (a[4]>0)
           acopy[4]= a[4];
        else acopy[4]=0;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(acopy));
    }
}
