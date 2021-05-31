import java.util.Scanner;

public class DisplayDaysOfMonth {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int days = 0;
    String strMonth = "";

    System.out.print("Please input year (>0): ");
    int year = keyboard.nextInt();
    while (year < 1) {
      System.out.print("Please input year (>0): ");
      year = keyboard.nextInt();
    }

    System.out.print("Please input month (1-12): ");
    int month = keyboard.nextInt();
    while (month < 1 || month > 12) {
      System.out.print("Please input month (1-12): ");
      month = keyboard.nextInt();
    }

    switch (month) {
      case 1: {
        days = 31;
        strMonth = "January";
      }
      break;
      case 2: {
        if (year % 4 == 0) {
          days = 29;
        } else {
          days = 28;
        }
        strMonth = "Febuary";
      }
      break;
      case 3: {
        days = 31;
        strMonth = "March";
      }
      break;
      case 4: {
        days = 30;
        strMonth = "April";
      }
      break;
      case 5: {
        days = 31;
        strMonth = "May";
      }
      break;
      case 6: {
        days = 30;
        strMonth = "June";
      }
      break;
      case 7: {
        days = 31;
        strMonth = "July";
      }
      break;
      case 8: {
        days = 31;
        strMonth = "August";
      }
      break;
      case 9: {
        days = 30;
        strMonth = "September";
      }
      break;
      case 10: {
        days = 31;
        strMonth = "October";
      }
      break;
      case 11: {
        days = 30;
        strMonth = "November";
      }
      break;
      case 12: {
        days = 31;
        strMonth = "December";
      }
      break;
    }
    System.out.println("Number of days of " + strMonth + ", " + year + ": " + days);
  }
}
