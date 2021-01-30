package hr.unipu.java;

import com.sun.java.swing.plaf.motif.MotifButtonUI;
import com.sun.java.swing.plaf.windows.WindowsButtonUI;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Calculator extends JFrame implements ActionListener {
    private double Rezultat = 0;
    private String Operator = "";
    private JTextArea display = new JTextArea(4,25);
    private boolean JeLiPrazno = true;

    Calculator(){
        setBounds(100, 100, 500, 600);
        setTitle("Calculator");
        JPanel panel = new JPanel(new BorderLayout(8,8));
        Color color = new Color(173,216,230);
        Color front = new Color(0,0,0);
        panel.setBackground(color);
        panel.setBorder(new EmptyBorder(4,2,4,2));
        setContentPane(panel);
        display.setEditable(false);
        panel.add(display,"North");
        JPanel panelButtons = new JPanel(new GridLayout(4, 4));
        String buttonLabels = "789/456*123-0.=+";

        for (int i=0; i<buttonLabels.length(); i++){
            JButton b = new JButton(buttonLabels.substring(i, i+1));
            panelButtons.add(b);
            panelButtons.setBackground(front);
            panelButtons.setFont(Font.getFont("Arial Black"));
            b.setUI((ButtonUI) MotifButtonUI.createUI(b));
            b.addActionListener(this);
        }
        panel.add(panelButtons,"Center");

        //dodamo gumb za brisanje unosa
        JButton clear = new JButton("Clear");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                Rezultat = 0;
                Operator = " ";
                JeLiPrazno = true;
            }
        });
        clear.setBackground(new Color(255,216,1));
        clear.setForeground(Color.black);
        clear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(clear, "East");

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
        panel.add(Back, "South");
    }

    public void actionPerformed(ActionEvent e){
        String broj = e.getActionCommand();
        if ('0' <= broj.charAt(0) && broj.charAt(0) <= '9' ||
                broj.equals(".")){
            if (JeLiPrazno){
                display.setText(broj);
            } else
                display.setText(display.getText() + broj);
            JeLiPrazno =false;
        }
        else{
            if(Rezultat ==0) Rezultat =Double.parseDouble(display.getText());
            double x=Double.parseDouble(display.getText());
            Racun(x);
            Operator = broj;
            JeLiPrazno = true;
        }
    }


    private void Racun(double x){
        if(Operator.equals("+")){
            Rezultat = Rezultat + x;
        }else if(Operator.equals("-"))
            Rezultat = Rezultat - x;
        else if (Operator.equals("*"))
            Rezultat = Rezultat * x;
        else if (Operator.equals("/"))
            Rezultat = Rezultat / x;
        else if (Operator.equals("="))
            System.out.println("Rezultat: " + Rezultat);
        display.setText("" + Rezultat);
    }


    public static void main(String[] args){
        try{
            SwingUtilities.invokeAndWait(new Runnable(){
                @Override
                public void run(){
                    Calculator kalkDel = new Calculator();
                    kalkDel.setLocation(50,20);
                    kalkDel.setVisible(true);
                }
            });
        }catch (InvocationTargetException | InterruptedException e){
            e.printStackTrace();
        }
    }
}
