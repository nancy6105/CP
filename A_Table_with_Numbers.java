import java.util.*;

public class A_Table_with_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();

            // ensure h >= w
            if (h < w) {
                int tmp = h;
                h = w;
                w = tmp;
            }

            int R = 0; // count <= h
            int C = 0; // count <= w

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x <= h) R++;
                if (x <= w) C++;
            }

            System.out.println(Math.min(C, R / 2));
        }
    }
}
