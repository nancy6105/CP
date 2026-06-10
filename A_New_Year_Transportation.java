import java.util.*;

public class A_New_Year_Transportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i = 1;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int curr = 1;
        while(curr < t){
            curr = curr + arr[curr];
        }
        if(curr == t){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
