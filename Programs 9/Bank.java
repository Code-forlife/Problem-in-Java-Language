import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
abstract class Account{
    String name;
    double balance;
    long Acc_No;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void chk_balance();
}
class Saving_Acc extends Account{
    private double interestRate;
    static double SI =0;
    double minibalance=25000;
    Saving_Acc(String name,double amount){
        this.name=name;
        balance=amount;
        interestRate=0.3;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Done");
    }
    void withdraw(double amount){
        try{
            check(amount);
            balance-=amount;
            System.out.println("Done");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    void check (double amount)throws insuf_amoun_exp{
        if ((balance-amount)<minibalance){
            throw new insuf_amoun_exp("Bhai paisa ka hai tera paas");
        }
    }
    void chk_balance(){
        System.out.println("Abi aapake pass "+ balance+" Rupee hai. kya karnge etni dhanrashi ka");
    }
    public void addInterest ( int T){
        try
        {
            SI += (minibalance * T * interestRate) / 100;
        }
        catch(ArithmeticException e){}
    }
    class insuf_amoun_exp extends Exception{
        insuf_amoun_exp(String s){
            super(s);
        }
    }
}
public class Bank {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of customer: ");
        String name=sc.nextLine();
        System.out.print("Enter the Balance: ");
        double balance=sc.nextDouble();
        Saving_Acc p1= new Saving_Acc(name,balance);
        boolean flag=true;
        while(flag){
            System.out.println("============================================================================");
            System.out.println("aapake paas 6 vikalp hain jinhen aap chunenge");
            System.out.println("Option1: Deposit\nOption2: Withdraw\nOption3: Find Interest\nOption4: Check your Balance\nOption5:Exit");
            System.out.print("Enter Option : ");
            int option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Raashi Daalen : ");
                    int amount=sc.nextInt();
                    p1.deposit(amount);
                    break;

                case 2:
                    System.out.print("Raashi Daalen : ");
                    int amount2=sc.nextInt();
                    p1.withdraw(amount2);
                    break;
                case 3:
                    System.out.print("Enter no of years : ");
                    int tim2e=sc.nextInt();
                    p1.addInterest(tim2e);
                    break;
                case 4:
                    p1.chk_balance();
                    break;
                case 5:
                    flag=false;
                    System.out.println("Dhanyavaad, Ham aasha karate hain ki aapaka din shubh ho");
                    System.out.println("============================================================================");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
