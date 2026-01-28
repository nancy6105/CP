import java.util.*;

public class A_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int i = 0;
            while(a <= n && b <= n){
                if(a < b){
                    a = a + b;
                }
                else{
                    b = a + b;
                }
                i++;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
