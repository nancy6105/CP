import java.util.*;

public class B_The_Curse_of_the_Frog {

    static long solveOne(long a, long b, long c, long z) {
        long lo = 0, hi = (long) 1e18;
        long ans = -1;

        while (lo <= hi) {
            long r = (lo + hi) >>> 1;

            // max position reachable with r rollbacks
            // k = r*b + (b-1)
            // pos = k*a - r*c
            long k;
            try {
                k = Math.addExact(Math.multiplyExact(r, b), b - 1);
            } catch (ArithmeticException e) {
                k = Long.MAX_VALUE;
            }

            long pos;
            try {
                pos = Math.subtractExact(Math.multiplyExact(k, a),
                                         Math.multiplyExact(r, c));
            } catch (ArithmeticException e) {
                pos = Long.MAX_VALUE;
            }

            if (pos >= z) {
                ans = r;
                hi = r - 1;
            } else {
                lo = r + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long z = sc.nextLong();

            long answer = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();

                long res = solveOne(a, b, c, z);
                if (res != -1) {
                    answer = Math.min(answer, res);
                }
            }

            System.out.println(answer == Long.MAX_VALUE ? -1 : answer);
        }
    }
}
