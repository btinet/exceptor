/*
 * Copyright (c) 2023 Benjamin Wagner
 */

package view;

import core.AuthenticationException;
import core.ExceptionDialog;
import core.UserNotFoundException;

import javax.swing.*;

public class MainView extends AbstractView {

    static Integer index = 0;
    private final JButton testButton = new JButton("Test");
    private final JLabel testLabel = new JLabel();
    private final JLabel indexLabel = new JLabel("Index: " + index);
    public MainView(JFrame frame) {
        super(frame);

        testButton.addActionListener(e -> {
            try {
                onClick();
            } catch (Exception ex) {
                testLabel.setText("Fach ist leer");
                new ExceptionDialog(ex);
            } finally {
                index++;
                indexLabel.setText("Index: " + index);
            }
        });

        add(testButton);
        add(testLabel);
        add(indexLabel);
    }

    public void onClick() {
        Integer[] numbers = new Integer[5];
        numbers[4] = 5;

        if (null == numbers[index]) throw new UserNotFoundException();
        if (5 == numbers[index]) throw new AuthenticationException();

        testLabel.setText("Fach ist " + numbers[index]);
    }
}
