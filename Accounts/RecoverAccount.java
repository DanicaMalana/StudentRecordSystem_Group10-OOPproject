package Accounts;

public class RecoverAccount{
    UserAccounts checkAccount = new UserAccounts();
    
    public AccountGetterSetter FindAccountByEmail(String FPWEmail)
    {
        var Accounts = checkAccount.getAccounts();
        for (var accounts : Accounts)
        {
            if (accounts.getEmail().equals(FPWEmail))
            {return accounts; }
        }
        return null;
    }
}
