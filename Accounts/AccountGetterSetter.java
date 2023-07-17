package Accounts;

public final class AccountGetterSetter {
    public enum AccountType
    {
        Faculty, // Professors/Teachers
        Student
    }
    private final String First_Name;
    private final String Last_Name;
    private final String Email, Username;
    private String Password;
    private final AccountType Type;
    
    AccountGetterSetter(String First_Name, String Last_Name, String Email, String Username, String Password, AccountType Type)
    {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;
        this.Type = Type;
    }
    
    public String getFirstname()
    { return First_Name; }
    
    public String getLastname()
    { return Last_Name; }
    
    public String getEmail()
    { return Email; }
    
    public String getUsername()
    { return Username; }
    
    public String getPassword()
    { return Password; }
    
    public AccountType getType()
    { return Type; }
    
    public void setPassword(String Password)
    { this.Password = Password; }
}
