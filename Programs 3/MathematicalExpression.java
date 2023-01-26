import java.util.*;
class Test{

    double base;
    int power,logBase,argument;
    Test(){
        base=2;
        power=2;
        logBase=2;
        argument=2;
    }

    double calculate (double base, int power){
        return Math.pow(base,power);
    }
    double calculate (int logBase, int argument){
        return Math.log(argument)/Math.log(logBase);
    }
    void display(double num){
        System.out.println("Result = "+num);

    }
}
class MathematicalExpression{
    public static void main(String[] args){
        Test ob1 =new Test();
        double num1=ob1.calculate(2.0,4);
        ob1.display(num1);
        double num2=ob1.calculate(2,4);
        ob1.display(num2);

    }
}
