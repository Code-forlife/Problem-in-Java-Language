import java.util.Scanner;

abstract class AmusementPark {
    abstract int getCost();
}

class Imagica extends AmusementPark {
    Scanner sc = new Scanner(System.in);
    int totalCost = 0;
    int age;
    String day;
    int games[] = new int[20];
    String[] games1={"Nitro","Scream Machine","Gold Rush Express","D2 Dare Drop","I For India","Rajasaurus River Adventure","Deep Space","Mr India","Alibaba Aur Chalis Chorr","Splash Ahoy!","Magic Carousel","Loch Ness Expplorers","Tubbby Takes Off Merry Go Round","Cinema 360- Prince of the Dark Waters","Save the Pirate","Curse of Salimgarh","Bandits of Robin Hood Roller Coaster","Wrath of the Gods Show","Mambo Chai Chama","Bump It Boats Ride"};
    void getData() {
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter's today day: ");
        day = sc.next();
        int N;
        System.out.print("Enter number of games played: ");
        N = sc.nextInt();
        System.out.println("Games: ");
        for(int i=0;i<20;i++){
            System.out.println((i+1)+") "+games1[i]);
        }
        System.out.print("Enter game numbers that you played: ");
        for (int i = 0; i < N; i++) {
            int temp;
            temp = sc.nextInt();
            games[temp - 1]++;
        }
    }

    int getCost()
    {
        if (age >= 21 && age <= 60) {
            totalCost += 1500;
        } else {
            totalCost += 1100;
        }
        for (int i = 0; i < games.length; i++) {
            if (i >= 9 && i <= 19 && games[i] == 1) {
                totalCost += 50;
            }
        }
        if (day.equals("Sunday") || day.equals("Saturday")) {
            totalCost += 300;
        }
        return totalCost;
    }

    void gamesPlayed() {
        System.out.print("The games that you have played are: ");
        for (int i = 0; i < games.length; i++) {
            if (games[i] >= 1) {
                System.out.printf("\n%s :%d",games1[i], games[i]);
            }
        }
    }
}
class Esselworld extends AmusementPark {
    Scanner sc = new Scanner(System.in);
    int totalCost = 0;
    int age;
    String day;
    int games[] = new int[15];
    String[] games1={"Tunnel Twister","Monsters in the Mist","Mirror Maze","Zipper Dripper","Highway Cars","Crazy Cups","Slippery Sultan","Hoola Loop","Super Telecombat","Slam Bob","Rock N Roll","Happy sky","Rio Grande Train","Mini Telecombat","Play Port"};
    void getData() {
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter's today day: ");
        day = sc.next();
        int N;
        System.out.print("Enter number of games played: ");
        N = sc.nextInt();
        System.out.println("Games: ");
        for(int i=0;i<15;i++){
            System.out.println((i+1)+") "+games1[i]);
        }
        for(int i=0;i<15;i++){
            System.out.println((i+1)+") "+games1[i]);
        }
        System.out.print("Enter game numbers that you played: ");
        for (int i = 0; i < N; i++) {
            int temp;
            temp = sc.nextInt();
            games[temp - 1]++;
        }
    }

    int getCost() {
        if (age >= 21 && age <= 60) {
            totalCost += 1050;
        } else {
            totalCost += 660;
        }
        for (int i = 0; i < games.length; i++) {
            if (i >= 6 && i <= 15 && games[i] == 1) {
                totalCost += 50;
            }
        }
        if (day.equals("Sunday") || day.equals("Saturday")) {
            totalCost += 300;
        }
        return totalCost;
    }

    void gamesPlayed() {
        System.out.print("The games that you have played are: ");
        for (int i = 0; i < games.length; i++) {
            if (games[i] >= 1) {
                System.out.printf("\n%s :%d",games1[i], games[i]);
            }
        }
    }
}

class  ManoranjanPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("Enter 1 for Imagica and 2 for Esselword: ");
        choice = sc.nextInt();
        switch(choice) {
            case 1:
                Imagica objI = new Imagica();
                objI.getData();
                System.out.println("================================================================");
                System.out.println("|||||||||||||||||Thanks You Visit Again|||||||||||||||||");
                System.out.println("                        Imagica                                   ");
                System.out.println("\nYour total cost for today was:       ₹" + objI.getCost());
                objI.gamesPlayed();
                System.out.println("\n================================================================");
                break;
            case 2:
                Esselworld objE = new Esselword();
                objE.getData();
                System.out.println("================================================================");
                System.out.println("|||||||||||||||||Thanks You Visit Again|||||||||||||||||");
                System.out.println("                      EsselWorld                           ");
                System.out.println("\nYour total cost for today was:       ₹" + objE.getCost());
                objE.gamesPlayed();
                System.out.println("\n================================================================");
                break;
            default:
                System.out.print("Goli beta masti nai!!!!!!");
        }
    }
}
