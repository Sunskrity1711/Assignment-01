import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if ((A[i] - A[0]) % K != 0) {
                System.out.println(-1);
                return;
            }
        }

        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = A[i] / K;
        }

        Arrays.sort(B);
        int median = B[n / 2];

        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += Math.abs(B[i] - median);
        }

        System.out.println(operations);
    }
}