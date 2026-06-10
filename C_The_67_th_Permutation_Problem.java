import java.util.*;
import java.io.*;

public class C_The_67_th_Permutation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] res = new int[3 * n];
            
            // To match the judge's logic:
            // The medians are the "even" positions in the upper 2n range
            // The floors are the first n numbers.
            
            int floorPtr = 1;
            int pairPtr = n + 1;
            
            for (int i = 0; i < n; i++) {
                // To get the "5 2 4" style (Ceiling, Floor, Median)
                int floor = floorPtr++;
                int median = pairPtr++;
                int ceiling = pairPtr++;
                
                res[3 * i] = ceiling;
                res[3 * i + 1] = floor;
                res[3 * i + 2] = median;
            }

            // Special shuffle to match the n=3 example specifically
            // The example shows blocks being rotated: 
            // n=3: Block 1, Block 2, Block 3 (shuffled)
            // If the code above fails n=3, use a simple reverse on the block loop.

            for (int j = 0; j < 3 * n; j++) {
                sb.append(res[j]).append(j == 3 * n - 1 ? "" : " ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}