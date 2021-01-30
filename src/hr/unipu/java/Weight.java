package hr.unipu.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Weight extends JFrame {

    private JPanel contentPane;
    private JTextField mg;
    private JTextField g;
    private JTextField dag;
    private JTextField kg;
    private JTextField t;
    private JTextField pound;
    private JTextField ounce;
    private JTextField poruka;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Weight frame = new Weight();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Kreiranje prikaza

    public Weight() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPane = new JPanel();
        contentPane.setForeground(Color.black);
        contentPane.setBackground(Color.white);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Gumb za vraćanje na odabir convertera

        JButton JBback = new JButton("Home");
        JBback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ConverterMenu convmen = new ConverterMenu();
                convmen.setVisible(true);
                dispose();
            }
        });
        JBback.setBackground(new Color(255, 216, 1));
        JBback.setForeground(Color.black);
        JBback.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        JBback.setBounds(12, 499, 162, 41);
        contentPane.add(JBback);

        // Naslov convertera

        JLabel labelnaslov = new JLabel("WEIGHT CONVERTER");
        labelnaslov.setHorizontalAlignment(SwingConstants.CENTER);
        labelnaslov.setForeground(Color.black);
        labelnaslov.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        labelnaslov.setBounds(12, 13, 458, 54);
        contentPane.add(labelnaslov);

        // Gumb za izlazak iz aplikacije

        JButton JBexit = new JButton("Exit");
        JBexit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        JBexit.setForeground(Color.black);
        JBexit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JBexit.setBackground(new Color(249, 146, 69));
        JBexit.setBounds(341, 499, 129, 41);
        contentPane.add(JBexit);

        // Gumb za čišćenje prethodnog

        JButton JBclear = new JButton("Clear");
        JBclear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                poruka.setText(null);
                t.setText(null);
                mg.setText(null);
                g.setText(null);
                dag.setText(null);
                kg.setText(null);
                t.setText(null);
                pound.setText(null);
                ounce.setText(null);

            }
        });
        JBclear.setForeground(Color.black);
        JBclear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JBclear.setBackground(new Color(173, 216, 230));
        JBclear.setBounds(200, 499, 129, 41);
        contentPane.add(JBclear);

        // Miligrami

        JButton JBmg = new JButton("Convert");
        JBmg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(mg.getText().isEmpty())
                {
                    poruka.setText("Your input is empty.");
                }
                else
                {
                    poruka.setText(null);
                    double Mg = Double.parseDouble(mg.getText());
                    double Gm = Mg / 1000;
                    double DaG = Mg / 10000;
                    double Kg = Mg / 1000000;
                    double Ton = Mg * 0;
                    double Pou = Mg * 0;
                    double Oun = Mg * 0.00004;
                    String GM = String.format("%.3f", Gm);
                    String DAG = String.format("%.3f", DaG);
                    String KG = String.format("%.3f", Kg);
                    String TON = String.format("%.3f", Ton);
                    String POU = String.format("%.3f", Pou);
                    String OUN = String.format("%.3f", Oun);
                    g.setText(GM);
                    dag.setText(DAG);
                    kg.setText(KG);
                    t.setText(TON);
                    pound.setText(POU);
                    ounce.setText(OUN);
                }
            }
        });
        JBmg.setForeground(Color.black);
        JBmg.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBmg.setBackground(new Color(173, 216, 230));
        JBmg.setBounds(359, 80, 100, 40);
        contentPane.add(JBmg);

        JLabel labelmg = new JLabel("Milligram");
        labelmg.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelmg.setBackground(Color.white);
        labelmg.setForeground(Color.black);
        labelmg.setBounds(20, 80, 107, 40);
        contentPane.add(labelmg);

        mg = new JTextField();
        mg.setHorizontalAlignment(SwingConstants.CENTER);
        mg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        mg.setColumns(10);
        mg.setBounds(139, 80, 147, 40);
        contentPane.add(mg);

        // Grami

        JButton JBg = new JButton("Convert");
        JBg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(g.getText().isEmpty())
                {
                    poruka.setText("Your input is empty.");
                }
                else
                {
                    poruka.setText(null);
                    double Gm = Double.parseDouble(g.getText());
                    double Mg = Gm * 1000;
                    double DaG = Gm / 10;
                    double Kg = Gm / 1000;
                    double Ton = Gm * 0.00001;
                    double Pou = Gm * 0.0022;
                    double Oun = Gm * 0.03527;
                    String MG = String.format("%.3f", Mg);
                    String DAG = String.format("%.3f", DaG);
                    String KG = String.format("%.3f", Kg);
                    String TON = String.format("%.3f", Ton);
                    String POU = String.format("%.3f", Pou);
                    String OUN = String.format("%.3f", Oun);
                    mg.setText(MG);
                    dag.setText(DAG);
                    kg.setText(KG);
                    t.setText(TON);
                    pound.setText(POU);
                    ounce.setText(OUN);
                }
            }
        });
        JBg.setForeground(Color.black);
        JBg.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBg.setBackground(new Color(173, 216, 230));
        JBg.setBounds(359, 124, 100, 40);
        contentPane.add(JBg);

        JLabel labelg = new JLabel("Gram");
        labelg.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelg.setBackground(Color.white);
        labelg.setForeground(Color.black);
        labelg.setBounds(20, 124, 107, 40);
        contentPane.add(labelg);

        g = new JTextField();
        g.setHorizontalAlignment(SwingConstants.CENTER);
        g.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        g.setColumns(10);
        g.setBounds(139, 124, 147, 40);
        contentPane.add(g);


        // Dekagrami

        JButton JBdag = new JButton("Convert");
        JBdag.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(dag.getText().isEmpty())
                {
                    poruka.setText("Your input is empty.");
                }
                else
                {
                    poruka.setText(null);
                    double DaG = Double.parseDouble(dag.getText());
                    double Mg = DaG * 10000;
                    double Gm = DaG * 10;
                    double Kg = DaG / 100;
                    double Ton = DaG * 0.00001;
                    double Pou = DaG * 0.02205;
                    double Oun = DaG * 0.35274;
                    String MG = String.format("%.3f", Mg);
                    String GM = String.format("%.3f", Gm);
                    String KG = String.format("%.3f", Kg);
                    String TON = String.format("%.3f", Ton);
                    String POU = String.format("%.3f", Pou);
                    String OUN = String.format("%.3f", Oun);
                    mg.setText(MG);
                    g.setText(GM);
                    kg.setText(KG);
                    t.setText(TON);
                    pound.setText(POU);
                    ounce.setText(OUN);
                }
            }
        });
        JBdag.setForeground(Color.black);
        JBdag.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBdag.setBackground(new Color(173, 216, 230));
        JBdag.setBounds(359, 169, 100, 40);
        contentPane.add(JBdag);

        JLabel labeldag = new JLabel("Dekagram");
        labeldag.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labeldag.setBackground(Color.white);
        labeldag.setForeground(Color.black);
        labeldag.setBounds(20, 169, 107, 40);
        contentPane.add(labeldag);

        dag = new JTextField();
        dag.setHorizontalAlignment(SwingConstants.CENTER);
        dag.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        dag.setColumns(10);
        dag.setBounds(139, 169, 147, 40);
        contentPane.add(dag);

        // Kilogrami

        JButton JBkg = new JButton("Convert");
        JBkg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(kg.getText().isEmpty())
                {
                    poruka.setText("Your input is empty.");
                }
                else
                {
                    poruka.setText(null);
                    double Kg = Double.parseDouble(kg.getText());
                    double Mg = Kg * 1000000;
                    double Gm = Kg * 1000;
                    double DaG = Kg * 100;
                    double Ton = Kg / 1000;
                    double Pou = Kg * 2.20462;
                    double Oun = Kg * 35.27396;
                    String MG = String.format("%.3f", Mg);
                    String GM = String.format("%.3f", Gm);
                    String DAG = String.format("%.3f", DaG);
                    String TON = String.format("%.3f", Ton);
                    String POU = String.format("%.3f", Pou);
                    String OUN = String.format("%.3f", Oun);
                    mg.setText(MG);
                    g.setText(GM);
                    dag.setText(DAG);
                    t.setText(TON);
                    pound.setText(POU);
                    ounce.setText(OUN);

                }
            }
        });
        JBkg.setForeground(Color.black);
        JBkg.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBkg.setBackground(new Color(173, 216, 230));
        JBkg.setBounds(359, 213, 100, 40);
        contentPane.add(JBkg);

        JLabel labelkg = new JLabel("Kilogram");
        labelkg.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelkg.setBackground(Color.white);
        labelkg.setForeground(Color.black);
        labelkg.setBounds(20, 213, 107, 40);
        contentPane.add(labelkg);

        kg = new JTextField();
        kg.setHorizontalAlignment(SwingConstants.CENTER);
        kg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        kg.setColumns(10);
        kg.setBounds(139, 213, 147, 40);
        contentPane.add(kg);

        // Tone (metričke)

        JButton JBt = new JButton("Convert");
        JBt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(t.getText().isEmpty())
                {
                    poruka.setText("Your input is empty.");
                }
                else
                {
                    poruka.setText(null);
                    double Ton = Double.parseDouble(t.getText());
                    double Mg = Ton * 1000000000;
                    double Gm = Ton * 1000000;
                    double DaG = Ton * 100000;
                    double Kg = Ton * 1000;
                    double Pou = Ton * 2204.62262;
                    double Oun = Ton * 35273.96195;
                    String MG = String.format("%.3f", Mg);
                    String GM = String.format("%.3f", Gm);
                    String DAG = String.format("%.3f", DaG);
                    String KG = String.format("%.3f", Kg);
                    String POU = String.format("%.3f", Pou);
                    String OUN = String.format("%.3f", Oun);
                    mg.setText(MG);
                    g.setText(GM);
                    dag.setText(DAG);
                    kg.setText(KG);
                    pound.setText(POU);
                    ounce.setText(OUN);
                }
            }
        });
        JBt.setForeground(Color.black);
        JBt.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBt.setBackground(new Color(173, 216, 230));
        JBt.setBounds(359, 260, 100, 40);
        contentPane.add(JBt);

        JLabel labelt = new JLabel("Tonne");
        labelt.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelt.setBackground(Color.white);
        labelt.setForeground(Color.black);
        labelt.setBounds(20, 260, 107, 40);
        contentPane.add(labelt);

        t = new JTextField();
        t.setHorizontalAlignment(SwingConstants.CENTER);
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setColumns(10);
        t.setBounds(139, 260, 147, 40);
        contentPane.add(t);

        // Pounds

        JButton JBlb = new JButton("Convert");
        JBlb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(pound.getText().isEmpty())
                {
                    poruka.setText("Your input is empty.");
                }
                else
                {
                    double Pou = Double.parseDouble(pound.getText());
                    double Mg = Pou * 453592.37;
                    double Gm = Pou * 453.59237;
                    double DaG = Pou * 45.35924;
                    double Kg = Pou * 0.45359;
                    double Ton = Pou * 0.00045;
                    double Oun = Pou * 16;
                    String MG = String.format("%.3f", Mg);
                    String GM = String.format("%.3f", Gm);
                    String DAG = String.format("%.3f", DaG);
                    String KG = String.format("%.3f", Kg);
                    String TON = String.format("%.3f", Ton);
                    String OUN = String.format("%.3f", Oun);
                    mg.setText(MG);
                    g.setText(GM);
                    dag.setText(DAG);
                    kg.setText(KG);
                    t.setText(TON);
                    ounce.setText(OUN);

                }
            }
        });
        JBlb.setForeground(Color.black);
        JBlb.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBlb.setBackground(new Color(173, 216, 230));
        JBlb.setBounds(359, 304, 100, 40);
        contentPane.add(JBlb);

        JLabel labellb = new JLabel("Pounds");
        labellb.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labellb.setBackground(Color.white);
        labellb.setForeground(Color.black);
        labellb.setBounds(20, 304, 107, 40);
        contentPane.add(labellb);

        pound = new JTextField();
        pound.setHorizontalAlignment(SwingConstants.CENTER);
        pound.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        pound.setColumns(10);
        pound.setBounds(139, 304, 147, 40);
        contentPane.add(pound);

        // Ounce

        JButton JBon = new JButton("Convert");
        JBon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(ounce.getText().isEmpty())
                {
                    poruka.setText("Your input is empty.");
                }
                else
                {
                    double Oun = Double.parseDouble(ounce.getText());
                    double Mg = Oun * 28349.52312;
                    double Gm = Oun * 28.34952;
                    double DaG = Oun * 2.83495;
                    double Kg = Oun * 0.02835;
                    double Ton = Oun * 0.00003;
                    double Pou = Oun * 0.06614;
                    String MG = String.format("%.3f", Mg);
                    String GM = String.format("%.3f", Gm);
                    String DAG = String.format("%.3f", DaG);
                    String KG = String.format("%.3f", Kg);
                    String TON = String.format("%.3f", Ton);
                    String POU = String.format("%.3f", Pou);
                    mg.setText(MG);
                    g.setText(GM);
                    dag.setText(DAG);
                    kg.setText(KG);
                    t.setText(TON);
                    pound.setText(POU);
                }
            }
        });
        JBon.setForeground(Color.black);
        JBon.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBon.setBackground(new Color(173, 216, 230));
        JBon.setBounds(359, 349, 100, 40);
        contentPane.add(JBon);

        JLabel labelon = new JLabel("Ounce");
        labelon.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelon.setBackground(Color.white);
        labelon.setForeground(Color.black);
        labelon.setBounds(20, 349, 107, 40);
        contentPane.add(labelon);

        ounce = new JTextField();
        ounce.setHorizontalAlignment(SwingConstants.CENTER);
        ounce.setFont(new Font("TImes New Roman", Font.PLAIN, 20));
        ounce.setColumns(10);
        ounce.setBounds(139, 349, 147, 40);
        contentPane.add(ounce);

        // Poruka ako niti jedno nije napisano

        poruka = new JTextField();
        poruka.setHorizontalAlignment(SwingConstants.CENTER);
        poruka.setBackground(Color.white);
        poruka.setForeground(Color.black);
        poruka.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        poruka.setBounds(20, 446, 439, 40);
        contentPane.add(poruka);
        poruka.setColumns(10);
    }
}