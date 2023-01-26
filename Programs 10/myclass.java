import mypac.*;
import java.util.Scanner;
class myclass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Reverse_String s1=new Reverse_String();
        System.out.print("Enter a sentence: ");
        String s=sc.nextLine();
        System.out.println(s1.ReversIt(s));
    }
}
