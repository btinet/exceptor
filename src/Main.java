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
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        javax.swing.SwingUtilities.invokeLater(Bootstrap::new);
    }

}