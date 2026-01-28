import java.util.*;

public class A_Erasing_Zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String x = sc.next();
            int first = x.indexOf('1');
            int last = x.lastIndexOf('1');
            int cnt = 0;
            for(int i = first;i<last;i++){
                char ch = x.charAt(i);
                if(ch == '0')cnt++;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
