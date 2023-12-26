/*
 * Copyright (c) 2023 Benjamin Wagner
 */

package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public abstract class AbstractView extends JPanel {

    protected JFrame frame;

    public AbstractView(JFrame frame) {
        this.frame = frame;
        setBorder(new EmptyBorder(5,5,5,5));
        setLayout(new BorderLayout());
    }

    public JFrame getFrame() {
        return frame;
    }

}
