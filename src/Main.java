/*
 * Copyright (c) 2023 Benjamin Wagner
 */

import core.Bootstrap;
import core.ExceptionHandler;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler());
        // ExceptionHandler.DEV = true;
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName()
        );
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);

        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(Bootstrap::new);

    }

}