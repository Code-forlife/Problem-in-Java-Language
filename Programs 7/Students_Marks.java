abstract class Marks{
    abstract void getPercentage();
}
class A extends Marks{
    int m1,m2,m3;
    A(int m1,int m2,int m3){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void getPercentage(){
        System.out.println("Percentage of A: "+((m1+m2+m3)/3));
    }
}
class B extends Marks{
    int m1,m2,m3,m4;
    B(int m1,int m2,int m3,int m4){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
    }
    void getPercentage(){
        System.out.println("Percentage of B: "+((m1+m2+m3+m4)/4));
    }
}
public class Students_Marks {
    public static void main(String[] args) {
        A p1 =new A(60,70,80);
        B p2=new B(60,70,80,90);
        p1.getPercentage();
        p2.getPercentage();
    }
}
