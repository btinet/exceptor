/*
 * Copyright (c) 2023 Benjamin Wagner
 */

package core;

import javax.swing.*;

/**
 * Wie aufgefangene Fehler behandelt werden, wird ausschließlich in dieser Klasse gesteuert.
 */
public class ExceptionDialog {

    /**
     *
     * @param exception aufgefangene Exception-Instanz.
     */
    public ExceptionDialog(Exception exception) {

        JOptionPane.showMessageDialog(
                new JFrame(),
                exception.getClass().getSimpleName() + " in " + exception.getStackTrace()[0].getClassName() + " in Zeile " + exception.getStackTrace()[0].getLineNumber() + " aufgetreten.",
                "Eine Ausnahme wurde abgefangen",
                JOptionPane.ERROR_MESSAGE
        );
    }

}
