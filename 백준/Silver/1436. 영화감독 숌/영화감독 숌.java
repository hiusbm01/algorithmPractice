import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
       // 666 1666 2666 3666 4666 5666 6660 6661 6662 6663 6664 6665 6666 6667 6668 6669 7666 8666 9666 10666 11666 12666 13666

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int number = 666; //첫번째 666.
        while (count<n){
            if(String.valueOf(number).contains("666")){
                count++;
            }
            number++;
        }
        //왜 안쪽에서순환?뭐지?
        System.out.println(number-1);
    }
}
