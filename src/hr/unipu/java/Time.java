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

public class Time extends JFrame {

    private JPanel contentPane;
    private JTextField sec;
    private JTextField min;
    private JTextField hour;
    private JTextField day;
    private JTextField week;
    private JTextField month;
    private JTextField year;
    private JTextField poruka;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Time frame = new Time();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Kreiranje prikaza

    public Time() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPane = new JPanel();
        contentPane.setForeground(Color.black);
        contentPane.setBackground(Color.white);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // BUTTON ZA VRAĆANJE NA ODABIR CONVERTERA

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

        JLabel labelnaslov = new JLabel("TIME CONVERTER");
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
                sec.setText(null);
                min.setText(null);
                hour.setText(null);
                day.setText(null);
                week.setText(null);
                month.setText(null);
                year.setText(null);

            }
        });
        JBclear.setForeground(Color.black);
        JBclear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JBclear.setBackground(new Color(173, 216, 230));
        JBclear.setBounds(200, 499, 129, 41);
        contentPane.add(JBclear);

        // Sekunde

        JButton JBsec = new JButton("Convert");
        JBsec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (sec.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double Sec = Double.parseDouble(sec.getText());
                    double Min = Sec / 60;
                    double Hour = Sec / 3600;
                    double Day = Sec / 86400;
                    double Week = Sec / 604800;
                    double Mon = Sec / 2629743.83;
                    double Yea = Sec / 31556926;
                    String MIN = String.format("%.2f", Min);
                    String HOUR = String.format("%.2f", Hour);
                    String DAY = String.format("%.2f", Day);
                    String WEEK = String.format("%.2f", Week);
                    String MON = String.format("%.2f", Mon);
                    String YEA = String.format("%.2f", Yea);
                    min.setText(MIN);
                    hour.setText(HOUR);
                    day.setText(DAY);
                    week.setText(WEEK);
                    month.setText(MON);
                    year.setText(YEA);
                }
            }
        });
        JBsec.setForeground(Color.black);
        JBsec.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBsec.setBackground(new Color(173, 216, 230));
        JBsec.setBounds(359, 80, 100, 40);
        contentPane.add(JBsec);

        JLabel labelsec = new JLabel("Seconds");
        labelsec.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelsec.setBackground(Color.white);
        labelsec.setForeground(Color.black);
        labelsec.setBounds(20, 80, 107, 40);
        contentPane.add(labelsec);

        sec = new JTextField();
        sec.setHorizontalAlignment(SwingConstants.CENTER);
        sec.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        sec.setColumns(10);
        sec.setBounds(139, 80, 147, 40);
        contentPane.add(sec);

        // Minute

        JButton JBmin = new JButton("Convert");
        JBmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (min.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double Min = Double.parseDouble(min.getText());
                    double Sec = Min * 60;
                    double Hour = Min * 0.0166666667;
                    double Day = Min * 0.000694444444;
                    double Week = Min * 0.0000099263492;
                    double Mon = Min * 0.00000228159105;
                    double Yea = Min * 0.000000190132588;
                    String SEC = String.format("%.2f", Sec);
                    String HOUR = String.format("%.2f", Hour);
                    String DAY = String.format("%.2f", Day);
                    String WEEK = String.format("%.2f", Week);
                    String MON = String.format("%.2f", Mon);
                    String YEA = String.format("%.2f", Yea);
                    sec.setText(SEC);
                    hour.setText(HOUR);
                    day.setText(DAY);
                    week.setText(WEEK);
                    month.setText(MON);
                    year.setText(YEA);
                }
            }
        });
        JBmin.setForeground(Color.black);
        JBmin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBmin.setBackground(new Color(173, 216, 230));
        JBmin.setBounds(359, 124, 100, 40);
        contentPane.add(JBmin);

        JLabel labelmin = new JLabel("Minutes");
        labelmin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelmin.setBackground(Color.white);
        labelmin.setForeground(Color.black);
        labelmin.setBounds(20, 124, 107, 40);
        contentPane.add(labelmin);

        min = new JTextField();
        min.setHorizontalAlignment(SwingConstants.CENTER);
        min.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        min.setColumns(10);
        min.setBounds(139, 124, 147, 40);
        contentPane.add(min);


        // Sati

        JButton JBhour = new JButton("Convert");
        JBhour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (hour.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double Hour = Double.parseDouble(hour.getText());
                    double Sec = Hour * 3600;
                    double Min = Hour * 60;
                    double Day = Hour * 0.0416666667;
                    double Week = Hour * 0.00595238095;
                    double Mon = Hour * 0.00136895463;
                    double Yea = Hour * 0.000114079553;
                    String SEC = String.format("%.2f", Sec);
                    String MIN = String.format("%.2f", Min);
                    String DAY = String.format("%.2f", Day);
                    String WEEK = String.format("%.2f", Week);
                    String MON = String.format("%.2f", Mon);
                    String YEA = String.format("%.2f", Yea);
                    sec.setText(SEC);
                    min.setText(MIN);
                    day.setText(DAY);
                    week.setText(WEEK);
                    month.setText(MON);
                    year.setText(YEA);
                }
            }
        });
        JBhour.setForeground(Color.black);
        JBhour.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBhour.setBackground(new Color(173, 216, 230));
        JBhour.setBounds(359, 169, 100, 40);
        contentPane.add(JBhour);

        JLabel labelhour = new JLabel("Hours");
        labelhour.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelhour.setBackground(Color.white);
        labelhour.setForeground(Color.black);
        labelhour.setBounds(20, 169, 107, 40);
        contentPane.add(labelhour);

        hour = new JTextField();
        hour.setHorizontalAlignment(SwingConstants.CENTER);
        hour.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        hour.setColumns(10);
        hour.setBounds(139, 169, 147, 40);
        contentPane.add(hour);

        // Dani

        JButton JBday = new JButton("Convert");
        JBday.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (day.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double Day = Double.parseDouble(day.getText());
                    double Sec = Day * 86400;
                    double Min = Day * 1440;
                    double Hour = Day * 24;
                    double Week = Day * 0.142857143;
                    double Mon = Day * 0.0328549112;
                    double Yea = Day * 0.00273790926;
                    String SEC = String.format("%.2f", Sec);
                    String MIN = String.format("%.2f", Min);
                    String HOUR = String.format("%.2f", Hour);
                    String WEEK = String.format("%.2f", Week);
                    String MON = String.format("%.2f", Mon);
                    String YEA = String.format("%.2f", Yea);
                    sec.setText(SEC);
                    min.setText(MIN);
                    hour.setText(HOUR);
                    week.setText(WEEK);
                    month.setText(MON);
                    year.setText(YEA);

                }
            }
        });
        JBday.setForeground(Color.black);
        JBday.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBday.setBackground(new Color(173, 216, 230));
        JBday.setBounds(359, 213, 100, 40);
        contentPane.add(JBday);

        JLabel labelday = new JLabel("Days");
        labelday.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelday.setBackground(Color.white);
        labelday.setForeground(Color.black);
        labelday.setBounds(20, 213, 107, 40);
        contentPane.add(labelday);

        day = new JTextField();
        day.setHorizontalAlignment(SwingConstants.CENTER);
        day.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        day.setColumns(10);
        day.setBounds(139, 213, 147, 40);
        contentPane.add(day);

        // Tjedni

        JButton JBweek = new JButton("Convert");
        JBweek.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (week.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    poruka.setText(null);
                    double Week = Double.parseDouble(week.getText());
                    double Sec = Week * 604800;
                    double Min = Week * 10080;
                    double Hour = Week * 168;
                    double Day = Week * 7;
                    double Mon = Week * 0.2299984378;
                    double Yea = Week * 0.0191653649;
                    String SEC = String.format("%.2f", Sec);
                    String MIN = String.format("%.2f", Min);
                    String HOUR = String.format("%.2f", Hour);
                    String DAY = String.format("%.2f", Day);
                    String MON = String.format("%.2f", Mon);
                    String YEA = String.format("%.2f", Yea);
                    sec.setText(SEC);
                    min.setText(MIN);
                    hour.setText(HOUR);
                    day.setText(DAY);
                    month.setText(MON);
                    year.setText(YEA);
                }
            }
        });
        JBweek.setForeground(Color.black);
        JBweek.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBweek.setBackground(new Color(173, 216, 230));
        JBweek.setBounds(359, 260, 100, 40);
        contentPane.add(JBweek);

        JLabel labelweek = new JLabel("Weeks");
        labelweek.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelweek.setBackground(Color.white);
        labelweek.setForeground(Color.black);
        labelweek.setBounds(20, 260, 107, 40);
        contentPane.add(labelweek);

        week = new JTextField();
        week.setHorizontalAlignment(SwingConstants.CENTER);
        week.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        week.setColumns(10);
        week.setBounds(139, 260, 147, 40);
        contentPane.add(week);

        // Mjeseci

        JButton JBmon = new JButton("Convert");
        JBmon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (month.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    double Mon = Double.parseDouble(month.getText());
                    double Sec = Mon * 2629743.83;
                    double Min = Mon * 43829.0639;
                    double Hour = Mon * 730.484398;
                    double Day = Mon * 30.4368499;
                    double Week = Mon * 4.34812141;
                    double Yea = Mon * 0.083333333;
                    String SEC = String.format("%.2f", Sec);
                    String MIN = String.format("%.2f", Min);
                    String HOUR = String.format("%.2f", Hour);
                    String DAY = String.format("%.2f", Day);
                    String WEEK = String.format("%.2f", Week);
                    String YEA = String.format("%.2f", Yea);
                    sec.setText(SEC);
                    min.setText(MIN);
                    hour.setText(HOUR);
                    day.setText(DAY);
                    week.setText(WEEK);
                    year.setText(YEA);

                }
            }
        });
        JBmon.setForeground(Color.black);
        JBmon.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBmon.setBackground(new Color(173, 216, 230));
        JBmon.setBounds(359, 304, 100, 40);
        contentPane.add(JBmon);

        JLabel labelmon = new JLabel("Months");
        labelmon.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelmon.setBackground(Color.white);
        labelmon.setForeground(Color.black);
        labelmon.setBounds(20, 304, 107, 40);
        contentPane.add(labelmon);

        month = new JTextField();
        month.setHorizontalAlignment(SwingConstants.CENTER);
        month.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        month.setColumns(10);
        month.setBounds(139, 304, 147, 40);
        contentPane.add(month);

        // Godine

        JButton JBon = new JButton("Convert");
        JBon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (year.getText().isEmpty()) {
                    poruka.setText("Your input is empty.");
                } else {
                    double Yea = Double.parseDouble(year.getText());
                    double Sec = Yea * 31556926;
                    double Min = Yea * 525948.766;
                    double Hour = Yea * 8765.81277;
                    double Day = Yea * 365.242199;
                    double Week = Yea * 52.177457;
                    double Mon = Yea * 12;
                    String SEC = String.format("%.2f", Sec);
                    String MIN = String.format("%.2f", Min);
                    String HOUR = String.format("%.2f", Hour);
                    String DAY = String.format("%.2f", Day);
                    String WEEK = String.format("%.2f", Week);
                    String MON = String.format("%.2f", Mon);
                    sec.setText(SEC);
                    min.setText(MIN);
                    hour.setText(HOUR);
                    day.setText(DAY);
                    week.setText(WEEK);
                    month.setText(MON);
                }
            }
        });
        JBon.setForeground(Color.black);
        JBon.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JBon.setBackground(new Color(173, 216, 230));
        JBon.setBounds(359, 349, 100, 40);
        contentPane.add(JBon);

        JLabel labelon = new JLabel("Years");
        labelon.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        labelon.setBackground(Color.white);
        labelon.setForeground(Color.black);
        labelon.setBounds(20, 349, 107, 40);
        contentPane.add(labelon);

        year = new JTextField();
        year.setHorizontalAlignment(SwingConstants.CENTER);
        year.setFont(new Font("TImes New Roman", Font.PLAIN, 20));
        year.setColumns(10);
        year.setBounds(139, 349, 147, 40);
        contentPane.add(year);

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

