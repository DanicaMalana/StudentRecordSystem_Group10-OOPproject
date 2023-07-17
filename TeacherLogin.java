package Student_Record_System;

import Accounts.AccountChecker;
import Accounts.AccountGetterSetter;
import Accounts.RecoverAccountUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;
//import javax.swing.event.HyperlinkEvent;
//import javax.swing.event.HyperlinkListener;

public final class TeacherLogin extends JFrame implements ActionListener{  
    
    // JavaSwing Components  
    JFrame jf_TLogin_form, TnC_frame;
    JPanel container;
    JLabel SSFHead, UN, PW, Tnctext;
    JPasswordField Passwordfield;
    JTextField Username;
    JButton Login, ForgotPW, BackBttn;
    JCheckBox ShowPW, AcceptTnC;
    String text = "Terms & Conditions";
    JLabel TnC;
    TeacherHomepage THP = new TeacherHomepage();  
    private final AccountChecker function = new AccountChecker();
    
    // Constructor
    public TeacherLogin(){ 
    // Calling the Method/s
        Loginform();
    }  
    // Back button method
    public void BackButton(){
        BackBttn = new JButton("Back");
        BackBttn.setFont(new Font("Arial", Font.PLAIN, 10));
        BackBttn.setBounds(10, 10, 80, 20);
        BackBttn.addActionListener(this);
        jf_TLogin_form.add(BackBttn);
    }
    
    // Loginform() Method
    public void Loginform()
    {    
    // JFrame/& title
    jf_TLogin_form = new JFrame("Login Form");
    jf_TLogin_form.setSize(500, 390);
    jf_TLogin_form.setLocationRelativeTo(null);
    jf_TLogin_form.setLayout(null);
    jf_TLogin_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf_TLogin_form.getContentPane().setBackground(Color.BLACK);
    
    BackButton();
    
    container = new JPanel();
    container.setLayout(null);
    container.setBounds(0, 40, 500, 310);
    container.setBackground(Color.GRAY);
    
    // Teacher Login JLabel
    SSFHead = new JLabel("Teacher Log-in");  
    SSFHead.setBounds(200, 20, 150,30);
    container.add(SSFHead);

    // JLabel & JTextField
    UN = new JLabel("Teacher ID: ");  
    UN.setBounds(100,10, 120,135);
    container.add(UN);
    Username = new JTextField();
    Username.setBounds(180, 70, 200, 20);
    container.add(Username);
    
    // JLabel & JPasswordField
    PW = new JLabel("Password: ");  
    PW.setBounds(100,100, 120,40);
    container.add(PW);
    Passwordfield = new JPasswordField();
    Passwordfield.setBounds(180, 112, 200, 20);
    container.add(Passwordfield);
    
    // showPW JCkeckbox
    ShowPW = new JCheckBox("Show Password");
    ShowPW.setFont(new Font("Arial", Font.PLAIN, 10));
    ShowPW.setBackground(Color.gray);
    ShowPW.setBounds(177, 135, 100, 20);
    ShowPW.addActionListener(this);
    container.add(ShowPW);
    
    // Login Button
    Login = new JButton("Login");
    Login.setFont(new Font("Arial", Font.PLAIN, 10));
    Login.setBounds(180, 160, 70, 20);
    Login.addActionListener(this);
    container.add(Login);
    
    // ForgotPW Button
    ForgotPW = new JButton("Forgot Password");
    ForgotPW.setFont(new Font("Arial", Font.PLAIN, 10));
    ForgotPW.setBounds(257, 160, 124, 20);
    ForgotPW.addActionListener(this);
    container.add(ForgotPW);
    
    // Accept Terms and Condition JCheckbox
    AcceptTnC = new JCheckBox("By using this app/site, you understood and agree to the");
    AcceptTnC.setFont(new Font("Arial", Font.PLAIN, 10));
    AcceptTnC.setBounds(100, 185, 300, 20);
    AcceptTnC.setBackground(Color.gray);
    AcceptTnC.addActionListener(this);
    container.add(AcceptTnC);
 
    // TnC JLabel
    TnC = new JLabel(text);
    TnC.setBounds(200, 200, 100, 20);
    TnC.setFont(new Font("Arial", Font.PLAIN, 10));
    TnC.setForeground(Color.BLUE.darker());
    
    // TnC JLabe link. Upon Clicking, TnC Contents will appear
    TnC.setCursor(new Cursor(Cursor.HAND_CURSOR));
    TnC.addMouseListener(new MouseAdapter() 
    {            
            @Override           
            public void mouseClicked(MouseEvent e) 
            {
            TnC.setText("<html><a href=''>" + text + "</a></html>");
            TnC_frame = new JFrame("EmE");
            TnC_frame.setSize(200, 100);
            TnC_frame.setLocationRelativeTo(null);
            TnC_frame.setLayout(null);
            TnC_frame.setBackground(Color.BLACK);
            
            Tnctext = new JLabel("EME LUNGS");
            Tnctext.setBounds(10,10,150,20);
            Tnctext.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
            Tnctext.setBackground(Color.BLACK);
            
            TnC_frame.add(Tnctext);
            TnC_frame.setVisible(true);
            }
    });
    
    container.add(TnC);
    container.setVisible(true);
    jf_TLogin_form.add(container);
    jf_TLogin_form.setVisible(true);
    }
    // Loginform() method end
    
    @Override
    public void actionPerformed(ActionEvent AE)
    {
        var UserName = Username.getText();
        var Password = Passwordfield.getText();
        
        if  (AE.getSource() == Login)
        {AccountGetterSetter fAccount = function.checkAccount(UserName, Password);
            if (fAccount != null && AcceptTnC.isSelected())
            {
                THP.TeacherHP();
//              jf_TLogin_form.dispose();
                jf_TLogin_form.setVisible(false);
            }
            
            else if (fAccount == null && !AcceptTnC.isSelected())
            {JOptionPane.showMessageDialog(this,"Invalid Username or Password!");}
            
            else if (!AcceptTnC.isSelected())
            {JOptionPane.showMessageDialog(this,"Please Read & Accept Terms and Conditions.");}
            
            else
            {JOptionPane.showMessageDialog(this,"Invalid Username or Password!");} 
        }
        
        
        if (AE.getSource() == ForgotPW)
        {
            AccountGetterSetter fFPWAccount = function.checkAccountFPW(UserName);
            AccountGetterSetter sFPWAccount = function.checkAccountFPW(UserName);
            if (fFPWAccount != null || sFPWAccount != null)
            {jf_TLogin_form.setVisible(false);
            System.out.println(new RecoverAccountUI());}
            
            else
            {JOptionPane.showMessageDialog(this,"Provide the Username First!");}
        }
        
        if (AE.getSource() == ShowPW)
        {
            if (ShowPW.isSelected()) 
            {Passwordfield.setEchoChar((char) 0);}
            else 
            {Passwordfield.setEchoChar('•');}
        }
        
        if (AE.getSource() == BackBttn)
        {System.out.print(new Main());
         jf_TLogin_form.setVisible(false);}
    }   
}  