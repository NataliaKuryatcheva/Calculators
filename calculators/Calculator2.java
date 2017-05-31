package src.beginnig.calculators;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator2 {
    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() { // используем для того, чтобы запустить наш калькулятор
//            public void run() {
                CalculatorFrame frame = new CalculatorFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
//            }
//        });
    }
}
class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("Calculator"); // задаём имя окна
        CalculatorPanel panel = new CalculatorPanel(); // внутренне "окошко"
        add(panel);
        pack();
    }
}
class CalculatorPanel extends JPanel {
    public CalculatorPanel() {
        setLayout(new BorderLayout()); // используем "паттерн", задаём вид калькулятору

        result = 0;
        lastCommand = "=";
        start = true;

        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
//        panel.setFont(new Font("Times New Roman", Font.PLAIN, 38));

        // делаем кнопки

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);

        // разположим все кнопки в центре(под полем вывода)
        add(panel, BorderLayout.CENTER);
    }
    private void addButton(String label, ActionListener listener) { // метод по добавлению кнопок
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }
    private class InsertAction implements ActionListener { // класс для проверки того, на какую кнопку мы нажимаем
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand(); // проверка того, какая последняя кнопка(цифра) была нажата
            if(start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }
    private class CommandAction implements ActionListener { // команда(=, +, -, *, /)
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            if(start) {
                if(command.equals("-")) {
                    display.setText(command);
                    start = false;
                }
                else lastCommand = command;
            } else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start=true;
            }
        }
    }

    //
    public void calculate(double x) {
        if(lastCommand.equals("+")) result += x;
        else if(lastCommand.equals("-")) result -= x;
        else if(lastCommand.equals("*")) result *= x;
        else if(lastCommand.equals("/")) result /= x;
        else if(lastCommand.equals("=")) result = x;
        display.setText("" + result);
    }

    // нужные нам переменные

    private JButton display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;
}