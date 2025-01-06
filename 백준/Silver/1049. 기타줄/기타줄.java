import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int setPrice = Integer.MAX_VALUE;
        int singlePrice = Integer.MAX_VALUE;
        int cost = 0;
        for(int i=0;i<m;i++){
            int sPrice = sc.nextInt();
            int singPrice = sc.nextInt();
            setPrice = Math.min(setPrice,sPrice);
            singlePrice = Math.min(singlePrice,singPrice);
        }

        while(n >= 6){
            if(setPrice < singlePrice * 6 ){
                cost += setPrice;
            }
            else{
                cost += singlePrice*6;
            }
            n -= 6;
        }
        cost += Math.min(setPrice,singlePrice * n);
        System.out.println(cost);

        sc.close();
    }
}
