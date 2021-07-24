public class BankAccount {
    double balance;
    String name;

    public BankAccount(double accountBalance, String accountName)
    {
        balance= accountBalance;
        name = accountName;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double withdrawal)
    {
        balance -= withdrawal;
    }

}
