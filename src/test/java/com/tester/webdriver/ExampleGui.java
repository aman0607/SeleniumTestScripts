package com.tester.webdriver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by asingh on 1/31/18.
 */
public class ExampleGui extends JFrame {

    public ExampleGui() {
        setTitle("GUI Example to Compute Salary");
        setSize(500,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //input & output
        JLabel hourlyWage = new JLabel("Hourly Wage");
        JLabel numHours = new JLabel("Total Number of Hours");
        JLabel overtime = new JLabel("Overtime Hours");
        final JTextField wageEntry = new JTextField(10);
        final JTextField hoursEntry = new JTextField(10);
        final JTextField overtimeEntry = new JTextField(10);
        final JTextField salaryResult = new JTextField(10);
        JLabel salary = new JLabel("Salary");
        salaryResult.setBackground(Color.yellow);
        salaryResult.setEditable(false);

        //buttons
        JButton calculateBtn = new JButton("Compute");

        //add to GUI
        add(numHours);
        add(hoursEntry);
        add(hourlyWage);
        add(wageEntry);
        add(overtime);
        add(overtimeEntry);
        add(salary);
        add(salaryResult);
        add(calculateBtn);
        setVisible(true);

        class actListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {

                double hourlyWage = Double.parseDouble(wageEntry.getText());
                int numHours = Integer.parseInt(hoursEntry.getText());
                int overtimeHours = 0;
                try {
                    overtimeHours = Integer.parseInt(overtimeEntry.getText());
                } catch(NumberFormatException e) {
                    System.out.println("No Overtime Hours");
                }
                if(numHours < 40) {

                    overtimeHours = 0;
                    System.out.println("Under 40 total hours worked so no overtime is permitted");
                } else if(numHours > 40) {
                    numHours = 40;
                }
                double salary = ((hourlyWage * (1.5 * overtimeHours))* numHours);
                salaryResult.setText(String.format("%.2f", salary));
            }
        }
        actListener listen = new actListener();
        calculateBtn.addActionListener(listen);
    }

    public static void main(String[] args) {
        ExampleGui obj = new ExampleGui();
    }
}


