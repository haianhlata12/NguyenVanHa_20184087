import java.util.Arrays;

public class SortArray {
  public static void main(String[] args) {
    int[] a = {1789, 2035, 1899, 1456, 2013};
    int sum = 0, n = 5, temp;

    for (int i = 0; i < n; i++) {
      sum += a[i];
    }
    float average = (float) sum / n;

    System.out.println("Array: " + Arrays.toString(a));

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }

    System.out.println("Sorted array: " + Arrays.toString(a));
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}