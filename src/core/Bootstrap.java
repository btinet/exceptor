/*
 * Copyright (c) 2023 Benjamin Wagner
 */

package core;

import view.MainView;

import javax.swing.*;

public class Bootstrap extends JFrame {

    public Bootstrap() {
        initWindow();
        runApplication();
    }

    /**
     * Fenster vorbereiten
     */
    private void initWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new MainView(this));
        setSize(800,600);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Eigentliche <em>Anwendung starten</em>. Fehler können jederzeit gezielt per throw ausgegeben werden.
     *
     * <p>Diese Methode kann normalerweise leer sein.</p>
     *
     * @author Benjamin Wagner
     */
    private void runApplication() {
        if (ExceptionHandler.DEV) ExceptionHandler.LOGGER.warn("Anwendung gestartet");

    }

}
