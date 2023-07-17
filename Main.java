package Student_Record_System;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public final class Main implements ActionListener{
    // Main Method

    public static void main(String args[])  
    { 
        System.out.print(new Main());
    }
    
    // JavaSwing Components
    JFrame jf_Options;
    JButton TeacherButton, StudentButton;
    JLabel TandS_Options;
    
    // Constructor
    Main()
    {
        jf_Options = new JFrame("Student Record System");
        jf_Options.setSize(400, 250);
        jf_Options.getContentPane().setBackground(new Color(13, 26, 38));
        jf_Options.setLocationRelativeTo(null);
        jf_Options.setLayout(null);  
        jf_Options.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
        TandS_Options = new JLabel("Please Choose your destination.  ↓");
        TandS_Options.setBounds(55, 35, 280, 30);
        TandS_Options.setForeground (new Color(	222, 218, 213));
        TandS_Options.setFont(new Font("Times New Roman",Font.PLAIN, 20));
        jf_Options.add(TandS_Options);
        
         // TeacherButton Button
        TeacherButton = new JButton("FACULTY");
        TeacherButton.setFont(new Font("Arial", Font.PLAIN, 20));
        
        TeacherButton.setBounds(95, 120, 200, 30);
        TeacherButton.setForeground (new Color(	237, 185, 234));
        TeacherButton.setBackground(new Color(220, 53, 69));
        jf_Options.add(TeacherButton);
    
        // StudentButton Button
        StudentButton = new JButton("STUDENT");
        StudentButton.setFont(new Font("Arial", Font.PLAIN, 20));
        StudentButton.setBounds(95, 70, 200, 30);
        StudentButton.setForeground (new Color(237, 185, 234));
        StudentButton.setBackground(new Color(00,123,255));
        jf_Options.add(StudentButton);
        ActionListener();
        jf_Options.setVisible(true);
    }  
    
    private void ActionListener()
    {
        StudentButton.addActionListener(this);
        TeacherButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent AE)
    {
        if  (AE.getSource() == TeacherButton)
        {   
            System.out.print(new TeacherLogin());
            jf_Options.setVisible(false);
        }
        else if (AE.getSource() == StudentButton)
        {
            System.out.print(new StudentLogin());
            jf_Options.setVisible(false);
//            jf_Options.dispose();
        }   
    }
}
