import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculator {
    int boardwidth = 360;
    int boardHeight = 540;

    JFrame frame = new JFrame("Calculator");

    Calculator(){
        frame.setVisible(true);
        frame.setSize(boardwidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

    }
}
