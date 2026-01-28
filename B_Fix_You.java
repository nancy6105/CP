import java.util.*;

public class B_Fix_You {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char arr[][] = new char[n][m];

            for(int i = 0;i<n;i++){
                arr[i] = sc.next().toCharArray();
            }
            int cnt = 0;
            for(int i = 0;i<n-1;i++){
                if(arr[i][m-1] == 'R'){
                    cnt++;
                }
            }
            for(int i = 0;i<m-1;i++){
                if(arr[n-1][i] == 'D'){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        
    }
}
