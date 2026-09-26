import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
public class Calculator {

    public static String input1 = "0";
    public static String input2 = "0";
    public static String currentInput = "0";
    public static String result = "0";
    public static int frameWidth = 400;
    public static int frameHeight = 600;
    public static int buttonPresses = 0;

        public static void concatInput(String num){
            if(buttonPresses > 0){
                currentInput = currentInput + num;
            }else
                currentInput = num;
            }

    public static void main(String[] args){

        // 1. Create the main window frame for the calculator
        JFrame frame = new JFrame("Calculator");
        frame.setSize(frameWidth, frameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame.setLayout(null);


        //Create Display for calculator
        JLabel display = new JLabel();
        display.setVerticalTextPosition(JLabel.TOP);
        display.setHorizontalTextPosition(JLabel.CENTER);
        display.setText(currentInput);
        display.setBackground(Color.BLACK);
        display.setOpaque(true);
        display.setBounds(0,0,frameWidth - 50,frameHeight - 50);

        /*Create the display for the calculator
        JTextField display = new JTextField("0");
        display.setPreferredSize(new Dimension(250,30));
        display.setHorizontalAlignment(JTextField.RIGHT);
        */

       JPanel displayPanel = new JPanel();
       displayPanel.setBounds(25,0,frameWidth - 25,25);
       displayPanel.setBackground(Color.RED);

       JPanel buttonPanel = new JPanel();
       buttonPanel.setBounds(25,25,frameWidth - 25,frameHeight);
       buttonPanel.setBackground(Color.blue);

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
            concatInput("1");
            display.setText(currentInput);
            buttonPresses++;
        });
         button2.addActionListener(e -> {
            concatInput("2");
            display.setText(currentInput);
            buttonPresses++;
        });
        button3.addActionListener(e -> {
            concatInput("3");
            display.setText(currentInput);
            buttonPresses++;        
        });
         button4.addActionListener(e -> {
            concatInput("4");
            display.setText(currentInput);
            buttonPresses++;        
        });
        button5.addActionListener(e -> {
            concatInput("5");
            display.setText(currentInput);
            buttonPresses++;        
        });
         button6.addActionListener(e -> {
            concatInput("6");
            display.setText(currentInput);
            buttonPresses++;        
        });
        button7.addActionListener(e -> {
            concatInput("7");
            display.setText(currentInput);
            buttonPresses++;        
        });
         button8.addActionListener(e -> {
            concatInput("8");
            display.setText(currentInput);
            buttonPresses++;        
        });
        button9.addActionListener(e -> {
            concatInput("9");
            display.setText(currentInput);
            buttonPresses++;        
        });
         button0.addActionListener(e -> {
            concatInput("0");
            display.setText(currentInput);
            buttonPresses++;        
        });

        // 4. Add everything to the frame
        displayPanel.add(display);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(button0);
        frame.add(displayPanel);
        frame.add(buttonPanel);
        frame.setLocationRelativeTo(null); // Centers window
        frame.setVisible(true);
    }



    
}
