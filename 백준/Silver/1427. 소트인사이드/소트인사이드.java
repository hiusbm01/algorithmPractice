import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[String.valueOf(n).length()];

        for(int i=0;i<arr.length;i++){
            arr[i] = String.valueOf(String.valueOf(n).charAt(i));
        }
        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for(String num : arr){
            sb.append(num);
        }
        long result = Long.parseLong(sb.toString());

        System.out.println(result);
    }
}
