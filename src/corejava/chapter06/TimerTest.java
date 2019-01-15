package corejava.chapter06;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class TimerTest {
    public static void main(String[] args) {
//        ActionListener listener = new TimePrinter();
//
//        Timer t = new Timer(2000, listener);
//        t.start();
        repeat("GUGUUG", 10);
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);


    }

    public static void repeat(String text, int count) {
        for (int i = 0; i < count; i++) {
            ActionListener listener = event -> {
                System.out.println(text);
            };
            new Timer(2000, listener).start();

        }

    }


}


class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}