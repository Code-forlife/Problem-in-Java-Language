import java.util.*;
class food_items{
    String name;
    int price;
    food_items(String name,int price){
        this.name=name;
        this.price=price;
    }
}
public class Shopping_cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items which 3 carts have: ");
        int n = sc.nextInt();
        int[][][] carts = new int[3][2][n];
        food_items[] fd = new food_items[6];
        fd[0] = new food_items("Paneer", 20);
        fd[1] = new food_items("Aloo", 50);
        fd[2] = new food_items("Bhindi", 12);
        fd[3] = new food_items("Grains", 200);
        fd[4] = new food_items("Nut butters", 150);
        fd[5] = new food_items("Dried fruits", 75);
        int user = 2;
        while (user >= 0) {
            System.out.println("User " + (user + 1));
            System.out.println("1: Paneer\n2: Aloo\n3: Bhindi\n4: Grains\n5: Nut butters\n6: Dried fruits");
            for (int i = 0; i < n; i++) {
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        carts[user][0][i] = fd[option - 1].price;
                        break;
                    case 2:
                        carts[user][0][i] = fd[option - 1].price;
                        break;
                    case 3:
                        carts[user][0][i] = fd[option - 1].price;
                        break;
                    case 4:
                        carts[user][1][i] = fd[option - 1].price;
                        break;
                    case 5:
                        carts[user][1][i] = fd[option - 1].price;
                        break;
                    case 6:
                        carts[user][1][i] = fd[option - 1].price;
                        break;
                    default:
                        System.out.println("You have a every good eyes. Keep that in refrigerator not on your face");
                }
            }
            user--;
        }
        user=2;
        while (user >= 0) {
            System.out.println("=====================================================");
            System.out.println("User " + (user + 1));
            int total=0;
            for (int i = 0; i < 2; i++) {
                for(int j=0;j < n;j++){
                    total+=carts[user][i][j];
                }
            }
            System.out.println("The total cost is: "+total);
            user--;
            System.out.println("=====================================================");
        }
        user=2;
        while (user >= 0) {
            System.out.println("=====================================================");
            System.out.println("User " + (user + 1));
            int total=0;
            for (int i = 0; i < 2; i++) {
                for(int j=0;j < n;j++){
                    total+=carts[user][0][i];
                }
            }
            System.out.println("The total cost of all perishable items sold is: "+total);
            user--;
            System.out.println("================================================");
        }
        Arrays.sort(carts[0][0]);
        Arrays.sort(carts[1][0]);
        Arrays.sort(carts[2][0]);
        System.out.println("===============================================");
        System.out.println("The costliest non-perishable item sold of cart 1: "+carts[0][0][n-1]);
        System.out.println("The costliest non-perishable item sold of cart 2: "+carts[1][0][n-1]);
        System.out.println("The costliest non-perishable item sold of cart 3: "+carts[2][0][n-1]);
 System.out.println("==================================================");
    }
}
