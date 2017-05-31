package src.beginnig.calculators;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Calculator extends JFrame{

    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
//    public static CalcKeys c;

    private static JTextField enterTextField = new JTextField(10);

    private static JButton sevenB, eightB, nineB, divideB, fourB, fiveB, sixB, multiplyB,
            oneB, twoB, threeB, subtractB, zeroB, dotB, equalsB, addB;

            java.util.List<Integer> CALCULATOR_BUTTONS = Arrays.asList(
                    KeyEvent.VK_0,
                    KeyEvent.VK_1,
                    KeyEvent.VK_2,
                    KeyEvent.VK_3,
                    KeyEvent.VK_4,
                    KeyEvent.VK_5,
                    KeyEvent.VK_6,
                    KeyEvent.VK_7,
                    KeyEvent.VK_8,
                    KeyEvent.VK_9,
                    KeyEvent.VK_PLUS,
                    KeyEvent.VK_MINUS,
                    KeyEvent.VK_MULTIPLY,
                    KeyEvent.VK_DIVIDE,
                    KeyEvent.VK_EQUALS
    );

//    JLabel label = new JLabel("Calculator");

    public Calculator() {
        JPanel panel = new JPanel();
        setTitle("Calculator");
        setSize(WIDTH, HEIGHT);
//        setMinimumSize(new Dimension(WIDTH, HEIGHT));
        setResizable(false);

        setLayout(new GridLayout(5, 5));

        enterTextField = new JTextField(70);
        enterTextField.setFont(new Font("Times New Roman", Font.PLAIN, 38));

        enterTextField.setEditable(false);
        panel.setSize(500, 150);

        sevenB = new JButton("7");
        eightB = new JButton("8");
        nineB = new JButton("9");
        divideB = new JButton("/");
        fourB = new JButton("4");
        fiveB = new JButton("5");
        sixB = new JButton("6");
        multiplyB = new JButton("*");
        oneB = new JButton("1");
        twoB = new JButton("2");
        threeB = new JButton("3");
        subtractB = new JButton("-");
        zeroB = new JButton("0");
        dotB = new JButton(".");
        equalsB = new JButton("=");
        addB = new JButton("+");

        MyActionListener myActionListener = new MyActionListener();
        KeybordListener keybordListener = new KeybordListener();

        oneB.setActionCommand("1");
        oneB.addActionListener(myActionListener);
        oneB.addKeyListener(keybordListener);
        twoB.setActionCommand("2");
        twoB.addActionListener(myActionListener);
//        twoB.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent keyEvent) {
//                System.out.println("herre");
//            }
//        });
        threeB.setActionCommand("3");
        threeB.addActionListener(myActionListener);
        fourB.setActionCommand("4");
        fourB.addActionListener(myActionListener);
        fiveB.setActionCommand("5");
        fiveB.addActionListener(myActionListener);
        sixB.setActionCommand("6");
        sixB.addActionListener(myActionListener);
        sevenB.setActionCommand("7");
        sevenB.addActionListener(myActionListener);
        eightB.setActionCommand("8");
        eightB.addActionListener(myActionListener);
        nineB.setActionCommand("9");
        nineB.addActionListener(myActionListener);
        zeroB.setActionCommand("0");
        zeroB.addActionListener(myActionListener);
        dotB.setActionCommand(".");
        dotB.addActionListener(myActionListener);
        divideB.setActionCommand("/");
        divideB.addActionListener(myActionListener);
        multiplyB.setActionCommand("*");
        multiplyB.addActionListener(myActionListener);
        equalsB.setActionCommand("=");
        equalsB.addActionListener(myActionListener);
        addB.setActionCommand("+");
        addB.addActionListener(myActionListener);
        subtractB.setActionCommand("-");
        subtractB.addActionListener(myActionListener);


        add(sevenB);
        add(eightB);
        add(nineB);
        add(divideB);
        add(fourB);
        add(fiveB);
        add(sixB);
        add(multiplyB);
        add(oneB);
        add(twoB);
        add(threeB);
        add(subtractB);
        add(zeroB);
        add(dotB);
        add(equalsB);
        add(addB);
        add(enterTextField);
        //setContentPane(panel);
        //pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
        //Calculator c = new Calculator();
        //CalcKeys ck = new CalcKeys();
    }

    class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //StringBuffer
            if(e.getActionCommand().equals("1")){
                enterTextField.setText("1");
            }else if (e.getActionCommand().equals("2")){
                enterTextField.setText("2");
            }else if (e.getActionCommand().equals("3")){
                enterTextField.setText("3");
            }else if (e.getActionCommand().equals("4")){
                enterTextField.setText("4");
            }else if (e.getActionCommand().equals("5")){
                enterTextField.setText("5");
            }else if (e.getActionCommand().equals("6")){
                enterTextField.setText("6");
            }else if (e.getActionCommand().equals("7")){
                enterTextField.setText("7");
            }else if (e.getActionCommand().equals("8")){
                enterTextField.setText("8");
            }else if (e.getActionCommand().equals("9")){
                enterTextField.setText("9");
            }else if (e.getActionCommand().equals("0")){
                enterTextField.setText("0");
            }else if (e.getActionCommand().equals("+")){
                enterTextField.setText("+");
            }else if (e.getActionCommand().equals("-")){
                enterTextField.setText("-");
            }else if (e.getActionCommand().equals("*")){
                enterTextField.setText("*");
            }else if (e.getActionCommand().equals("/")){
                enterTextField.setText("/");
            }else if (e.getActionCommand().equals(".")){
                enterTextField.setText(".");
            }else{
                enterTextField.setText("=");
            }
        }
    }

    private class KeybordListener extends KeyAdapter {

        public void keyPressed(KeyEvent kEvent) { // обработка нажатий на клавишы
            int key = kEvent.getKeyCode(); // каждая наша клавиша соответствует какому-то коду

            String input = enterTextField.getText();
            if(CALCULATOR_BUTTONS.contains(key) && key == (int) input.charAt(input.length() - 1)){
                enterTextField.setText(String.valueOf((char)key));
            }

        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {

        }
    }
}
