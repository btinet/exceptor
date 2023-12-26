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
    public ExceptionDialog(Throwable exception, Integer option) {
        // Meldung bauen
        String message = exception.getClass().getSimpleName() +
                " in " + exception.getStackTrace()[0].getClassName() +
                " in Zeile " + exception.getStackTrace()[0].getLineNumber() +
                " aufgetreten.";
        // Meldung loggen
        if (ExceptionHandler.DEV) ExceptionHandler.LOGGER.warn(message);
        // Dialogfenster anzeigen
        JOptionPane.showMessageDialog(
                new JFrame(),
                message,
                "Eine Ausnahme wurde abgefangen",
                option
        );
    }

    public ExceptionDialog(String text, Integer option) {
        if (ExceptionHandler.DEV) ExceptionHandler.LOGGER.warn(text);
        // Dialogfenster anzeigen
        JOptionPane.showMessageDialog(
                new JFrame(),
                text,
                "Hinweis",
                option
        );
    }

}
