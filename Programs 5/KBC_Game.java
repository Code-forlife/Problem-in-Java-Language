import java.util.*;
class Testing{
    int grade=0;
    Scanner sc=new Scanner(System.in);
    int[] subans=new int[8];
    int[] ans={2,1,1,2,1,2,1,1};
    int[] ans1={1,2,2,1,2,1,2,2};
    void takeTest(){

        System.out.println("|||||||||||||||||||Welcome to KBC of my sons company|||||||||||||||||||||||||");
        System.out.println("Pehala Prashn) What is the vision of the company?");
        System.out.println("[1] Paisa hi Paisa hoga babu bhaiya \t [2] Pehala option mera usoolo ke khilaaf hai");
        System.out.print("Your answer: ");
        subans[0]=sc.nextInt();
        System.out.println("Doosara Prashn) How long will you stay in this role?");
        System.out.println("[1] Till Comapny is Rich  \t [2] Till I am Rich ");
        System.out.print("Your answer: ");
        subans[1]=sc.nextInt();
        System.out.println("Teesara Prashn) What is final method in Java?");
        System.out.println("[1] Constant \t [2] Second Keyword of static");
        System.out.print("Your answer: ");
        subans[2]=sc.nextInt();
        System.out.println("Chautha Prashn) What is the latest version of Java?");
        System.out.println("[1] Java 19 \t [2] Java 17");
        System.out.print("Your answer: ");
        subans[3]=sc.nextInt();
        System.out.println("Paanchavaan Prashn) What did you learn about Java in last job?");
        System.out.println("[1] To print hello world \t [2] To code a website ");
        System.out.print("Your answer: ");
        subans[4]=sc.nextInt();
        System.out.println("Chhatha Prashn) What do you wish to learn?");
        System.out.println("[1] C++  \t [2] Python ");
        System.out.print("Your answer: ");
        subans[5]=sc.nextInt();
        System.out.println("Saataveen Prashn) What makes a team successful?");
        System.out.println("[1] Team work \t [2] Leadership");
        System.out.print("Your answer: ");
        subans[6]=sc.nextInt();
        System.out.println("Aathva Prashn) Do you work faster in team or as individual?");
        System.out.println("[1] Team \t [2] Individual");
        System.out.print("Your answer: ");
        subans[7]=sc.nextInt();
    }
}
class Recruitment extends Testing{
    void generateResult(){
        for(int i=0;i<8;i++){
            if(subans[i]==ans[i])
                grade+=10;
            else if(subans[i]==ans1[i])
                grade+=5;
        }
        double percentage=(double)grade/80*100;
        if (percentage>60)
            System.out.println("Done");
        else
            System.out.println("Not done");
    }
}
public class KBC_Game
{
    public static void main(String[] args) {
        Recruitment[] person =new Recruitment[6];
        for(int i=0;i<6;i++){
            person[i]=new Recruitment();
            person[i].takeTest();
            person[i].generateResult();
        }
    }
}
