import java.util.*;

public class A_Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() == 0) return;

        String ans = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        System.out.println(ans);
    }
}
