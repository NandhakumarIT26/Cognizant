import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) fact = fact.multiply(BigInteger.valueOf(i));
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}