import java.util.*;
interface rankT{
    String[] rank={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
}
interface suitT{
    String[] suit={"D","S","H","C"};
}
interface cardT{
    void NewCard();
}
class PrintCard implements rankT,suitT,cardT{
    ArrayList<String> ll = new ArrayList<String>(52);
    public void NewCard(){
        for(int i=0;i<rank.length;i++){
            for(int j=0;j<suit.length;j++){
                ll.add(rank[i]+suit[j]);
            }
        }
        //System.out.println(ll);
    }
    public void ShuffleCard(){
        Collections.shuffle(ll);
    }
    void display(){
        //System.out.println(ll.size());
        for(int i=0;i<ll.size();i++){
            if(i%13==0){
                System.out.println();
            }
            System.out.print("\t"+ll.get(i));
        }
    }

}
public class Cards {
    public static void main(String[] args) {
        PrintCard p=new PrintCard();
        p.NewCard();
        p.ShuffleCard();
        p.display();
    }
}
