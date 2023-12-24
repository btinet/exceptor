

/*
 * Copyright (c) 2023 Benjamin Wagner
 */

import core.Bootstrap;
import core.ExceptionDialog;

public class Main {
    public static void main(String[] args) {

        try {
            /*
            Innerhalb try-Block Anwendung initialisieren und damit alle auftretenden Fehler abfangen.
             */
            new Bootstrap();
        } catch (Exception exception) {
            /*
            Aufgetretene Fehler in einem Dialogfenster ausgeben.
             */
            new ExceptionDialog(exception);
        }

    }

}