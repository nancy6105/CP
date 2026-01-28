import java.math.BigInteger;
import java.util.Scanner;

public class B_Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE));
    }
}
