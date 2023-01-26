import Stack.s1;
import java.util.Scanner;
class newmain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int[] arr=new int[5];
        while(i<5){
            System.out.println("1) Push\t2) Pop");
            int option =sc.nextInt();
            s1 s =new s1();
            if(option==1){
                s.push(arr);
                s.display(arr);
                i++;
            }
            else if(option==2){
                s.pop(arr);
                s.display(arr);
                i++;
            }
            else{System.out.println("Wrong option");}
        }
        System.out.println("");
    }
}
