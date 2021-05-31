public class DateUtils {
  public static int compareDate(MyDate date1, MyDate date2) {
    int yearCmp = date1.getYear() - date2.getYear();
    if (yearCmp > 0) {
      return 1;
    } else if (yearCmp == 0) {
      int monthCmp = date1.getMonth() - date2.getMonth();
      if (monthCmp > 0) {
        return 1;
      } else if (monthCmp == 0) {
        int dayCmp = date1.getDay() - date2.getDay();
        if (dayCmp > 0) {
          return 1;
        } else if (dayCmp == 0) {
          return 0;
        }
      }
    }
    return -1;
  }
}
