import java.util.*;
import java.lang.*;
class line{
    double m,c,y1,x1,y2,x2,x3,y3;
    int flag;
    line(double m,double c){
        this.m=m;
        this.c=c;
        flag=0;
    }
    line(double x1,double y1,double m){
        flag=1;
        this.x1=x1;
        this.y1=y1;
        this.m=m;
    }
    line(double x1,double y1,double x2,double y2){
        x3= x1-x2;
        y3=y1-y2;
        m=(y2-y1)/(x2-x1);
        flag=2;
    }
    void Display(){
        if (flag==0){
            System.out.printf("y = %.2fx + %.2f\n",m,c);
        }
        else if(flag==1){
            System.out.printf("(y-%.2f)=%.2f(x-%.2f)\n",y1,m,x1);
        }
        else if(flag==2){
            System.out.printf("(y-%.2f)/%.2f=%.2f(x-%.2f)/%.2f\n",y1,y3,m,x1,x3);
        }
    }
    void calculate(int x){
        if (flag==0){
            System.out.printf("y = %.2f",(m*x+c));
        }
        else if(flag==1){
            System.out.printf("y =%.2f",(m*(x-x1)+y1));
        }
        else if(flag==2){
            System.out.printf("y = %.2f", (m*(x - x1) / (x1 - x2)*(y1-y2)+y1));
        }
    }
}
public class Main {
    public static void main(String[]args){
        System.out.println("Enter 1 Given m and c");
        System.out.println("Enter 2 Given x1,y1 and m");
        System.out.println("Enter 3 Given x1 ,y1, x2 and y2");

        Scanner sc=new Scanner(System.in);
        int option= sc.nextInt();
        switch(option){
            case 1:
                System.out.print("Enter the slopes of line: ");
                int m= sc.nextInt();
                System.out.print("Enter the constant of line: ");
                int c= sc.nextInt();
                line l1=new line(m,c);
                l1.Display();
                System.out.println("Aapako x substitue karna hai kya?");
                boolean subs= sc.nextBoolean();
                if (subs){
                    System.out.println("Give the value of x: ");
                    int x=sc.nextInt();
                    l1.calculate(x);
                }
                break;
            case 2:
                System.out.print("Enter x1: ");
                int x1= sc.nextInt();
                System.out.print("Enter y1: ");
                int y1= sc.nextInt();
                System.out.print("Enter the slopes of line: ");
                int m1= sc.nextInt();
                line l2=new line(x1,y1,m1);
                l2.Display();
                System.out.println("Aapako x substitue karna hai kya?");
                boolean subs2= sc.nextBoolean();
                if (subs2){
                    System.out.println("Give the value of x: ");
                    int x=sc.nextInt();
                    l2.calculate(x);
                }
                break;
            case 3:
                System.out.print("Enter x1: ");
                int x11= sc.nextInt();
                System.out.print("Enter y1: ");
                int y11= sc.nextInt();
                System.out.print("Enter x2: ");
                int x2= sc.nextInt();
                System.out.print("Enter y2: ");
                int y2= sc.nextInt();
                line l3=new line(x11,y11,x2,y2);
                l3.Display();
                System.out.println("Aapako x substitue karna hai kya?");
                boolean subs3= sc.nextBoolean();
                if (subs3){
                    System.out.println("Give the value of x: ");
                    int x=sc.nextInt();
                    l3.calculate(x);
                }
                break;
            default:
                System.out.print("Invalid option");
                break;
        }
    }
}
