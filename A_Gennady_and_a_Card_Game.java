import java.util.*;

public class A_Gennady_and_a_Card_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = new String[5];
        for(int i = 0;i<5;i++){
            arr[i] = sc.next();
        }
        boolean flag = false;
        for(String s : arr){
            if(s.charAt(1) == str.charAt(1) || s.charAt(0) == str.charAt(0)){
                flag = true;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
