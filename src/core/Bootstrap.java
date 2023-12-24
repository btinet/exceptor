/*
 * Copyright (c) 2023 Benjamin Wagner
 */

package core;

import view.MainView;

import javax.swing.*;
import java.awt.*;

public class Bootstrap extends JFrame {

    public Bootstrap() throws Exception {
        init();
        run();
    }

    /**
     * Fenster vorbereiten
     */
    private void init() throws Exception {
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
        System.out.println("Anwendung gestartet");
    }

}
