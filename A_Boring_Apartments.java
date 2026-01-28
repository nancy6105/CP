import java.util.*;

public class A_Boring_Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String x = sc.next();
            int d = x.charAt(0)-'0';
            int len = x.length();
            int ans = (d-1)*10 + (len * (len + 1))/2;
            System.out.println(ans);
        }
        sc.close();
    }
}
