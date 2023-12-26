/*
 * Copyright (c) 2023 Benjamin Wagner
 */

package core;

import javax.swing.*;

public class AuthenticationSuccess  extends RuntimeException {

    public  AuthenticationSuccess(String message) {
        super(message);
        new ExceptionDialog(message, JOptionPane.INFORMATION_MESSAGE);
    }

}
