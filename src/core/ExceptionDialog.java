package core;

import javax.swing.*;

/**
 * Wie aufgefangene Fehler behandelt werden, wird ausschließlich in dieser Klasse gesteuert.
 */
public class ExceptionDialog {

    /**
     *
     * @param exception aufgefangene Exception-Instanz. Differenzierung nach bestimmten Exceptions implementierbar.
     */
    public ExceptionDialog(Exception exception) {

        JOptionPane.showMessageDialog(
                new JFrame(),
                exception.getClass().getSimpleName() + " in " + exception.getStackTrace()[0],
                "Es ist ein Fehler aufgetreten",
                JOptionPane.ERROR_MESSAGE
        );
    }

}
