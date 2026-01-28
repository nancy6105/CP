import java.util.*;
import java.io.*;

public class C_Numbers_on_Whiteboard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> val = new ArrayList<>();
            for(int i = 1;i<=n;i++){
                val.add(i);
            }
            ArrayList<Integer> res = new ArrayList<>();
            while(val.size() > 1){
                int s = val.size();
                int sum = val.get(s-1) + val.get(s-2);
                res.add(val.get(s-1));
                res.add(val.get(s-2));

                val.remove(s-1);
                val.remove(s-2);

                if(sum%2 == 1){
                    val.add(sum/2 + 1);
                }
                else{
                    val.add(sum/2);
                }
            }
            System.out.println(val.get(val.size()-1));

            for(int i = 0;i<res.size();i+=2){
                System.out.println(res.get(i) + " " + res.get(i+1));
            }
        }       
    }
}