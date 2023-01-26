import java.util.*;
import java.lang.*;

class bank{
    private double balance;
    private static double ROI_saving;
    bank(){
        balance=1000;
        ROI_saving=0.3;
    }

    bank(double amount){
        balance=amount;
        ROI_saving=0.3;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(int amount){
        if(balance<=0){System.out.println("aapake khaate mein paryaapt paisa nahin hai");}
        else{balance-=amount;}
    }

    public void chk_balance(){System.out.println("Abi aapake pass "+ balance+" Rupee hai. kya karnge etni dhanrashi ka");}

    public void compund_interest(int t,int n){
        double r=0.5;
        double amount = balance * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - balance;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }

    public void simple_interest(int T){
        double SI = (balance * T * ROI_saving) / 100;
        System.out.println("Simple interest = " + SI);
    }
}

class file{
    public static void main(String[] args){
        bank p1= new bank();
        Scanner sc =new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("============================================================================");
            System.out.println("aapake paas 6 vikalp hain jinhen aap chunenge");
            System.out.println("Option1: Deposit\nOption2: Withdraw\nOption3: Find compound Interest\nOption4: Simple Interest\nOption5: Check your Balance\nOption6:Exit");
            System.out.print("Enter Option : ");
            int option=sc.nextInt();

            switch(option){
                case 1:
                    System.out.print("Raashi Daalen : ");
                    int amount=sc.nextInt();
                    p1.deposit(amount);
                    break;

                case 2:
                    System.out.print("raashi daalen : ");
                    int amount2=sc.nextInt();
                    p1.withdraw(amount2);
                    break;

                case 3:
                    System.out.print("Enter Time : ");
                    int time=sc.nextInt();
                    System.out.println("Enter number of times that interest is compounded per unit time: ");
                    int n=sc.nextInt();
                    p1.compund_interest(time,n);
                    break;
                case 4:
                    System.out.print("Enter no of years : ");
                    int tim2e=sc.nextInt();
                    p1.simple_interest(tim2e);
                    break;
                case 5:
                    p1.chk_balance();
                    break;
                case 6:
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