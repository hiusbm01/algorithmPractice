import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스 수 입력
        while (t-- > 0) { 
            int n = sc.nextInt();
            int m = sc.nextInt(); 
            
            System.out.println(combi(m, n));
        }
    }

    public static long combi(int m, int n) {
        long num = 1;
        for (int i = 0; i < n; i++) {
            num *= (m - i);
            num /= (i + 1);
        }
        return num;
    }
}