package OOP;
import javax.swing.*;
public class Pane {
    private static String name;

    public static void main(String[] args) {
        String nam = name();
        var output = nam + " is such a nice name";
        JOptionPane.showMessageDialog(null, output);

    }

    public static String name() {
        return JOptionPane.showInputDialog("hello what is your name");

    }
}
