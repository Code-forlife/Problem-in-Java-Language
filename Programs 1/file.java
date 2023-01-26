import java.lang.Math;
class game{
    int number;
    int getnumber(){
        number=(int)(Math.random()*1000);
        return number;
    }
}
class file{
    public static void main(String[] args){
        game player1 = new game();
        game player2 = new game();
        int sum1=0,sum2=0,a,b;
        for(int i=0;i<5;i++){
            a=player1.getnumber();
            sum1+=a;
            b=player2.getnumber();
            sum2+=b;
        }
        if(sum1>sum2){
            System.out.println("Player 1 won!");
        }
        else{
            System.out.println("Player 2 won!");
        }
    }
}