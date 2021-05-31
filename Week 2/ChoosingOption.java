import javax.swing.*;

public class ChoosingOption {
  public static void main(String[] args) {
    String[] options = {"Yes, I do", "No, I don't"};

    int option = JOptionPane.showOptionDialog(null,
            "Do you want to change to the first class ticket?",
            "Change ticket",
            2,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

    JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
    System.exit(0);
  }
}
