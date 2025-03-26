
import java.util.Scanner;

public class Main {
    private static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = null;
        System.out.println(Math.pow(5, 7));


        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        long[] results = calculateFR(n, k, a);
        for (long result : results) {
            System.out.println(result);
        }
    }

    private static long[] calculateFR(int n, int k, int[] a) {
        long[] results = new long[k];

        long[] pairSums = new long[n * (n - 1) / 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pairSums[index++] = (a[i] + a[j]);
            }
        }


        for (int r = 1; r <= k; r++) {
            long sum = 0;
            for (long pairSum : pairSums) {
                sum = (long) ((sum + Math.pow(pairSum, r)) % MOD);
            }
            results[r - 1] = sum;
        }
        System.out.println(Math.pow(5, 7));
        return results;
    }
}
