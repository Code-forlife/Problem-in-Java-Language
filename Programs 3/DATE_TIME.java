import java.util.*;
import java.lang.*;
class Date{
    int year1,month1,date1,hour1,minute1,second1,flag;
    String[] m={"in","January","February","March","April","May","June","July","August","September","October","November","December"};
    Date() {
        year1 = 2000;
        month1 = 01;
        date1 = 01;
        hour1 = 00;
        minute1 = 00;
        second1 = 00;
    }
    void setDate(int year, int month, int date)
    {
       year1=year;
       month1=month;
       date1=date;
      flag=0;
      display();
    }
    void setDate(int year, int month, int date, int hour, int minute){
        year1=year;
        month1=month;
        date1=date;
        minute1=minute;
        hour1=hour;
        flag=1;
        display();
    }
    void setDate(int year, int month, int date, int hour, int minute, int second){
        year1=year;
        month1=month;
        date1=date;
        minute1=minute;
        hour1=hour;
        second1=second;
       flag=2;
        display();
    }
    void display(){
        if(flag==0){
            System.out.println(m[month1]+" "+date1+","+year1);
        } else if (flag==1) {
            System.out.println(m[month1]+" "+date1+","+year1+","+hour1+":"+minute1);
        } else if(flag==2) {
            System.out.println(m[month1]+" "+date1+","+year1+","+hour1+":"+minute1+":"+second1);
        }
    }
}
public class DATE_TIME {
    public static void main(String[]args){
        int yrs,mon,d,h,min,s;
        System.out.println("Enter 1 for Year,Month and Date");
        System.out.println("Enter 2 for Year,Month,Date,Hours and Minutes");
        System.out.println("Enter 3 for Year,Month,Date,Hours,Minutes and seconds");
        Date obj=new Date();
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter year");
                 yrs= sc.nextInt();
                System.out.println("Enter month number");
                 mon= sc.nextInt();
                 while(mon>12|| mon<=0){
                	System.out.println("Aandhe hai kya, phir se dal");
                	mon= sc.nextInt();
                }
                System.out.println("Enter date");
                 d= sc.nextInt();
                obj.setDate(yrs,mon,d);

                break;
            case 2:
                System.out.println("Enter year ");
                yrs= sc.nextInt();
                System.out.println("Enter month number ");
                mon= sc.nextInt();
                while(mon>12|| mon<=0){
                	System.out.println("Aandhe hai kya, phir se dal");
                	mon= sc.nextInt();
                }
                System.out.println("Enter date ");
                 d= sc.nextInt();
                System.out.println("Enter hour");
                h=sc.nextInt();
                System.out.println("Enter minutes");
                 min= sc.nextInt();
                obj.setDate(yrs,mon,d,h,min);

                break;
            case 3:
                System.out.println("Enter year ");
                yrs= sc.nextInt();
                System.out.println("Enter month number ");
                mon= sc.nextInt();
                while(mon>12|| mon<=0){
                	System.out.println("Aandhe hai kya, phir se dal");
                	mon= sc.nextInt();
                }
                System.out.println("Enter date ");
                d= sc.nextInt();
                System.out.println("Enter hour");
                 h=sc.nextInt();
                System.out.println("Enter minutes");
                min= sc.nextInt();
                System.out.println("Enter seconds");
                 s= sc.nextInt();
                obj.setDate(yrs,mon,d,h,min,s);

                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
