package core;

import javax.swing.*;
import java.util.ArrayList;

public class Bootstrap extends JFrame {

    private final Integer[] numbers = new Integer[5];

    public Bootstrap() {
        init();
        System.out.println(numbers[4]);
    }

    private void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
