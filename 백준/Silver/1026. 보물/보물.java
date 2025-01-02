import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //A 배열의 작은순서 -> B의 큰 수를 곱해야함.

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        for (int i=0;i<B.length;i++){
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for(int i=0; i<N;i++){
            sum += A[i]*B[N-1-i];
        }
        System.out.println(sum);
    }
}
