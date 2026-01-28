import java.util.*;

public class A_String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        StringBuffer ans = new StringBuffer();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'y'){
                continue;
            }
            else{
                ans.append('.');
                ans.append(ch);
            }
        }
        System.out.println(ans.toString());
    }
}
