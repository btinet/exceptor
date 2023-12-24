import core.Bootstrap;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {
            new Bootstrap();
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(
                    new JFrame(),
                    exception.getClass().getSimpleName() + " in " + exception.getStackTrace()[0],
                    "Es ist ein Fehler aufgetreten",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }

}