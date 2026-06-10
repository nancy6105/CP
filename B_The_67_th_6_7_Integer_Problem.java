import java.util.*;

public class B_The_67_th_6_7_Integer_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int arr[] = new int[7];
            int ans = Integer.MIN_VALUE;
            int total = 0;
            for(int i = 0;i<7;i++){
                arr[i] = sc.nextInt();
                total += arr[i];
            }
            for(int i = 0;i<7;i++){
                int curr = 2*arr[i]-total;
                ans = Math.max(curr,ans);
            }
            System.out.println(ans);
        }
    }
}
