import java.util.*;
class Posting{
    private int courseWork;
    private int AptTest;
    private int TechTest;
    private int interview;
    private int flag;
    Posting (int courseWork, int AptTest, int TechTest,int interview){
        this.courseWork=courseWork;
        this.AptTest=AptTest;
        this.TechTest=TechTest;
        this.interview=interview;
        flag=0;
    }
    Posting (int TechTest,int interview){
        this.TechTest=TechTest;
        this.interview=interview;
        flag=1;
    }
    Posting (int interview){
        this.interview=interview;
        flag=2;
    }
    void Display() {
        if (flag == 0) {
            System.out.println("Aap ne Programmer ke liye apply kiya hai:");
            int marks = courseWork + AptTest + TechTest + interview;
            if (marks > 80) {
                System.out.println("Badhai ho!! aap mai yogyata hai aap mumbai aa sakte ho");
            } else {
                System.out.println("Sorry! you failed the test");
            }
            ;
        } else if (flag == 1) {
            System.out.println("Aap ne Team Leader ke liye apply kiya hai:");
            int marks = TechTest + interview;
            if (marks > 85) {
                System.out.println("Badhai ho!! aap mai yogyata hai aap mumbai aa sakte ho");
            } else {
                System.out.println("Sorry! you failed the test");
            }
        } else {
            System.out.println("Aap ne Project Manager ke liye apply kiya hai:");
            int marks = interview;
            if (marks > 90) {
                System.out.println("Badhai ho!! aap mai yogyata hai aap mumbai aa sakte ho");
            } else {
                System.out.println("Sorry! you failed the test");
            }
        }
    }
 }

class PlacementTest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Aap ke pass 3 options hai kya karna chahege aap");
        System.out.println("Option1: Programmer\nOption2: Team Leader\nOption3: Project Manager");
        int option=sc.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter marks of Course Work");
                int courseWork=sc.nextInt();
                System.out.println("Enter marks of Aptitude Test");
                int AptTest=sc.nextInt();
                System.out.println("Enter marks of Tech Test");
                int TechTest=sc.nextInt();
                System.out.println("Enter marks of interview");
                int interview=sc.nextInt();
                Posting ob1=new Posting(courseWork,AptTest,TechTest,interview);
                ob1.Display();
                break;
            case 2:
                System.out.println("Enter marks of Tech Test");
                int TechTest1=sc.nextInt();
                System.out.println("Enter marks of interview");
                int interview1=sc.nextInt();
                Posting ob2=new Posting(TechTest1,interview1);
                ob2.Display();
                break;
            case 3:
                System.out.println("Enter marks of interview");
                int interview2=sc.nextInt();
                Posting ob3=new Posting(interview2);
                ob3.Display();
                break;
            default :
                System.out.println("Invalid choice");
        }
    }
}
