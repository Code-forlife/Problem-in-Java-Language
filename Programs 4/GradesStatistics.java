import java.util.*;
import java.lang.*;
public class GradesStatistics {
    static double average(Integer[] mark){
        double sum=0;
        for(int i=0;i< mark.length;i++){
            sum+=mark[i];
        }
        return sum/ mark.length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n=sc.nextInt();
        Integer[] marks=new Integer[n];
        for(int i=1;i<=n;++i){
            System.out.print("Enter the grade for students "+ i+" :");
            marks[i-1]=sc.nextInt();
        }
        System.out.print("{");
        for(int i=1;i<=n;++i){
            System.out.print(marks[i-1]+",");
        }
        System.out.println("}");
        System.out.println("The average is "+average(marks));
        Arrays.sort(marks);
        System.out.println("The Minimum "+marks[0]);
        System.out.println("The Maximum "+marks[n-1]);
        if (n%2==0){
            System.out.println("The Median is : "+(double)((marks[n/2-1]+marks[n/2])/2));
        }
        else{
            System.out.println("The Median is : "+(double)marks[marks.length/2]);
        }
        double mean=average(marks);
        double std =0;
        for(int i=0;i<marks.length;i++){
            std+=Math.pow(marks[i]-mean,2);
        }
        System.out.printf("The std. deviation is %.2f",Math.sqrt(std/ marks.length));
    }
}
