package methodsAndClasses;

public class GreatestCommonDivisor {
    public static int GreatCommonDiv(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else {
                b=b%a;
            }
        }
        return a+b;

    }
    public static int minOfArray(int [] x){
        int[]a= new int[10];
        int min=0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]< a[i+1]){
                min=a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[]a= {12,24,30,48,54};
        int y=minOfArray(a);
        for (int i = 0; i < a.length; i++) {

            y=GreatCommonDiv(y,a[i]);
        }
        System.out.println(y);
    }

}





