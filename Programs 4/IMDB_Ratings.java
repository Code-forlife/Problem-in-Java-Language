import java.util.*;
class movie_info{
    String movie_name,movie_Type,hero,heroine/*not the drug one*/;
    int budget;
    movie_info(String name,String type,String hero, String heroine, int budget){
        this.movie_name=name;
        this.movie_Type=type;
        this.hero=hero;
        this.heroine=heroine;
        this.budget=budget;
    }
    void display(){
        System.out.println(movie_name+" \t\t "+movie_Type+" \t\t "+hero+" \t\t "+heroine+" \t\t "+budget+" \t\t ");
    }
}
public class IMDB_Ratings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of movies: ");
        int n = sc.nextInt();
        movie_info[] mo=new movie_info[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.print("philm ka naam darj karen: ");
            String name= sc.nextLine();
            System.out.print("moovee ka prakaar darj karen: ");
            String type= sc.nextLine();
            System.out.print("naayak ka naam darj karen: ");
            String hero= sc.nextLine();
            System.out.print("naayika ka naam darj karen: ");
            String heroine= sc.nextLine();
            System.out.print("philm ka bajat darj karen: ");
            int budget=sc.nextInt();
            mo[i]=new movie_info(name,type,hero,heroine,budget);
        }
        for(int i=0;i<n;i++){
            int min_index=i;
            for (int j=i;j<n;j++){
                if(mo[j].budget<mo[min_index].budget){
                    min_index=j;
                }
                movie_info a = mo[min_index];
                mo[i]=mo[min_index];
                mo[min_index]=a;
            }
        }
        System.out.println("Movie Name \t Movie Type \t Hero \t Heroine \t Budget");
        System.out.println("--------------------------------------------------------------------------------");
        for(int i=n-1;i>=0;--i){
            mo[i].display();
        }
    }
}
