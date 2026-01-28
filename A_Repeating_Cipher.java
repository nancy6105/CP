import java.util.*;

public class A_Repeating_Cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        int idx = 0;
        int step = 1;

        while(idx < n){
            ans.append(s.charAt(idx));
            idx+=step;
            step++;
        }
        System.out.println(ans.toString());
        sc.close();
    }
}
