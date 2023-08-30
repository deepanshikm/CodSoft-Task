import java.util.Scanner;
class ATM{
    float balance;
    int PIN = 2525;
    public void CheckPin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PIN here: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN)
            menu();

        else{
                System.out.println("Invalid PIN, Try again ");
                CheckPin();         
        }
    }

        public void menu () {
            System.out.println("Enter you Choice");
            System.out.println("1) Check Account Balance: ");
            System.out.println("2) Withdraw Money");
            System.out.println("3) Deposit Money");
            System.out.println("4) Exit");

            Scanner sc1 = new Scanner(System.in);
            int opt = sc1.nextInt();

            if (opt == 1)
                checkBalance();
            else if (opt == 2)
                WithdrawMoney();
            else if (opt == 3)
                DepositMoney();
            else if (opt == 4)
                return;
            else
                System.out.println("Enter a Valid Choice");
        }
    public void checkBalance(){
        System.out.println("Balance" + balance);
        menu();
    }
    public void WithdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to Withdraw Money: ");
        float amount = sc.nextFloat();

        if (amount > balance)
            System.out.println("Insufficient Balance..");
        else {
            balance = balance - amount;
            System.out.println("Money Withdrawal successfully: ");
        }
        menu();
    }
    public void DepositMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to Withdraw");
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposit Successfully....");
        menu();
    }

}

public class ATMInterface {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.CheckPin();

    }
}
