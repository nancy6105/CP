import java.util.*;

public class A_Maximum_Increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 1;
        int max = 1;
        int i = 1;
        while(i < n){
            if(arr[i] > arr[i-1]){
                cnt++;
            }
            else{
                max = Math.max(max,cnt);
                cnt = 1; 
            }
            i++;
        }
        max = Math.max(max,cnt);
        System.out.println(max);
        sc.close();
    }
}
