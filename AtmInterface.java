import java.util.Scanner;

class BankAccount {
    private double Balance;
    static BankAccount b = new BankAccount();

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public static void withdrawAmount(double amount) {

        if (amount > b.Balance)
            System.out.println("UNSUFFIECIENT BALANCE !");
        double newBalance = 0;
        newBalance = b.Balance - amount;
        System.out.println("AMOUNT WITHDRAWN IS = " + amount + " NEW BALANCE IS = " + newBalance);
        b.Balance = newBalance;
        menu();
    }

    public static void depositAmount(double amount) {
        double newBalance = b.Balance + amount;
        System.out.println("AMOUNT DEPOSITED IS = " + amount + " NEW BALANCE IS = " + newBalance);
        b.Balance = newBalance;
        menu();
    }

    public static void checkBlanace() {
        System.out.println("AVAILABLE BALANCE IS = " + b.Balance);
        menu();
    }

    public static void exits() {
        return;
    }

    public static void menu() {
        System.out.println("1) WITHDRAW AMOUNT ");
        System.out.println("2) DEPOSIT  AMOUNT ");
        System.out.println("3) CHECK  AMOUNT ");
        System.out.println("4) EXIT ");
        System.out.println(" CHOOSE YOUR OPERATION ");

        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();

        switch (ch) {
            case 1:
                System.out.println("ENTER THE AMOUNT : ");
                Double amt = s.nextDouble();
                withdrawAmount(amt);
                break;
            case 2:
                System.out.println("ENTER THE AMOUNT : ");
                Double amt1 = s.nextDouble();
                depositAmount(amt1);
                break;
            case 3:
                checkBlanace();
                break;
            case 4:
                exits();
                break;
            default:
                System.out.println("INVALID INPUT : ");
                break;
        }
        s.close();
    }
}

public class AtmInterface extends BankAccount {

    public static void main(String[] args) {

        System.out.println(" WELCOME TO ATM ");
        menu();

    }

}