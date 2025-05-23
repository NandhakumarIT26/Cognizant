import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for multiplication table: ");
        int num = sc.nextInt();
        System.out.println("\n📊 Multiplication Table of " + num + ":\n");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d × %2d = %3d\n", num, i, num * i);
        }
    }
}