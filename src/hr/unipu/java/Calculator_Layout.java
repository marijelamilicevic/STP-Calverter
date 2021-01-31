package hr.unipu.java;

import sun.applet.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class Calculator_Layout {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    private JPanel Calculator_Layout;
    private JTextField textDisplay;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnDot;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnBack;

    public void getOperator (String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public Calculator_Layout() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);

            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);

            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);

            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);

            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);

            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);

            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);

            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);

            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);

            }
        });

        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                }
                else if(textDisplay.getText().contains(".")){
                    btnDot.setEnabled(false);
                }
                else{
                    String btnDotText = textDisplay.getText() + btnDot.getText();
                    textDisplay.setText(btnDotText);
                }
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textDisplay.getText());
                        break;
                }


                textDisplay.setText(Double.toString(total2));
                total1 = 0.0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0.0;
                textDisplay.setText("");
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });

        //Button za nazad
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                try {
                    dispose();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator_Layout");
        frame.setContentPane(new Calculator_Layout().Calculator_Layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void setVisible(boolean b) {
    }
}
