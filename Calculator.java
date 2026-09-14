import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.FlowLayout;

public class Calculator {

    public static void main(String[] args){
        String input1 = "0";
        String input2 = "0";
        String currentInput = "0";
        String result = "0";

        // 1. Create the main window frame for the calculator
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new FlowLayout()); // Arranges components linearly

        //Create the display for the calculator
        JTextField display = new JTextField("0");
        display.setPreferredSize(new Dimension(250,30));
        display.setHorizontalAlignment(JTextField.RIGHT);

        // 2. Create the JButtons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");


        // 3. Add behavior using a lambda expression (Action Listener)
        button1.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "1");
        });
         button2.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "2");
        });
        button3.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "3");
        });
         button4.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "4");
        });
        button5.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "5");
        });
         button6.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "6");
        });
        button7.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "7");
        });
         button8.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "8");
        });
        button9.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "9");
        });
         button0.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "0");
        });

        // 4. Add everything to the frame
        frame.add(display);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);
        frame.setLocationRelativeTo(null); // Centers window
        frame.setVisible(true);
    }


    
}
