import java.util.Calendar;
import java.util.Scanner;

public class MyDate {
  private int day;
  private int month;
  private int year;

  public MyDate() {
    day = Calendar.getInstance().get(Calendar.DATE);
    month = Calendar.getInstance().get(Calendar.MONTH);
    year = Calendar.getInstance().get(Calendar.YEAR);
  }

  public MyDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate(String date) {
    setDateFromString(date);
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    if (1 <= day && day <= 31) {
      this.day = day;
    } else {
      System.out.println("Day is not valid!");
    }
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    if (1 <= month && month <= 12) {
      this.month = month;
    } else {
      System.out.println("Month is not valid!");
    }
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    if (year > 0) {
      this.year = year;
    }
    else {
      System.out.println("Year is not valid!");
    }
  }

  public void accept() {
    Scanner keyboard = new Scanner(System.in);
    String date = keyboard.nextLine();
    setDateFromString(date);
  }

  private void setDateFromString(String date) {
    String [] tmp = date.split("\\s");
    String month = tmp[0];
    String day = tmp[1].substring(0, 2);
    String year = tmp[2];

    switch (month) {
      case "January":
        this.month = 1;
        break;

      case "February":
        this.month = 2;
        break;

      case "March":
        this.month = 3;
        break;

      case "April":
        this.month = 4;
        break;

      case "May":
        this.month = 5;
        break;

      case "June":
        this.month = 6;
        break;

      case "July":
        this.month = 7;
        break;

      case "August":
        this.month = 8;
        break;

      case "September":
        this.month = 9;
        break;

      case "October":
        this.month = 10;
        break;

      case "November":
        this.month = 11;
        break;

      case "December":
        this.month = 12;
        break;

      default:
        System.out.println("Date is not valid!");
        return;
    }

    int dayInt = Integer.parseInt(day);
    if (dayInt < 1 || dayInt > 31) {
      System.out.println("Date is not valid!");
      return;
    }
    this.day = dayInt;

    int yearInt = Integer.parseInt(year);
    if (yearInt <= 0) {
      System.out.println("Date is not valid!");
      return;
    }
    this.year = yearInt;
  }

  public void print(){
    System.out.println(this.getDay()+"/" + this.getMonth()+ "/" + this.getYear());
  }
}
