/*
 * Copyright (c) 2023 Benjamin Wagner
 */

package view;

import javax.swing.*;

public abstract class AbstractView extends JPanel {

    protected JFrame frame;

    public AbstractView(JFrame frame) {
        this.frame = frame;
    }

}
