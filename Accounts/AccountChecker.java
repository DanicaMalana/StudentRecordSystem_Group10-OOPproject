package Accounts;

import java.util.*;

public class AccountChecker {
    public static final UserAccounts data = new UserAccounts();
    private final ArrayList <AccountGetterSetter> accounts = data.getAccounts();
    
    public AccountGetterSetter checkAccount(String Username, String password){
        for (AccountGetterSetter account : accounts) 
        {
            if (account.getUsername().equals(Username) 
                && account.getPassword().equals(password) 
                && account.getType().equals(AccountGetterSetter.AccountType.Faculty)
                || 
                account.getUsername().equals(Username) 
                && account.getPassword().equals(password) 
                && account.getType().equals(AccountGetterSetter.AccountType.Student)) 
                {return account;}
        }
        return null;
    }
    
    public AccountGetterSetter checkAccountFPW(String Email){
        for (AccountGetterSetter account : accounts) 
        {
            if  (account.getUsername().equals(Email) 
                && account.getType().equals(AccountGetterSetter.AccountType.Faculty)
                || account.getUsername().equals(Email) 
                && account.getType().equals(AccountGetterSetter.AccountType.Student)) 
                {return account;}
        }
        return null;
    }
    
}