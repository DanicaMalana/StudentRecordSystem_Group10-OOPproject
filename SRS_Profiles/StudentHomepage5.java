package SRS_Profiles;

//PART5

import javax.swing.*;
import java.awt.Font;
public class StudentHomepage5 {
 public StudentHomepage5() {
 JFrame jf = new JFrame("STUDENT HOMEPAGE");
 jf.setSize(1200, 1000);
 jf.setLocationRelativeTo(null);
 jf.setLayout(null); 
 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 JLabel SI, NS, SN, AS, B, CS, HA, GWA1, GWA2;
 
 SI = new JLabel("Student 5");
 SI.setBounds(10, 10, 150,30);
 jf.add(SI);
 SI.setFont(new Font("Arial Black", Font.BOLD, 20));
 
 NS = new JLabel("Name of Student:");
 NS.setBounds(60, 50, 200,30);
 jf.add(NS);
 NS.setFont(new Font("Arial Black", Font.BOLD, 20));
 
 SN = new JLabel("Student Number:");
 SN.setBounds(60, 130, 200,30);
 jf.add(SN);
 SN.setFont(new Font("Arial Black", Font.BOLD, 20));
 
 
 AS = new JLabel("Age of Student: ");
 AS.setBounds(60, 200, 200,30);
 jf.add(AS);
 AS.setFont(new Font("Arial Black", Font.BOLD, 20));
 
 B = new JLabel("Birthday: ");
 B.setBounds(60, 270, 170,30);
 jf.add(B); 
 B.setFont(new Font("Arial Black", Font.BOLD, 20));
 
 CS = new JLabel("Contact No. of Student: ");
 CS.setBounds(440, 47, 350,30);
 jf.add(CS);
 CS.setFont(new Font("Arial Black", Font.BOLD, 20));
 
 
 HA = new JLabel("Home Address:");
 HA.setBounds(440, 128, 650,30);
 jf.add(HA); 
 HA.setFont(new Font("Arial Black", Font.BOLD, 20));
 
 
 GWA1 = new JLabel("GWA in 1st sem: ");
 GWA1.setBounds(440, 199, 650,30);
 jf.add(GWA1);
 GWA1.setFont(new Font("Arial Black", Font.BOLD, 20));
 
 
 GWA2 = new JLabel("GWA in 2nd sem: ");
 GWA2.setBounds(440, 267, 400,30);
 jf.add(GWA2);
 GWA2.setFont(new Font("Arial Black", Font.BOLD, 20));
 
 
 
 JLabel Name5;
 
 NS = new JLabel("Sison, Patricia Laine");
 NS.setBounds(60, 80, 280,30);
 jf.add(NS); 
 NS.setFont(new Font("Constantia", Font.BOLD, 20));
 
 
 JLabel SN5;
 
 SN = new JLabel("2021-00061-BN-0");
 SN.setBounds(60, 155, 200,30);
 jf.add(SN);
 SN.setFont(new Font("Constantia", Font.BOLD, 20));
 
 
 JLabel AS5;
 
 AS = new JLabel("21 years old");
 AS.setBounds(60, 230, 170,30);
 jf.add(AS); 
 AS.setFont(new Font("Constantia", Font.BOLD, 20));
 
 JLabel B5;
 
 B = new JLabel("August 14, 2001");
 B.setBounds(60, 300, 250,30);
 jf.add(B); 
 B.setFont(new Font("Constantia", Font.BOLD, 20));
 
 JLabel CS5;
 
 CS = new JLabel("093-9725-3256");
 CS.setBounds(440, 80, 450,30);
 jf.add(CS); 
 CS.setFont(new Font("Constantia", Font.BOLD, 20));
 
 JLabel HA5;
 
 HA = new JLabel("2896 Sta. Teresita St. Almeda Subd. Dela Paz Biñan Laguna");
 HA.setBounds(440, 160, 650,30);
 jf.add(HA); 
 HA.setFont(new Font("Constantia", Font.BOLD, 20));
 
 
 GWA1 = new JLabel("1.00");
 GWA1.setBounds(440, 225, 350,30);
 jf.add(GWA1); 
GWA1.setFont(new Font("Constantia", Font.BOLD, 20));
 
 
 JLabel GWAA2;
 
 GWA2 = new JLabel("1.25");
 GWA2.setBounds(440, 295, 350,30);
 jf.add(GWA2); 
 GWA2.setFont(new Font("Constantia", Font.BOLD, 20));
 
 jf.setVisible(true);
 }
}