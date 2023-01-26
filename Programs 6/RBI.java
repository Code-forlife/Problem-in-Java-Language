import java.util.*;
class Bank{
    int get_rate_of_interest(){
        int interest = 2;
        return 2;
    }
}
class SBI_Bank extends Bank{
    double get_rate_of_interest(int t){
        if(t>=7 && t<= 14){
            return 3;
        }
        if(t>=15 && t<= 30){
            return 3;
        }
        if(t>=31 && t<= 45){
            return 3;
        }
        if(t>=46 && t<= 90){
            return 4.05;
        }
        if(t>=91 && t<= 120){
            return 4.10;
        }
        if(t>=121 && t<= 180){
            return 4.10;
        }
        return 2;
}
}
class ICICI_Bank extends Bank{
    double get_rate_of_interest(int t){
        if(t>=7 && t<= 14){
            return 3.1;
        }
        if(t>=15 && t<= 30){
            return 3.2;
        }
        if(t>=31 && t<= 45){
            return 3.5;
        }
        if(t>=46 && t<= 90){
            return 4.5;
        }
        if(t>=91 && t<= 120){
            return 4.7;
        }
        if(t>=121 && t<= 180){
            return 4.9;
        }
        return 2;
}
}
class AXIS_Bank extends Bank{
    double get_rate_of_interest(int t){
        if(t>=7 && t<= 14){
            return 3.15;
        }
        if(t>=15 && t<= 30){
            return 3.15;
        }
        if(t>=31 && t<= 45){
            return 3.45;
        }
        if(t>=46 && t<= 90){
            return 4.05;
        }
        if(t>=91 && t<= 120){
            return 4.70;
        }
        if(t>=121 && t<= 180){
            return 5;
        }
        return 2;
    }
}
public class RBI
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t1,t2,t3;
    SBI_Bank sbi = new SBI_Bank();
    ICICI_Bank icici = new ICICI_Bank();
    AXIS_Bank axis = new AXIS_Bank();
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    Calendar c3 = Calendar.getInstance();
    int day ;
    int month;
    int year;
    System.out.print("Enter today's date,month and year: ");
    day = sc.nextInt();
    month = sc.nextInt();
    year = sc.nextInt();
    System.out.print("Enter time period for SBI: ");
    t1=sc.nextInt();
    System.out.println("Final value in $ is "+(float)(10000*Math.pow((1+(sbi.get_rate_of_interest(t1)/100)),(float)t1/365)));
    System.out.print("Date of maturity: ");
    c1.set(year,month-1,day);
    c1.add(Calendar.DATE, t1);
    System.out.println(c1.getTime());
    System.out.print("Enter time period for ICICI: ");

    t2=sc.nextInt();

    System.out.println("Final value in $ is "+(float)(12500*Math.pow((1+(icici.get_rate_of_interest(t2)/100)),(float)t2/365)));
    System.out.print("Date of maturity: ");
    c2.set(year,month-1,day);
    c2.add(Calendar.DATE, t2);
    System.out.println(c2.getTime());
    System.out.print("Enter time period for AXIS: ");

    t3=sc.nextInt();
    System.out.println("Final value in $ is "+(float)(20000*Math.pow((1+(axis.get_rate_of_interest(t3)/100)),(float)t3/365)));
    System.out.print("Date of maturity: ");
    c3.set(year,month-1,day);
    c3.add(Calendar.DATE, t3);
    System.out.println(c3.getTime());
}
}
