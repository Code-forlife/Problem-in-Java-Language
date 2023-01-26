class Employee{
    int sal = 10000;
    int getSalary(){
        return 10000;
}
    int getbonus(){
        return 0;
    }
}
class Intern extends Employee{
    int getSalary(){
        return 3*(sal/4);
    }
    int getbonus(){
        return 1000;
    }
}
class clerk extends Employee{
    int getSalary(){
        return (sal/2);
    }
    int getbonus(){
        return 500;
    }
}
class Manager extends Employee{
    int getSalary(){
        return 2*(sal);
    }
    int getbonus(){
        return 10000;
    }
}
public class CompanyInfo
{
    public static void main(String[] args) {
        Intern i = new Intern();
        clerk c = new clerk();
        Manager m = new Manager();
        System.out.println("Intern salary + bonus = " + (i.getSalary()+i.getbonus()));
        System.out.println("Clerk salary + bonus = " + (c.getSalary()+c.getbonus()));
        System.out.println("Manager salary + bonus = " + (m.getSalary()+m.getbonus()));
    }
}
