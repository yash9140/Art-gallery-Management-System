package art.gallery.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JTextField textName,textPhone,textUser,textPass;
    JRadioButton r1,r2;

    JButton Next;

    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    Signup() {

        super("SIGN UP");



        //ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(""))
        JLabel label1 = new JLabel("REGISTRATION NO." +first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :-");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);


        JLabel labelPhone = new JLabel("MobileNo.");
        labelPhone.setFont(new Font("Raleway",Font.BOLD,20));
        labelPhone.setBounds(100,250,100,30);
        add(labelPhone);

        textPhone = new JTextField();
        textPhone.setFont(new Font("Raleway",Font.BOLD,14));
        textPhone.setBounds(300,250,400,30);
        add(textPhone);

        JLabel labelg = new JLabel("Gender");
        labelg.setFont(new Font("Raleway",Font.BOLD,20));
        labelg.setBounds(100,290,400,30);
        add(labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,20));
        //r1.setBackground(new Color(222,255,220));
        r1.setBounds(300,290,90,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,20));
        //r1.setBackground(new Color(222,255,220));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelUser = new JLabel("Username");
        labelUser.setFont(new Font("Raleway",Font.BOLD,20));
        labelUser.setBounds(100,350,100,30);
        add(labelUser);

        textUser = new JTextField();
        textUser.setFont(new Font("Raleway",Font.BOLD,14));
        textUser.setBounds(300,350,400,30);
        add(textUser);

        JLabel labelPass = new JLabel("Password");
        labelPass.setFont(new Font("Raleway",Font.BOLD,20));
        labelPass.setBounds(100,400,100,30);
        add(labelPass);

        textPass = new JTextField();
        textPass.setFont(new Font("Raleway",Font.BOLD,14));
        textPass.setBounds(300,400,400,30);
        add(textPass);

        Next = new JButton("Next");
        Next.setFont(new Font("Raleway",Font.BOLD,14));
        Next.setBackground(new Color(222,255,220));
        Next.setBackground(Color.WHITE);
        Next.setBounds(620,710,80,30);
        Next.addActionListener(this);
        add(Next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Signup();
    }


}
