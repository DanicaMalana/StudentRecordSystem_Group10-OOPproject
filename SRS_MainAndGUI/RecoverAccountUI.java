package SRS_MainAndGUI;

import Accounts.AccountGetterSetter;
import Accounts.RecoverAccount;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public final class RecoverAccountUI extends JFrame implements ActionListener{
    JFrame jf_forgotPW, jf_ResetPW;
    JLabel lbl, Email, enterNewPW, PW, confirmPW;
    JTextField enterEmail;
    JButton Enter, backBttn1, Confirm;
    JCheckBox showPW;
    JPasswordField PWfield1, PWfield12;   
    private final RecoverAccount Recover = new RecoverAccount();
    
    AccountGetterSetter faccount;
    
    public RecoverAccountUI(AccountGetterSetter tongueina)
    {
        this.faccount = tongueina;
    jf_forgotPW = new JFrame("Forgot Password");
        jf_forgotPW.setSize(400, 250);
        jf_forgotPW.setLocationRelativeTo(null);
        jf_forgotPW.setLayout(null);
        jf_forgotPW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        backBttn1 = new JButton("Back");
        backBttn1.setBounds(10, 10, 80, 20);
        backBttn1.addActionListener(this);
        jf_forgotPW.add(backBttn1);
        
        lbl = new JLabel("Please Enter your email.");
        lbl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lbl.setBounds(128, 30, 250, 30);
        jf_forgotPW.add(lbl);      
        
        Email = new JLabel("Email: ");  
        Email.setBounds(90,80, 120,20);
        jf_forgotPW.add(Email);
        
        enterEmail = new JTextField();
        enterEmail.setBounds(130, 80, 140, 20);
        jf_forgotPW.add(enterEmail);
        
        Enter = new JButton("Enter");
        Enter.setFont(new Font("Arial", Font.PLAIN, 10));
        Enter.setBounds(158, 120, 70, 20);
        Enter.addActionListener(this);
        jf_forgotPW.add(Enter);

        jf_forgotPW.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent AE) 
    {       
        var enter_Email = enterEmail.getText();
        if (AE.getSource() == Enter)
        {   
            
            
            if (faccount.getEmail().equals(enter_Email))
            {       
            jf_forgotPW.setVisible(false);
            jf_ResetPW = new JFrame("Reset Password");
            jf_ResetPW.setSize(400, 250);
            jf_ResetPW.setLocationRelativeTo(null);
            jf_ResetPW.setLayout(null);
            jf_ResetPW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
//          backBttn2 = new JButton("Back");
//          backBttn2.setFont(new Font("Arial", Font.PLAIN, 10));
//          backBttn2.setBounds(10, 10, 80, 20);
//          backBttn2.addActionListener(this);
//          jf_ResetPW.add(backBttn2);
            
            enterNewPW = new JLabel("Please Enter and confirm new Password.");
            enterNewPW.setBounds(80, 30, 250, 30);
            jf_ResetPW.add(enterNewPW);  
            
            PW = new JLabel("Password: ");  
            PW.setBounds(90,80, 120,20);
            jf_ResetPW.add(PW); 
    
            PWfield1 = new JPasswordField();
            PWfield1.setBounds(160, 80, 140, 20);
            jf_ResetPW.add(PWfield1);
            
            confirmPW = new JLabel("Confirm-Password: ");  
            confirmPW.setBounds(42,110, 120,20); 
            jf_ResetPW.add(confirmPW);
            
            PWfield12 = new JPasswordField();   
            PWfield12.setBounds(160, 110, 140, 20);
            jf_ResetPW.add(PWfield12);
            
            Confirm = new JButton("Confirm");
            Confirm.setFont(new Font("Arial", Font.PLAIN, 10));
            Confirm.setBounds(160, 140, 80, 20);
            Confirm.addActionListener(this);
            jf_ResetPW.add(Confirm);
            
            showPW = new JCheckBox("Show");
            showPW.setFont(new Font("Arial", Font.PLAIN, 10));
            showPW.setBounds(240, 140, 80, 20);
            showPW.addActionListener(this);
            jf_ResetPW.add(showPW);
            
            jf_ResetPW.setVisible(true);
            }
            else {JOptionPane.showMessageDialog(jf_forgotPW,"Invalid Email");}
        }
        
        if (AE.getSource() == Confirm )
        {
            String newPassword = PWfield1.getText();
            String newPassword2 = PWfield12.getText();
            if (!faccount.getPassword().equals(newPassword))
            {
                if (newPassword.equals(newPassword2) && faccount.getEmail().equals(enter_Email))
                {   
                    faccount.setPassword(newPassword2);
                    JOptionPane.showMessageDialog(this,"Successful");
                    new TeacherLogin();
                }
//                else if (newPassword.equals(newPassword2) && faccount.getType().equals(Student))
//                {   
//                    faccount.setPassword(newPassword2);
//                    JOptionPane.showMessageDialog(this,"Successful");
//                    new StudentLogin();
//                }
                else {JOptionPane.showMessageDialog(this,"Password not the same");}
            }
        }
        
        if (AE.getSource() == backBttn1)
            {jf_forgotPW.setVisible(false);
             System.out.println(new TeacherLogin());}
        
//        if (AE.getSource() == backBttn2)
//            {jf_ResetPW.setVisible(false);
//            new RecoverAccountUI();}
        
        if (AE.getSource() == showPW)
        {
            if (showPW.isSelected())
            {PWfield1.setEchoChar((char) 0); 
             PWfield12.setEchoChar((char) 0);}
            else
            {PWfield1.setEchoChar('•');
             PWfield12.setEchoChar('•');}
        }
    }
}
