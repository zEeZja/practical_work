package prac22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator extends JFrame {
    private final JTextField displayField;
    private final StringBuilder inputBuffer;
    private final RPNCalculator rpnCalculator;

    public MyCalculator() {
        setTitle("MyCalculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "+", "=",
                "C"
        };

        inputBuffer = new StringBuilder();
        rpnCalculator = new RPNCalculator();

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) {
                try {
                    double result = rpnCalculator.calculate(inputBuffer.toString().split("\\s+"));
                    displayField.setText(Double.toString(result));
                } catch (Exception ex) {
                    displayField.setText("Error");
                } finally {
                    inputBuffer.setLength(0);
                }
            } else if (buttonText.equals("C")) {
                inputBuffer.setLength(0);
                displayField.setText("");
            } else {
                inputBuffer.append(buttonText).append(" ");
                displayField.setText(inputBuffer.toString());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyCalculator calculator = new MyCalculator();
            calculator.setSize(250, 400);
            calculator.setLocationRelativeTo(null);
            calculator.setVisible(true);
        });
    }
}
