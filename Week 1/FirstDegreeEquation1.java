import javax.swing.*;

public class FirstDegreeEquation1 {
  public static void main(String[] args) {
    String strA, strB;
    String strNotification = "Enter first degree equation ax +b";

    JOptionPane.showMessageDialog(null, strNotification, "Solve first degree equation ax +b", JOptionPane.INFORMATION_MESSAGE);

    strA = JOptionPane.showInputDialog(null, "Please input a: ", "Solve first degree equation ax +b", JOptionPane.INFORMATION_MESSAGE);

    strB = JOptionPane.showInputDialog(null, "Please input b: ", "Solve first degree equation ax +b", JOptionPane.INFORMATION_MESSAGE);

    double a = Double.parseDouble(strA);
    double b = Double.parseDouble(strB);

    if (a == 0) {
      if (b == 0) {
        strNotification = "Phuong trinh vo so nghiem";
      } else {
        strNotification = "Phuong trinh vo nghiem";
      }
    } else {
      strNotification = "Nghiem x = " + Double.toString(-b / a);
    }

    JOptionPane.showMessageDialog(null, strNotification, "Solve first degree equation ax +b", JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
}
