import java.util.*;
class Shape{
    int side;
    final float PI=3.14f;
    double getArea(){
        return 0;
    }
    int getPerimeter(){
        return 0;
    }
    int getside(){
        return 0;
    }
}
class Circle extends Shape{
    int getside(int n){
        side=n;
        return 0;
    }
    double getArea(){
        return PI*side*side;
    }
    int getPerimeter(){
        return 2*22*side/7;
    }
}
class Triangle extends Shape{
    int getside(int base){
        side=base;
        return 0;
    }
    double getArea(){
        return 1.7*side*side/4;
    }
    int getPerimeter(){
        return 3*side;
    }
}
class Pentagon extends Shape{
    int getside(int base){
        side=base;
        return 0;
    }
    double getArea(){
        return (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * side * side) / 4;
    }
    int getPerimeter(){
        return 5*side;
    }
}
class ShapesOfYou{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("What do you want ");
        System.out.println("1)Circle\n2)Triangle\n3)Pentagon  ");
        System.out.print("Your option: ");
        int option =sc.nextInt();
        switch(option){
            case 1:
                System.out.print("Enter the Radius: ");
                int side=sc.nextInt();
                Circle c1 =new Circle();
                c1.getside(side);
                System.out.println("Area: " + c1.getArea());
                System.out.println("Perimeter: "+c1.getPerimeter());
                break;
            case 2:
                System.out.print("Enter the Side: ");
                side=sc.nextInt();
                Triangle t1 =new Triangle();
                t1.getside(side);
                System.out.println("Area: " +t1.getArea());
                System.out.println("Perimeter: "+t1.getPerimeter());
                break;
            case 3:
                System.out.print("Enter the side of Pentagon: ");
                side=sc.nextInt();
                Pentagon p1 =new Pentagon();
                p1.getside(side);
                System.out.println("Area: " +p1.getArea());
                System.out.println("Perimeter: "+p1.getPerimeter());
                break;
            default:
                System.out.print("Goli beta masti naiiii!!!!!!!!!!!!! ");

        }
    }
}
