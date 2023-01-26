import java.util.*;
class stock{
    String name;
    int[] arr=new int[8];
    stock(String name,int arr[])
    {
        this.name=name;
        this.arr=arr;
    }
}
class transactions extends stock{
    public transactions (String name,int arr[]){
        super(name,arr);
    }
    void findMaximumProfit(){
        int profit=0;
        int min=0,max=0;
        System.out.printf("BUY ON DAY 1");
        for(int j=1;j<arr.length-1;j++){
            if(arr[j]>arr[j-1] && arr[j]>arr[j+1]){
                max=j;
                profit+=arr[max]-arr[min];
                System.out.printf(" SELL ON DAY %d \n", max+1);
            }
            if(arr[j]<arr[j-1] && arr[j]<arr[j+1]){
                min=j;
                System.out.printf("BUY ON DAY %d ", min+1);
            }
            if(j==arr.length-2 && arr[j]<arr[j+1]){ max=j+1;
                profit+=arr[max]-arr[min];
                System.out.printf(" SELL ON DAY %d\n ", max+1);
            }
        }
        System.out.println(); System.out.println("Profit: "+ profit);
    }

}
public class Stock_Market {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter stock name:");
        String name=sc.nextLine();
        int [] arr={1, 5, 2, 3, 7, 6, 4, 5};
        transactions m=new transactions(name, arr); m.findMaximumProfit();
    }
}
