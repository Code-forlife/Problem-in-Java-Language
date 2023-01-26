import java.util.*;
class Employee{
    private String name, id;
    private int age;
    Employee(String name, String id, int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }
    void getempl(){
        System.out.println("The name of the employee is: "+name);
        System.out.println("The id of the employee is: "+id);
        System.out.println("The age of the employee is: "+age);
    }
}
class SalariedEmployee extends Employee{
    private double emp_sal;
    SalariedEmployee(String name, String id, int age,double emp_sal){
        super(name,id,age);
        this.emp_sal=emp_sal;
    }
    void print_out(){
        getempl();
        System.out.print("Enter the type of employee: ");
        Scanner sc=new Scanner(System.in);
        String emp= sc.nextLine();
        if(emp.equals("permanent")||emp.equals("Permanent")){
            emp_sal+=2000;
        }
        System.out.println("The Employee salary is: "+emp_sal);
    }
}
class Testor{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        SalariedEmployee[] emp1=new SalariedEmployee[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter the name of Emplyoee: ");
            String name=sc.nextLine();
            System.out.print("Enter the id of Emplyoee: ");
            String id=sc.nextLine();
            System.out.print("Enter the age of Emplyoee: ");
            int age=sc.nextInt();
            System.out.print("Enter the Salary of Emplyoee: ");
            double Salary=sc.nextDouble();
            emp1[i]=new SalariedEmployee(name,id,age,Salary);
            emp1[i].print_out();
           sc.nextLine();
        }
    }
}