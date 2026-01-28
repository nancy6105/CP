import java.util.*;

public class A_Petr_and_Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[7];
        for(int i = 0;i<7;i++){
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        while(n > 0){
            for(int i = 0;i<7;i++){
                n = n - arr[i];
                idx = i;
                if(n <= 0){
                    break;
                }
            }
        }
        System.out.print(idx+1);
        sc.close();
    }
}