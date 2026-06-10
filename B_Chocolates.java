import java.util.*;

public class B_Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long total = 0;
        long prev = Long.MAX_VALUE;
        for(int i = n-1;i>=0;i--){
            long curr = Math.min(prev-1,arr[i]);
            if(curr < 0){
                curr = 0;
            }
            total += curr;
            prev = curr;
        }
        System.out.println(total);
        sc.close();
    }
}
