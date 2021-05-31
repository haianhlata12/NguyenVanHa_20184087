import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter height (>1): ");
    int n = keyboard.nextInt();

    while (n < 2) {
      System.out.print("Enter height (>1): ");
      n = keyboard.nextInt();
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
