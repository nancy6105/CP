import java.util.*;

public class A_Dreamoon_and_Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int min = (n+1)/2;
        int ans = ((min+m-1)/m)*m;
        if(ans <= n){
            System.out.println(ans);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
}