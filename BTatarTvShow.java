import java.util.Scanner;

public class BTatarTvShow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            System.out.println(sol(n,k,s));
        }
    }
    public static String sol(int n, int k, String s){
        for(int r = 0;r<k;r++){
            int ones = 0;
            for(int i = r;i<n;i+=k){
                if(s.charAt(i) == '1'){
                    ones++;
                }
            }
            if(ones%2 != 0){
                return "NO";
            }
        }
        return "YES";
    }
}
