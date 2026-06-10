import java.util.*;

public class A_cAPS_lOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = false;
        for(char ch : s.toCharArray()){
            if(!Character.isUpperCase(ch)){
                flag = true;
            }
        }
        if(flag){
            String s1 = s.substring(0,1).toUpperCase();
            String s2 = s.substring(1).toLowerCase();
            System.out.println(s1+s2);
        }
        else{
            System.out.println(s);
        }
    }
}
