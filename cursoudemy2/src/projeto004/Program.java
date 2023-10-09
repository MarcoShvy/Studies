package projeto004;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(333, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(334, "Maria", 0.0, 600.00);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(335, "bob", 0.0, 300.00);
        Account acc3 = new SavingAccounts();

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
        }

        //if (acc3 instanceof SavingAccounts) {
            //SavingAccounts acc5 = (SavingAccounts) acc3;
            //acc5.uptadeBalance();
        //}

        Account nAcc1 = new Account(1000, "Alex", 1000.0);
        Account nAcc2 = new BusinessAccount(1001, "Maria", 1000.0, 500.0);
        Account nAcc3 = new SavingAccounts(1002, "Bob", 1000.0, 0.1);

        nAcc1.withdraw(200.0);
        nAcc2.withdraw(200.0);
        nAcc3.withdraw(200.0);
        System.out.println(nAcc1.getBalance());
        System.out.println(nAcc2.getBalance());
        System.out.println(nAcc3.getBalance());
    }
}
