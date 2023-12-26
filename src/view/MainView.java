/*
 * Copyright (c) 2023 Benjamin Wagner
 */

package view;


import core.ExceptionDialog;
import core.UserNotFoundException;

import javax.swing.*;
import java.awt.*;

public class MainView extends AbstractView {

    static Integer index = 0;
    final static String BUTTON_PANEL = "Card with JButtons";
    final static String TEXT_PANEL = "Card with JTextField";

    JPanel comboBoxPane = new JPanel();
    String[] comboBoxItems = { BUTTON_PANEL, TEXT_PANEL };
    JComboBox<String> cb = new JComboBox<>(comboBoxItems);
    JPanel cards;
    private final JLabel testLabel = new JLabel("TestLabel");

    public MainView(JFrame frame) {
        super(frame);

        cb.setEditable(false);
        cb.addItemListener(e -> {
            CardLayout cl = (CardLayout)(cards.getLayout());
            cl.show(cards, (String)e.getItem());
        });


        comboBoxPane.add(cb);

        JButton testButton = new JButton("Test");
        testButton.addActionListener(e -> onClick());

        add(comboBoxPane, BorderLayout.PAGE_START);

        JPanel card1 = new JPanel();
        card1.add(new JButton("A"));
        card1.add(new JButton("B"));
        card1.add(new JButton("C"));
        card1.add(testButton);
        JPanel card2 = new JPanel();
        card2.add(testLabel,BorderLayout.CENTER);

        cards = new JPanel(new CardLayout());
        cards.add(card1, BUTTON_PANEL);
        cards.add(card2, TEXT_PANEL);
        add(cards,BorderLayout.CENTER);
    }

    public void onClick() {
        Integer[] numbers = new Integer[5];
        numbers[4] = 5;
        index++;
        testLabel.setText("Fach ist " + numbers[index]);

        if (null == numbers[index]) throw new UserNotFoundException();
        if (5 == numbers[index]) new ExceptionDialog("Login erfolgreich", JOptionPane.INFORMATION_MESSAGE);

    }
}
