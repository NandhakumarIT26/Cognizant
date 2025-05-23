import java.util.Scanner;
public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("The number " + num + " is " + ((num & 1) == 0 ? "Even" : "Odd"));
    }
}
