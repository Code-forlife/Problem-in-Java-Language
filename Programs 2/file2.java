import java.util.*;
class file2 {
    Scanner sc = new Scanner(System.in);
    int a,b,c,d;
    int num,den,gcd;
    file2() {
        a = 1;
        b = 1;
        c = 1;
        d = 1;
    }
    void input() {
        System.out.println("Numerator 1: ");
        a = sc.nextInt();
        System.out.println("Denominator 1: ");
        b = sc.nextInt();
        System.out.println("Numerator 2: ");
        c = sc.nextInt();
        System.out.println("Denominator 2: ");
        d = sc.nextInt();
    }
    void add() {
        num = a*d + b*c;
        den = b*d;
        gcd = reduce(num, den);
        System.out.println("Add kar diya: "+num/gcd+"/"+den/gcd);
    }
    void sub() {
        num = a*d - b*c;
        den = b*d;
        gcd = reduce(num, den);
        System.out.println("substrate kar diya: "+num/gcd+"/"+den/gcd);
    }
    void mul() {
        num = a*c;
        den = b*d;
        gcd = reduce(num, den);
        System.out.println("Multiply kar diya: "+num/gcd+"/"+den/gcd);
    }
    void div() {
        num = a*d;
        den = b*c;
        gcd = reduce(num, den);
        System.out.println("Divide kar diya: "+num/gcd+"/"+den/gcd);
    }
    int reduce(int n,int d) {
        if(d==0)
            return n;
        else if(n==0)
            return d;
        if(n>d)
            return reduce(n-d, d);
        else
            return reduce(d-n, n);
    }
    void multiplier(int a,int b,int c,int d) {
        num = a*c;
        den = b*d;
        gcd = reduce(num, den);
        System.out.print("\t"+num/gcd+"/"+den/gcd);
    }
    void mul_table(int d) {
        den = d;
        for(int k=1;k<d;k++) {
            num = k;
            gcd = reduce(num, den);
            System.out.print("\t"+num/gcd+"/"+den/gcd);
        }
        System.out.println("\n----------------------------------------------------------------------\n");
        for(int i=1;i<d;i++) {
            num = i;
            den = d;
            gcd = reduce(num, den);
            System.out.print(num/gcd+"/"+den/gcd);
            for(int j=1;j<d;j++) {
                multiplier(i, d, j, d);
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        file2 f = new file2();
        int choice,dem,flag;
        System.out.println("Welcome to Calculator:");
        while(true) {
            System.out.println("Apka pass 5 options hai\n1 -> Addition\n2 -> Subtraction\n3 -> Multiplication\n4 -> Division\n5 -> Multiple Table");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    f.input();
                    f.add();
                    break;
                case 2:
                    f.input();
                    f.sub();
                    break;
                case 3:
                    f.input();
                    f.mul();
                    break;
                case 4:
                    f.input();
                    f.div();
                    break;
                case 5:
                    System.out.println("Enter the Denominator: ");
                    dem = sc.nextInt();
                    f.mul_table(dem);
                    break;
                default:
                    System.out.println("Likhane nahi ata hai kya?!?!?");
                    break;
            }
            System.out.println("Aur kuch?(yes=1/0=no)");
            flag = sc.nextInt();
            if(flag==0) {
                System.out.println("Ok bye bye!!");
                break;
            }
        }
    }
}