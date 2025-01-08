import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while(true){
            if(n % 5 ==0){
                count += n / 5;

                System.out.println(count);
                break;
            }else{
                n -= 3;
                count++;
            }
            if(n<0){
                System.out.println(-1);
                break;
            }
        }
        sc.close();

    }
}
