package Stack;
import java.util.Scanner;
public class s1{
    Scanner sc=new Scanner(System.in);
    public void push(int[] arr){
        if(stacklen(arr)==4){
            System.out.println("Stack full");
        }
        else{
            System.out.println("Enter the element not 0");
            int n=sc.nextInt();
            while(n==0){n= sc.nextInt();}
            arr[indexof(arr)]=n;
        }
    }
    public void pop(int[] arr){
        if(stacklen(arr)==0){
            System.out.println("empty");
        }
        else{
            int n=indexof(arr);
            if (n>0)
                arr[n-1]=0;
            else
                System.out.println("error");
        }
    }
    int stacklen(int[] arr){
        int len=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                len++;
        }
        return len;
    }
    int indexof(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                return i;
        }
        return -1;
    }
    public void display(int[] arr){
        for(int i=0;i<stacklen(arr);i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
