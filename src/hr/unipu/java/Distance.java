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

public class Distance extends JFrame {

    private JPanel contentPane;
    private JTextField mm;
    private JTextField cm;
    private JTextField dm;
    private JTextField m;
    private JTextField km;
    private JTextField mile;
    private JTextField inch;
    private JTextField feet;
    private JTextField poruka;

    // Pokretanje aplikacije

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Distance frame = new Distance();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Kreiranje prikaza

    public Distance() {
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

        JLabel labelnaslov = new JLabel("DISTANCE CONVERTER");
        labelnaslov.setHorizontalAlignment(SwingConstants.CENTER);
        labelnaslov.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        labelnaslov.setForeground(Color.black);
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
        JBexit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        JBexit.setBackground(new Color(249, 146, 69));
        JBexit.setBounds(341, 499, 129, 41);
        contentPane.add(JBexit);

        // Gumb za čišćenje prethodnog

        JButton JBclear = new JButton("Clear");
        JBclear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                poruka.setText(null);
                mm.setText(null);
                cm.setText(null);
                dm.setText(null);
                m.setText(null);
                km.setText(null);
                mile.setText(null);
                inch.setText(null);
                feet.setText(null);

            }
        });
        JBclear.setForeground(Color.black);
        JBclear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        JBclear.setBackground(new Color(173, 216, 230));
        JBclear.setBounds(200, 499, 129, 41);
        contentPane.add(JBclear);

        // Milimetri

        JButton JBmm = new JButton("Convert");
        JBmm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (mm.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double MM = Double.parseDouble(mm.getText());
                    double CM = MM / 10;
                    double DM = CM / 10;
                    double M = DM / 10;
                    double KM = M / 1000;
                    double ML = KM / 1.609;
                    double FT = ML * 5280;
                    double INCH = FT / 12;

                    String cM = String.format("%.3f", CM);
                    String dM = String.format("%.3f", DM);
                    String Mt = String.format("%.3f", M);
                    String kM = String.format("%.3f", KM);
                    String mL = String.format("%.3f", ML);
                    String fT = String.format("%.3f", FT);
                    String inCH = String.format("%.3f", INCH);

                    cm.setText(cM);
                    dm.setText(dM);
                    m.setText(Mt);
                    km.setText(kM);
                    mile.setText(mL);
                    feet.setText(fT);
                    inch.setText(inCH);


                }
            }
        });
        JBmm.setForeground(Color.black);
        JBmm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBmm.setBackground(new Color(173, 216, 230));
        JBmm.setBounds(359, 80, 100, 40);
        contentPane.add(JBmm);

        JLabel labelmm = new JLabel("Millimeter");
        labelmm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelmm.setBackground(Color.white);
        labelmm.setForeground(Color.black);
        labelmm.setBounds(20, 80, 107, 40);
        contentPane.add(labelmm);

        mm = new JTextField();
        mm.setHorizontalAlignment(SwingConstants.CENTER);
        mm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        mm.setBounds(139, 80, 147, 40);
        contentPane.add(mm);
        mm.setColumns(10);

        // Centimetri

        JButton JBcm = new JButton("Convert");
        JBcm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cm.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double CM = Double.parseDouble(cm.getText());
                    double MM = CM * 10;
                    double DM = CM / 10;
                    double M = DM / 10;
                    double KM = M / 1000;
                    double ML = KM / 1.609;
                    double FT = ML * 5280;
                    double INCH = FT / 12;

                    String mM = String.format("%.3f", MM);
                    String dM = String.format("%.3f", DM);
                    String Mt = String.format("%.3f", M);
                    String kM = String.format("%.3f", KM);
                    String mL = String.format("%.3f", ML);
                    String fT = String.format("%.3f", FT);
                    String inCH = String.format("%.3f", INCH);

                    mm.setText(mM);
                    dm.setText(dM);
                    m.setText(Mt);
                    km.setText(kM);
                    mile.setText(mL);
                    feet.setText(fT);
                    inch.setText(inCH);

                }
            }
        });
        JBcm.setForeground(Color.black);
        JBcm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBcm.setBackground(new Color(173, 216, 230));
        JBcm.setBounds(359, 124, 100, 40);
        contentPane.add(JBcm);

        JLabel labelcm = new JLabel("Centimeter");
        labelcm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelcm.setBackground(Color.white);
        labelcm.setForeground(Color.black);
        labelcm.setBounds(20, 124, 107, 40);
        contentPane.add(labelcm);

        cm = new JTextField();
        cm.setHorizontalAlignment(SwingConstants.CENTER);
        cm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        cm.setColumns(10);
        cm.setBounds(139, 124, 147, 40);
        contentPane.add(cm);

        // Metri

        JButton JBm = new JButton("Convert");
        JBm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (m.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double M = Double.parseDouble(m.getText());
                    double CM = M * 100;
                    double DM = CM / 10;
                    double MM = CM * 10;
                    double KM = M / 1000;
                    double ML = KM / 1.609;
                    double FT = ML * 5280;
                    double INCH = FT / 12;

                    String cM = String.format("%.3f", CM);
                    String dM = String.format("%.3f", DM);
                    String Mm = String.format("%.3f", MM);
                    String kM = String.format("%.3f", KM);
                    String mL = String.format("%.3f", ML);
                    String fT = String.format("%.3f", FT);
                    String inCH = String.format("%.3f", INCH);

                    cm.setText(cM);
                    dm.setText(dM);
                    mm.setText(Mm);
                    km.setText(kM);
                    mile.setText(mL);
                    feet.setText(fT);
                    inch.setText(inCH);

                }
            }
        });
        JBm.setForeground(Color.black);
        JBm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBm.setBackground(new Color(173, 216, 230));
        JBm.setBounds(359, 169, 100, 40);
        contentPane.add(JBm);

        JLabel labelm = new JLabel("Meter");
        labelm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelm.setBackground(Color.white);
        labelm.setForeground(Color.black);
        labelm.setBounds(20, 169, 107, 40);
        contentPane.add(labelm);

        m = new JTextField();
        m.setHorizontalAlignment(SwingConstants.CENTER);
        m.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        m.setColumns(10);
        m.setBounds(139, 169, 147, 40);
        contentPane.add(m);

        // Decimetri

        JButton JBdm = new JButton("Convert");
        JBdm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (dm.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double DM = Double.parseDouble(dm.getText());
                    double CM = DM * 10;
                    double MM = CM * 10;
                    double M = DM / 10;
                    double KM = M / 1000;
                    double ML = KM / 1.609;
                    double FT = ML * 5280;
                    double INCH = FT / 12;

                    String cM = String.format("%.3f", CM);
                    String mM = String.format("%.3f", MM);
                    String Mt = String.format("%.3f", M);
                    String kM = String.format("%.3f", KM);
                    String mL = String.format("%.3f", ML);
                    String fT = String.format("%.3f", FT);
                    String inCH = String.format("%.3f", INCH);

                    cm.setText(cM);
                    mm.setText(mM);
                    m.setText(Mt);
                    km.setText(kM);
                    mile.setText(mL);
                    feet.setText(fT);
                    inch.setText(inCH);

                }
            }
        });
        JBdm.setForeground(Color.black);
        JBdm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBdm.setBackground(new Color(173, 216, 230));
        JBdm.setBounds(359, 213, 100, 40);
        contentPane.add(JBdm);

        JLabel labeldm = new JLabel("Decimeter");
        labeldm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labeldm.setForeground(Color.black);
        labeldm.setBackground(Color.white);
        labeldm.setBounds(20, 213, 107, 40);
        contentPane.add(labeldm);

        dm = new JTextField();
        dm.setHorizontalAlignment(SwingConstants.CENTER);
        dm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        dm.setColumns(10);
        dm.setBounds(139, 213, 147, 40);
        contentPane.add(dm);

        // Kilometri

        JButton JBkm = new JButton("Convert");
        JBkm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (km.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double KM = Double.parseDouble(km.getText());
                    double CM = KM * 100000;
                    double DM = CM / 10;
                    double M = DM / 10;
                    double MM = CM * 10;
                    double ML = KM / 1.609;
                    double FT = ML * 5280;
                    double INCH = FT / 12;

                    String cM = String.format("%.3f", CM);
                    String dM = String.format("%.3f", DM);
                    String Mt = String.format("%.3f", M);
                    String mM = String.format("%.3f", MM);
                    String mL = String.format("%.3f", ML);
                    String fT = String.format("%.3f", FT);
                    String inCH = String.format("%.3f", INCH);

                    cm.setText(cM);
                    dm.setText(dM);
                    m.setText(Mt);
                    mm.setText(mM);
                    mile.setText(mL);
                    feet.setText(fT);
                    inch.setText(inCH);

                }
            }
        });
        JBkm.setForeground(Color.black);
        JBkm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBkm.setBackground(new Color(173, 216, 230));
        JBkm.setBounds(359, 260, 100, 40);
        contentPane.add(JBkm);

        JLabel labelkm = new JLabel("Kilometer");
        labelkm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelkm.setBackground(Color.white);
        labelkm.setForeground(Color.black);
        labelkm.setBounds(20, 260, 107, 40);
        contentPane.add(labelkm);

        km = new JTextField();
        km.setHorizontalAlignment(SwingConstants.CENTER);
        km.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        km.setColumns(10);
        km.setBounds(139, 260, 147, 40);
        contentPane.add(km);

        // Milje

        JButton JBmi = new JButton("Convert");
        JBmi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (mile.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double ML = Double.parseDouble(mile.getText());
                    double CM = ML * 160934;
                    double DM = CM / 10;
                    double M = DM / 10;
                    double KM = M / 1000;
                    double MM = CM * 10;
                    double FT = ML * 5280;
                    double INCH = FT / 12;

                    String cM = String.format("%.3f", CM);
                    String dM = String.format("%.3f", DM);
                    String Mt = String.format("%.3f", M);
                    String kM = String.format("%.3f", KM);
                    String mM = String.format("%.3f", MM);
                    String fT = String.format("%.3f", FT);
                    String inCH = String.format("%.3f", INCH);

                    cm.setText(cM);
                    dm.setText(dM);
                    m.setText(Mt);
                    km.setText(kM);
                    mm.setText(mM);
                    feet.setText(fT);
                    inch.setText(inCH);

                }
            }
        });
        JBmi.setForeground(Color.black);
        JBmi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBmi.setBackground(new Color(173, 216, 230));
        JBmi.setBounds(359, 304, 100, 40);
        contentPane.add(JBmi);

        JLabel labelmi = new JLabel("Mile");
        labelmi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelmi.setBackground(Color.white);
        labelmi.setForeground(Color.black);
        labelmi.setBounds(20, 304, 107, 40);
        contentPane.add(labelmi);

        mile = new JTextField();
        mile.setHorizontalAlignment(SwingConstants.CENTER);
        mile.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        mile.setColumns(10);
        mile.setBounds(139, 304, 147, 40);
        contentPane.add(mile);

        // Stope

        JButton JBfe = new JButton("Convert");
        JBfe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (feet.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double FT = Double.parseDouble(feet.getText());
                    double CM = FT * 30.48;
                    double DM = CM / 10;
                    double M = DM / 10;
                    double KM = M / 1000;
                    double ML = KM / 1.609;
                    double MM = CM * 10;
                    double INCH = FT / 12;

                    String cM = String.format("%.3f", CM);
                    String dM = String.format("%.3f", DM);
                    String Mt = String.format("%.3f", M);
                    String kM = String.format("%.3f", KM);
                    String mL = String.format("%.3f", ML);
                    String mM = String.format("%.3f", MM);
                    String inCH = String.format("%.3f", INCH);

                    cm.setText(cM);
                    dm.setText(dM);
                    m.setText(Mt);
                    km.setText(kM);
                    mile.setText(mL);
                    mm.setText(mM);
                    inch.setText(inCH);

                }
            }
        });
        JBfe.setForeground(Color.black);
        JBfe.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBfe.setBackground(new Color(173, 216, 230));
        JBfe.setBounds(359, 349, 100, 40);
        contentPane.add(JBfe);

        JLabel labelfe = new JLabel("Feet");
        labelfe.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelfe.setBackground(Color.white);
        labelfe.setForeground(Color.black);
        labelfe.setBounds(20, 349, 107, 40);
        contentPane.add(labelfe);

        feet = new JTextField();
        feet.setText(null);
        feet.setHorizontalAlignment(SwingConstants.CENTER);
        feet.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        feet.setColumns(10);
        feet.setBounds(139, 349, 147, 40);
        contentPane.add(feet);

        // Inči

        JButton JBin = new JButton("Convert");
        JBin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inch.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double INCH = Double.parseDouble(inch.getText());
                    double CM = 2.54 * INCH;
                    double DM = CM / 10;
                    double M = DM / 10;
                    double KM = M / 1000;
                    double ML = KM / 1.609;
                    double FT = ML * 5280;
                    double MM = CM * 10;

                    String cM = String.format("%.3f", CM);
                    String dM = String.format("%.3f", DM);
                    String Mt = String.format("%.3f", M);
                    String kM = String.format("%.3f", KM);
                    String mL = String.format("%.3f", ML);
                    String fT = String.format("%.3f", FT);
                    String mM = String.format("%.3f", MM);

                    cm.setText(cM);
                    dm.setText(dM);
                    m.setText(Mt);
                    km.setText(kM);
                    mile.setText(mL);
                    feet.setText(fT);
                    mm.setText(mM);

                }
            }
        });
        JBin.setForeground(Color.black);
        JBin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBin.setBackground(new Color(173, 216, 230));
        JBin.setBounds(359, 393, 100, 40);
        contentPane.add(JBin);

        JLabel labelinchi = new JLabel("Inchi");
        labelinchi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelinchi.setBackground(Color.white);
        labelinchi.setForeground(Color.black);
        labelinchi.setBounds(20, 393, 107, 40);
        contentPane.add(labelinchi);

        inch = new JTextField();
        inch.setHorizontalAlignment(SwingConstants.CENTER);
        inch.setFont(new Font("Times New ROman", Font.PLAIN, 20));
        inch.setColumns(10);
        inch.setBounds(139, 393, 147, 40);
        contentPane.add(inch);

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