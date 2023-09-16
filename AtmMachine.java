import java.util.Scanner;

class Atm{
    int balance =1000;
    int pin=9691;
    public  void checkpin()
    {
        System.out.println("enter your pin: ");
        Scanner sc=new Scanner(System.in);
        int Enteredpin = sc.nextInt();
        if (Enteredpin==pin){
            menu();
        }
        else{
            System.out.println("invalid pin:");
        }
    }

    public void menu(){
        System.out.println("welcome to ATM :");
        System.out.println("1. Check balance :");
        System.out.println("2. Withdraw :");
        System.out.println("3. Deposit :");
        System.out.println("4. Exit :");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice==1)
        {
            Checkbalance();
        } else if (choice==2) {
            Withdraw();
        } else if (choice==3) {
            Deposit();
        } else if (choice==4) {
            return;
        }
        else{
            System.out.println("Enter a valid choice :");
        }

    }

    public void Checkbalance(){
        System.out.println("balance: "+balance);
        menu();
    }

    public void Withdraw(){
        System.out.println("Enter the Amount :");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount>balance){
            System.out.println("insufficient balance");
        }
        else{
            balance = balance-amount;
            System.out.println("Withdraw");
        }
        menu();
    }

    public void Deposit(){
        System.out.println("Enter the amount :");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance=balance+amount;
        System.out.println("Deposited");
        menu();
    }
}


public class AtmMachine {
    public static void main(String[] args)
    {
       Atm obj= new Atm();
       obj.checkpin();
    }
}