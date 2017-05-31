package src.beginnig.calculators;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotherCalculator extends JFrame {

    int firstValue = 0;
    String operation = "+";

    AnotherCalculator() {
        JTextField display = this.display;
        setBounds(300, 300, 400, 400); //указывает координаты верхней левой вершины окна, а так же его ширину и высоту
        setLayout(new BorderLayout()); //BorderLayout используется при отображении не более 5 элементов
        this.display.setFont(new Font("Times New Roman", Font.PLAIN, 38));

        add(this.display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(buttonEquals, BorderLayout.SOUTH);
        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonSum);
        buttonPanel.add(buttonSub);
        buttonPanel.add(buttonMul);
        buttonPanel.add(buttonBack);
        buttonPanel.add(buttonDivide);

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnotherCalculator.this.display.setText(AnotherCalculator.this.display.getText() + "0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnotherCalculator.this.display.setText(AnotherCalculator.this.display.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnotherCalculator.this.display.setText(AnotherCalculator.this.display.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnotherCalculator.this.display.setText(AnotherCalculator.this.display.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnotherCalculator.this.display.setText(AnotherCalculator.this.display.getText() + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnotherCalculator.this.display.setText(AnotherCalculator.this.display.getText() + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnotherCalculator.this.display.setText(AnotherCalculator.this.display.getText() + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnotherCalculator.this.display.setText(AnotherCalculator.this.display.getText() + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnotherCalculator.this.display.setText(AnotherCalculator.this.display.getText() + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AnotherCalculator.this.display.setText(AnotherCalculator.this.display.getText() + "9");
            }
        });

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String tmp = AnotherCalculator.this.display.getText();
                AnotherCalculator.this.display.setText(tmp.substring(0, tmp.length() - 1));
            }
        });

        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstValue = Integer.valueOf(AnotherCalculator.this.display.getText());
                AnotherCalculator.this.display.setText("");
                operation = "+";
            }
        });

        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstValue = Integer.valueOf(AnotherCalculator.this.display.getText());
                AnotherCalculator.this.display.setText("");
                operation = "*";
            }
        });

        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstValue = Integer.valueOf(AnotherCalculator.this.display.getText());
                AnotherCalculator.this.display.setText("");
                operation = "/";
            }
        });

        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstValue = Integer.valueOf(AnotherCalculator.this.display.getText());
                AnotherCalculator.this.display.setText("");
                operation = "-";
            }
        });

        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int secondValue = Integer.valueOf(AnotherCalculator.this.display.getText());

                if ("+".equals(operation)) {
                    AnotherCalculator.this.display.setText((firstValue + secondValue) + "");
                }
                if ("-".equals(operation)) {
                    AnotherCalculator.this.display.setText((firstValue - secondValue) + "");
                }
                if ("*".equals(operation)) {
                    AnotherCalculator.this.display.setText((firstValue * secondValue) + "");
                }
                if ("/".equals(operation)) {
                    AnotherCalculator.this.display.setText((firstValue / secondValue) + "");
                }

                firstValue = 0;
                operation = "+";
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    JTextField display = new JTextField(); // экран калькулятора
    JPanel buttonPanel = new JPanel(new GridLayout(3, 5)); // панель с кнопками
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonSum = new JButton("+");
    JButton buttonDivide = new JButton("/");
    JButton buttonSub = new JButton("-");
    JButton buttonMul = new JButton("*");
    JButton buttonBack = new JButton("C");
    JButton buttonEquals = new JButton("=");

    public static void main(String[] args) {
        new AnotherCalculator();
    }
}
