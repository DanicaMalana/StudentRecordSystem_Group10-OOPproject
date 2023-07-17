package Accounts;

import java.util.*;

public final class UserAccounts {
    ArrayList <AccountGetterSetter> accounts = new ArrayList<AccountGetterSetter>();
    
    public ArrayList<AccountGetterSetter> getAccounts()
    { 
            //Teacher/s Account
            AccountGetterSetter Teacher = new AccountGetterSetter
            ("Tea", "Cher", "Teacher1@gmail.com", "Teacher", "Teacher123", AccountGetterSetter.AccountType.Faculty);
            accounts.add(Teacher);
            
            AccountGetterSetter Teacher2 = new AccountGetterSetter
            ("Tea", "Cher", "Teacher2@gmail.com", "Teacher2", "Teacher123", AccountGetterSetter.AccountType.Faculty);
            accounts.add(Teacher2);
            
            //Student/s Account
            AccountGetterSetter Student1 = new AccountGetterSetter
            ("Jaspher", "Baet", "JaspherBaet@gmail.com", "2021-00001-BN-0", "Jaspher123", AccountGetterSetter.AccountType.Student);
            accounts.add(Student1);
            
            AccountGetterSetter Student2 = new AccountGetterSetter
            ("Danica", "Malana", "DanicaMalana@gmail.com", "2021-00002-BN-0", "Danica123", AccountGetterSetter.AccountType.Student);
            accounts.add(Student2);
            
            AccountGetterSetter Student3 = new AccountGetterSetter
            ("John Christoper", "Remolacio", "JohnRemolacio@gmail.com", "2021-00003-BN-0", "JC123", AccountGetterSetter.AccountType.Student);
            accounts.add(Student3);
            
            AccountGetterSetter Student4 = new AccountGetterSetter
            ("Justine Irish", "Diolata", "JustineDiolata@gmail.com", "2021-00004-BN-0", "JI123", AccountGetterSetter.AccountType.Student);
            accounts.add(Student4);
            
            AccountGetterSetter Student5 = new AccountGetterSetter
            ("Patricia", "Sison", "Patricia@gmail.com", "2021-00005-BN-0", "Patricia123", AccountGetterSetter.AccountType.Student);
            accounts.add(Student5);
            
            
        return accounts; 
    }
}
