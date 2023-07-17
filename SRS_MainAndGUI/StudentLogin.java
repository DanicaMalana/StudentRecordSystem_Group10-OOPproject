package SRS_MainAndGUI;

import SRS_Profiles.StudentHomepage;
import SRS_Profiles.StudentHomepage2;
import SRS_Profiles.StudentHomepage4;
import SRS_Profiles.StudentHomepage5;
import SRS_Profiles.StudentHomepage3;
import Accounts.AccountChecker;
import Accounts.AccountGetterSetter;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;
//import javax.swing.event.HyperlinkEvent;
//import javax.swing.event.HyperlinkListener;

public final class StudentLogin extends JFrame implements ActionListener{  
    
    // JavaSwing Components  
    JFrame jf_SLogin_form, TnC_frame;
    JPanel container;
    JLabel SSFHead, UN, PW, Tnctext;
    JPasswordField Passwordfield;
    JTextField Username;
    JButton Login, ForgotPW, BackBttn;
    JCheckBox ShowPW, AcceptTnC;
    String text = "Terms & Conditions";
    JLabel TnC;

    private final AccountChecker function = new AccountChecker();
    
    // Constructor
    public StudentLogin(){ 
    // Calling the Method/s
        Loginform();
    }  
    // Back button method
    public void BackButton(){
        BackBttn = new JButton("Back");
        BackBttn.setFont(new Font("Arial", Font.PLAIN, 10));
        BackBttn.setBounds(10, 10, 80, 20);
        BackBttn.addActionListener(this);
        jf_SLogin_form.add(BackBttn);
    }
    
    // Loginform() Method
    public void Loginform()
    {    
    // JFrame/& title
    jf_SLogin_form = new JFrame("Login Form");
    jf_SLogin_form.setSize(500, 390);
    jf_SLogin_form.setLocationRelativeTo(null);
    jf_SLogin_form.setLayout(null);
    jf_SLogin_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf_SLogin_form.getContentPane().setBackground(new Color(6,11,88));
    
    BackButton();
    
    container = new JPanel();
    container.setLayout(null);
    container.setBounds(15, 40, 455, 300);
    container.setBackground(new Color(228,215, 46));
    
    // Teacher Login JLabel
    SSFHead = new JLabel("Student Log-in");  
    SSFHead.setBounds(190, 20, 150,30);
    container.add(SSFHead);

    // JLabel & JTextField
    UN = new JLabel("Student ID: ");  
    UN.setBounds(90,10, 120,135);
    container.add(UN);
    Username = new JTextField();
    Username.setBounds(170, 70, 200, 20);
    container.add(Username);
    
    // JLabel & JPasswordField
    PW = new JLabel("Password: ");  
    PW.setBounds(90,100, 120,40);
    container.add(PW);
    Passwordfield = new JPasswordField();
    Passwordfield.setBounds(170, 112, 200, 20);
    container.add(Passwordfield);
    
    // showPW JCkeckbox
    ShowPW = new JCheckBox("Show Password");
    ShowPW.setFont(new Font("Arial", Font.PLAIN, 10));
    ShowPW.setBackground(new Color(228,215, 46));
    ShowPW.setBounds(167, 135, 100, 20);
    ShowPW.addActionListener(this);
    container.add(ShowPW);
    
    // Login Button
    Login = new JButton("Login");
    Login.setFont(new Font("Arial", Font.PLAIN, 10));
    Login.setBounds(170, 160, 70, 20);
    Login.addActionListener(this);
    container.add(Login);
    
    // ForgotPW Button
    ForgotPW = new JButton("Forgot Password");
    ForgotPW.setFont(new Font("Arial", Font.PLAIN, 10));
    ForgotPW.setBounds(247, 160, 124, 20);
    ForgotPW.addActionListener(this);
    container.add(ForgotPW);
    
    // Accept Terms and Condition JCheckbox
    AcceptTnC = new JCheckBox("By using this app/site, you understood and agree to the");
    AcceptTnC.setFont(new Font("Arial", Font.PLAIN, 10));
    AcceptTnC.setBounds(90, 185, 300, 20);
    AcceptTnC.setBackground(new Color(228,215, 46));
    AcceptTnC.addActionListener(this);
    container.add(AcceptTnC);
 
    // TnC JLabel
    TnC = new JLabel(text);
    TnC.setBounds(190, 200, 100, 20);
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
    jf_SLogin_form.add(container);
    jf_SLogin_form.setVisible(true);
    }
    // Loginform() method end
    
    @Override
    public void actionPerformed(ActionEvent AE)
    {
        var UserName = Username.getText();
        var Password = Passwordfield.getText();
        
        if  (AE.getSource() == Login)
        {
            AccountGetterSetter sAccount = function.checkAccount(UserName, Password);
            
            if (sAccount != null && AcceptTnC.isSelected() 
             && sAccount.getUsername().equals("2021-00001-BN-0") 
             && sAccount.getPassword().equals("Jaspher123")) 
            {
                System.out.println(new StudentHomepage());
//              jf_TLogin_form.dispose();
                jf_SLogin_form.setVisible(false);
            }
            else if (sAccount != null && AcceptTnC.isSelected() 
             && sAccount.getUsername().equals("2021-00002-BN-0") 
             && sAccount.getPassword().equals("Danica123")) 
            {
                System.out.println(new StudentHomepage2());
//              jf_TLogin_form.dispose();
                jf_SLogin_form.setVisible(false);
            }
            else if (sAccount != null && AcceptTnC.isSelected() 
             && sAccount.getUsername().equals("2021-00003-BN-0") 
             && sAccount.getPassword().equals("JC123")) 
            {
                System.out.println(new StudentHomepage3());
//              jf_TLogin_form.dispose();
                jf_SLogin_form.setVisible(false);
            }
            else if (sAccount != null && AcceptTnC.isSelected() 
             && sAccount.getUsername().equals("2021-00004-BN-0") 
             && sAccount.getPassword().equals("JI123")) 
            {
                System.out.println(new StudentHomepage4());
//              jf_TLogin_form.dispose();
                jf_SLogin_form.setVisible(false);
            }
            else if (sAccount != null && AcceptTnC.isSelected() 
             && sAccount.getUsername().equals("2021-00005-BN-0") 
             && sAccount.getPassword().equals("Patricia123")) 
            {
                System.out.println(new StudentHomepage5());
//              jf_TLogin_form.dispose();
                jf_SLogin_form.setVisible(false);
            }
            
            else if (sAccount == null && !AcceptTnC.isSelected())
            {JOptionPane.showMessageDialog(this,"Invalid Username or Password!");}
            
            else if (!AcceptTnC.isSelected())
            {JOptionPane.showMessageDialog(this,"Please Read & Accept Terms and Conditions.");}
            
            else
            {JOptionPane.showMessageDialog(this,"Invalid Username or Password!");} 
        }
        
        
        if (AE.getSource() == ForgotPW)
        {
            AccountGetterSetter sFPWAccount = function.checkAccountFPW(UserName);
            if (sFPWAccount != null)
            {jf_SLogin_form.setVisible(false);
            System.out.println(new RecoverAccountUI(sFPWAccount));}
            
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
         jf_SLogin_form.setVisible(false);}
    }   
}  