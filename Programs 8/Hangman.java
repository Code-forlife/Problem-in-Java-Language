import java.util.*;
public class Hangman
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" _                                             \n" +
                "| |                                            \n" +
                "| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  \n" +
                "| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ \n" +
                "| | | | (_| | | | | (_| | | | | | | (_| | | | |\n" +
                "|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|\n" +
                "                    __/ |                      \n" +
                "                   |___/    ");
        System.out.println("tumhara aadmi humare kabze mein hai, usse chudane ke liye saamne wala shabd ka anuman lagayiye \nTumhare paas chhah chances hai, ho sake toh sahi guess karke chudda do ");
        working p1=new working();
        String bollywood=p1.ChooseRandomWords();
        char[] letter= new char[bollywood.length()];
        hangman_art h1=new hangman_art();
        for (int i=0;i<bollywood.length();i++){
            if (bollywood.charAt(i) == 'a' ||bollywood.charAt(i) == 'e' ||bollywood.charAt(i) == 'i' || bollywood.charAt(i)== 'o' || bollywood.charAt(i) == 'u'||bollywood.charAt(i) == 'A' ||bollywood.charAt(i)== 'E' ||bollywood.charAt(i) == 'I' || bollywood.charAt(i) == 'O' || bollywood.charAt(i)== 'U'||bollywood.charAt(i)==' '){
                letter[i]=bollywood.charAt(i);
            }
            else{
                letter[i]='_';
            }
        }
        System.out.println("Yeh raha aapka shabd: ");
        int guess=6;
        for (int j=0;j<bollywood.length();j++){
            while(letter[j]=='_' && guess>=0){
                for (int i=0;i<bollywood.length();i++){
                    System.out.print(letter[i]+" ");
                }
                System.out.println();
                char c = sc.next().charAt(0);
                boolean guesses=false;
                for(int i=0;i<bollywood.length();i++){
                    if(bollywood.charAt(i)==c){
                        letter[i]=c;
                        guesses=true;
                    }
                }
                if (guesses==false){
                    System.out.println(h1.art[6-guess]);
                    guess--;
                }
            }
        }
        boolean win=true;
        for(int i=0;i<bollywood.length();i++){
            if(letter[i]=='_'){
                win=false;
            }
        }
        if(win) {

            System.out.println("  __    __                              __      __                    \n" +
                    "/\\ \\  /\\ \\                            /\\ \\  __/\\ \\    __             \n" +
                    "\\ `\\`\\\\/'/  ___    __  __             \\ \\ \\/\\ \\ \\ \\  /\\_\\     ___    \n" +
                    " `\\ `\\ /'  / __`\\ /\\ \\/\\ \\             \\ \\ \\ \\ \\ \\ \\ \\/\\ \\  /' _ `\\  \n" +
                    "   `\\ \\ \\ /\\ \\L\\ \\\\ \\ \\_\\ \\             \\ \\ \\_/ \\_\\ \\ \\ \\ \\ /\\ \\/\\ \\ \n" +
                    "     \\ \\_\\\\ \\____/ \\ \\____/              \\ `\\___x___/  \\ \\_\\\\ \\_\\ \\_\\\n" +
                    "      \\/_/ \\/___/   \\/___/                '\\/__//__/    \\/_/ \\/_/\\/_/\n" +
                    "                                                                     ");
            System.out.println("You have saved the man. The movie was "+bollywood);
            System.out.println("Feedback: ");
            System.out.print("****************Kya Gunda Banega Re Tu*****************");
        }
        else{
            System.out.println(" .----------------.  .----------------.  .----------------.  .----------------. \n" +
                    "| .--------------. || .--------------. || .--------------. || .--------------. |\n" +
                    "| |  ________    | || |  _________   | || |      __      | || |  ________    | |\n" +
                    "| | |_   ___ `.  | || | |_   ___  |  | || |     /  \\     | || | |_   ___ `.  | |\n" +
                    "| |   | |   `. \\ | || |   | |_  \\_|  | || |    / /\\ \\    | || |   | |   `. \\ | |\n" +
                    "| |   | |    | | | || |   |  _|  _   | || |   / ____ \\   | || |   | |    | | | |\n" +
                    "| |  _| |___.' / | || |  _| |___/ |  | || | _/ /    \\ \\_ | || |  _| |___.' / | |\n" +
                    "| | |________.'  | || | |_________|  | || ||____|  |____|| || | |________.'  | |\n" +
                    "| |              | || |              | || |              | || |              | |\n" +
                    "| '--------------' || '--------------' || '--------------' || '--------------' |\n" +
                    " '----------------'  '----------------'  '----------------'  '----------------' ");
            System.out.println("Muh se Moongfali toot nahi rahi , Chale hai apna aadmi ko chudana ka liye");
        }
    }
}
interface ranword{
    //public void InitDictionary();
    public String ChooseRandomWords();
}
class working implements ranword{
    static String[] words={"Sholay" ,"Mughal e Azam","Mother India" , "Dilwale Dulhania Le Jayenee" ,"Pyaasa" ,"Guide" , "Deewaar" , "Lagaan" , "Pakeezah", "Amar Akbar Anthony", "Do Bigha Zamin" ,"Jaane Bhi Do Yaaro" , "3 Idiots" , "Kaagaz Ke Phool" ,"Bombay" ,"Mr India",
            "Bobby","Satya", "Dil Chahta Hai","Andaz Apna Apna","Dil To Pagal Hai"," Om Shanti Om","Shree 420","Jab We Met","Parinda","Shaan","Zindagi Na Milegi Dobara"," Silsila ","Anand","Prem Rog",
            "Barfi","Awaara","Golmaal","Ankur","Ek Tha Tiger","Chak De! India","Kaala Patthar","Ghajini","Jodhaa Akbar","Kabhi Khushi Kabhie Gham" };
    public String ChooseRandomWords(){

        int a= (int)(Math.random()*41);
        return words[a];
    }
}
class hangman_art{
    static String[] art={"  +---+\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========","  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "      |\n" +
            "      |\n" +
            "      |\n" +
            "=========","  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            "  |   |\n" +
            "      |\n" +
            "      |\n" +
            "=========","  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|   |\n" +
            "      |\n" +
            "      |\n" +
            "=========","  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            "      |\n" +
            "      |\n" +
            "=========","  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " /    |\n" +
            "      |\n" +
            "=========","  +---+\n" +
            "  |   |\n" +
            "  O   |\n" +
            " /|\\  |\n" +
            " / \\  |\n" +
            "      |\n" +
            "========="};

}
