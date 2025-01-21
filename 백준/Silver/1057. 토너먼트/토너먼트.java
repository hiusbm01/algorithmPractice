import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while(a!=b){
            if(a%2 == 0 ){
                a = a/2;
            }else{
                a = a/2 +1;
            }
            if(b%2 == 0){
                b = b/2;
            }else{
                b = b/2 +1;
            }
            count++;
        }
        System.out.println(count);
    }
}
