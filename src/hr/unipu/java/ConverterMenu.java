package hr.unipu.java;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConverterMenu extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConverterMenu frame = new ConverterMenu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Kreiranje prikaza

    public ConverterMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPane = new JPanel();
        contentPane.setForeground(Color.black);
        contentPane.setBackground(Color.white);
        contentPane.setBorder(UIManager.getBorder("Button.border"));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Naslov

        JLabel OdabirConvertera = new JLabel("CONVERTERS");
        OdabirConvertera.setForeground(Color.black);
        OdabirConvertera.setHorizontalAlignment(SwingConstants.CENTER);
        OdabirConvertera.setFont(new Font("Times New Roman", Font.BOLD, 30));
        OdabirConvertera.setBounds(12, 13, 441, 79);
        contentPane.add(OdabirConvertera);

        // Button za duljinu

        JButton duljina = new JButton("DISTANCE");
        duljina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Distance duljina = new Distance();
                duljina.setVisible(true);
                dispose();
            }
        });
        duljina.setBackground(new Color(173,216,230));
        duljina.setForeground(Color.black);
        duljina.setIcon(null);
        duljina.setFont(new Font("Times New Roman", Font.BOLD, 20));
        duljina.setBounds(100, 100, 250, 50);
        contentPane.add(duljina);

        // Button za težinu

        JButton tezina = new JButton("WEIGHT");
        tezina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Weight tezina = new Weight();
                tezina.setVisible(true);
                dispose();
            }
        });
        tezina.setBackground(new Color(173,216,230));
        tezina.setForeground(Color.black);
        tezina.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tezina.setBounds(100, 200, 250, 50);
        contentPane.add(tezina);

        // Button za vrijeme

        JButton vrijeme = new JButton("TIME");
        vrijeme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Time vrijeme = new Time();
                vrijeme.setVisible(true);
                dispose();
            }
        });
        vrijeme.setBackground(new Color(173,216,230));
        vrijeme.setForeground(Color.black);
        vrijeme.setFont(new Font("Times New Roman", Font.BOLD, 20));
        vrijeme.setBounds(100, 300, 250, 50);
        contentPane.add(vrijeme);

        // button za vraćenje na glavni odabir

        JButton Back = new JButton("Home");
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainMenu mainmenu = new MainMenu();
                mainmenu.setVisible(true);
                dispose();
            }
        });
        Back.setBackground(new Color(255,216,1));
        Back.setForeground(Color.black);
        Back.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        Back.setBounds(12, 499, 162, 41);
        contentPane.add(Back);

        // Button za izlazak iz aplikacije

        JButton JBexit = new JButton("Exit");
        JBexit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        JBexit.setForeground(Color.black);
        JBexit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        JBexit.setBackground(new Color(173,216,230));
        JBexit.setBounds(318,507, 135, 33);
        contentPane.add(JBexit);
    }
}
