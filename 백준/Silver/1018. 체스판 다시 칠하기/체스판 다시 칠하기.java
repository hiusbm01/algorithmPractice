import java.util.Scanner;

public class Main {
    static char[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = sc.next().toCharArray();
        }

        int minPaint = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int count = countRepaints(i, j);
                minPaint = Math.min(minPaint, count);
            }
        }

        System.out.println(minPaint);
    }

    static int countRepaints(int startX, int startY) {
        int countB = 0;
        int countW = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[startX + i][startY + j];

                if ((i + j) % 2 == 0) {
                    if (current != 'B') countB++;
                    if (current != 'W') countW++;
                } else {
                    if (current != 'W') countB++;
                    if (current != 'B') countW++;
                }
            }
        }

        return Math.min(countB, countW);
    }
}
