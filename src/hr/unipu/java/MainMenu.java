package hr.unipu.java;

import com.sun.javafx.scene.control.skin.ColorPalette;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainMenu frame = new MainMenu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Kreiranje prikaza

    public MainMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPane = new JPanel();
        contentPane.setForeground(Color.black);
        contentPane.setBackground(Color.white);
        contentPane.setBorder(UIManager.getBorder("Button.border"));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel početna = new JLabel("Welcome to CALVERTER!");
        početna.setForeground(new Color(173,216,230));
        početna.setHorizontalAlignment(SwingConstants.CENTER);
        početna.setFont(new Font("Times New Roman", Font.BOLD, 30));
        početna.setBounds(22, 23, 453, 80);
        contentPane.add(početna);


        //Ovaj tu treba rijesiti
        JButton calculator = new JButton("Calculator");
        calculator.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calculator_Layout calculator = new Calculator_Layout();

                //Ovo treba namjestiti
                //calculator.setVisible(true);
                dispose();
            }
        });
        calculator.setBackground(new Color(173,216,230));
        calculator.setForeground(Color.black);
        calculator.setIcon(null);
        calculator.setFont(new Font("Times New Roman", Font.BOLD, 20));
        calculator.setBounds(100, 100, 250, 50);
        contentPane.add(calculator);

        JButton converter = new JButton("Converter");
        converter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ConverterMenu converter = new ConverterMenu();
                converter.setVisible(true);
                dispose();
            }
        });
        converter.setBackground(new Color(173,216,230));
        converter.setForeground(Color.black);
        converter.setHorizontalAlignment(SwingConstants.CENTER);
        converter.setVerticalAlignment(SwingConstants.CENTER);
        converter.setFont(new Font("Times New Roman", Font.BOLD, 20));
        converter.setBounds(100, 200, 250, 50);
        contentPane.add(converter);

        JButton button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        button.setForeground(Color.black);
        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button.setBackground(new Color(255,216,1));
        button.setBounds(318,507, 135, 33);
        contentPane.add(button);
    }
}