import java.util.*;
public class AGeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(n-- > 0){
            int p = sc.nextInt();
            int t = sc.nextInt();

            if(t-p >= 2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
