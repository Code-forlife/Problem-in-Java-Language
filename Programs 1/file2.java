import java.util.Scanner;
class Fibonacci_series{
    int number;
    void set(int n){
        number=n;
    }
    int fibbo(int nu){
        if (nu==1){
            return 0;
        }
        else if (nu==2){
            return 1;
        }
        else{
            return fibbo(nu-1)+fibbo(nu-2);
        }

    }
    void display(){
        for(int i=1;i<=number;i++){
            System.out.print(fibbo(i)+" ");

        }
    }
}
class file2{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        Fibonacci_series f1 =new Fibonacci_series();
        f1.set(num);
        f1.display();
    }
}