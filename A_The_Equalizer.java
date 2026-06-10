import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A_The_Equalizer {
    public static void main(String[] args) throws IOException {
        // Fast I/O setup
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            long sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                sum += Long.parseLong(st.nextToken());
            }
            
            
            boolean nkIsOdd = (n % 2 != 0) && (k % 2 != 0);
            
            if (sum % 2 != 0 || nkIsOdd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}