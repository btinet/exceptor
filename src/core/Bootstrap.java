/*
 * Copyright (c) 2023 Benjamin Wagner
 */

package core;

import view.MainView;

import javax.swing.*;

public class Bootstrap extends JFrame {

    public Bootstrap() {
        init();
        run();
    }

    /**
     * Fenster vorbereiten
     */
    private void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new MainView(this));
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Eigentliche Anwendung starten. Fehler können jederzeit gezielt per throw ausgegeben werden.
     */
    private void run() {
        if (ExceptionHandler.DEV) ExceptionHandler.LOGGER.warn("Anwendung gestartet");
    }

}
