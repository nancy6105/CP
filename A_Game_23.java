import java.util.*;

public class A_Game_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        if(a%n != 0){
            System.out.println(-1);
            return;
        }
        int cnt = 0;
        int q = a/n;
        while(q%2 == 0){
            q = q/2;
            cnt++;
        }
        while(q%3 == 0){
            q = q/3;
            cnt++;
        }
        if(q == 1){
            System.out.println(cnt);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
}