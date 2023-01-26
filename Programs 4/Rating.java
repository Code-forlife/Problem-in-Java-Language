import java.util.Scanner;
class bookrating{
    double rating,average;
    Scanner sc = new Scanner(System.in);
    String name;
    int user;
    bookrating(String name, int user){
        rating=0;
        average=0;
        this.name=name;
        this.user=user;
    }
    void setAverage(){
        double sum=0;
        for(int i=0;i<user;i++){
            System.out.print("reting darj karen: ");
            double rating=sc.nextDouble();
            sum+=rating;
        }
        average=sum/user;
    }
}
public class Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n=sc.nextInt();
        bookrating[] b= new bookrating[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.print("pustak ka naam darj karen:");
            String name=sc.nextLine();
            System.out.print("paathakon kee sankhya darj karen:");
            int user= sc.nextInt();
            b[i]= new bookrating(name,user);
            b[i].setAverage();
        }
        int max_index=0;
        for(int i=1;i<n;i++){
            if(b[max_index].average<b[i].average){
                max_index=i;
            }
        }
        System.out.println("The most popular book is: "+b[max_index].name);
    }
}
