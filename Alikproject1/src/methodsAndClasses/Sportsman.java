package methodsAndClasses;

public class Sportsman {


  public double AverageOfConcurs(int... b) {
      int count = 0;
      int k = 0;
      int[] a = new int[b.length];
      for (int i = 0; i < b.length; i++) {
          a[i] = b[i];
          count++;
          k=k+a[i];
      }
        return k/count;
  }

}

