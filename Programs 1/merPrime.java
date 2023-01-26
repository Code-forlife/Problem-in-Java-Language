class merPrime{
    public static void main(String[] args){
        int  k;
        prime obj = new prime();

        for (k = 2; k <= 31; k++){

            if(obj.check_prime( 2*k-1)==1){
                System.out.print(2*k-1);
                System.out.println(" for p = " + k);
            }
        }
    }
}

class prime {
    int flag;
    int check_prime(int a) {
        for (int i = 1; i <= a; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }
}