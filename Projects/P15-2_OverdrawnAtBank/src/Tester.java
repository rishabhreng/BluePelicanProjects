public class Tester {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000, "Rishabh Rengarajan");
        myAccount.deposit(505.22);
        System.out.println(myAccount.balance);
        myAccount.withdraw(100);

        System.out.println("The " + myAccount.name + " account balance is: " + myAccount.balance);
    }
}
