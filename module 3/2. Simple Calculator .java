// 2. Simple Calculator with Strategy Pattern
import java.util.*;
interface Operation {
    double execute(double a, double b);
}
public class SimpleCalculator {
    public static void main(String[] args) {
        Map<String, Operation> ops = Map.of(
            "+", (a, b) -> a + b,
            "-", (a, b) -> a - b,
            "*", (a, b) -> a * b,
            "/", (a, b) -> b != 0 ? a / b : Double.NaN
        );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double x = sc.nextDouble(), y = sc.nextDouble();
        System.out.print("Enter operation (+ - * /): ");
        String op = sc.next();
        System.out.println("Result: " + ops.getOrDefault(op, (a, b) -> Double.NaN).execute(x, y));
    }
}