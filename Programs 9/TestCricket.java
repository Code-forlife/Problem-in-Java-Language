import java.util.Scanner;
class lessRuns extends Exception{
    lessRuns()
    {
        super();
    }
}
class Cricketer {
    String player_name;
    int runs_hit;
    int innings_count;
    int not_out_count;
    double batting_avg;
    Scanner sc = new Scanner(System.in);

    void get_avg() {
        try {
            batting_avg = (double) (runs_hit / innings_count);
        } catch (ArithmeticException e) {
            System.out.println("What is this. you are trying to divide by 0");
        }
    }

    void getData() {
        System.out.print("Enter player name: ");
        player_name = sc.next();
        System.out.print("Enter runs hit: ");
        runs_hit = sc.nextInt();
        System.out.print("Enter number of innings played: ");
        innings_count = sc.nextInt();
        System.out.print("Enter number of not out innings played: ");
        not_out_count = sc.nextInt();
    }
}

public class TestCricket {
    public static void main(String[] args) {
        Cricketer obj[] = new Cricketer[11];
        try {
            for (int i = 0; i < 2; i++) {
                try {
                    System.out.println("For player " + (i + 1));
                    obj[i] = new Cricketer();
                    obj[i].getData();
                    obj[i].get_avg();
                } catch (ArrayStoreException m) {
                    System.out.println(m + " handled.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + " handled.");
        }
        double entireAvg=0;
        for (int i = 0; i < 2; i++) {
            entireAvg += obj[i].batting_avg;
        }
        entireAvg/=2;
        try{
            check(entireAvg);
        }
        catch(Exception e)
        {
            System.out.println("The team has a batting average of less than 20 runs.");
        }
        Cricketer temp = new Cricketer();
        for(int i = 0; i < 2 ; i++)
        {
            for(int j = i+1 ; j < 2 ; j++)
            {
                if(obj[j].batting_avg<obj[i].batting_avg)
                {
                    temp = obj[j];
                    obj[j] = obj[i];
                    obj[i] = temp;
                }
            }
        }
        for(int i = 0; i < 2; i++)
        {
            System.out.print(obj[i].player_name+"\t"+obj[i].runs_hit+"\t"+obj[i].innings_count+"\t" + obj[i].not_out_count+"\t" + obj[i].batting_avg+"\n");
        }
    }
    static void check(double x) throws lessRuns{
        if(x<20)
        {
            throw new lessRuns();
        }
    }
}
