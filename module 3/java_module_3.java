// Creative Solutions to Core Java Module (1-5 shown as example)

// 1. Hello World with Timestamp
import java.time.LocalDateTime;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("👋 Hello, World! Time now: " + LocalDateTime.now());
    }
}

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

// 3. Even or Odd Checker with Binary Trick
import java.util.Scanner;
public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("The number " + num + " is " + ((num & 1) == 0 ? "Even" : "Odd"));
    }
}

// 4. Leap Year Checker with Explanation
import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is " + (isLeap ? "a leap year ✅" : "not a leap year ❌"));
    }
}

// 5. Multiplication Table in Stylish Format
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

// 6. Data Type Demonstration with Real Values
public class DataTypesDemo {
    public static void main(String[] args) {
        int age = 30;
        float pi = 3.14f;
        double gravity = 9.80665;
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.printf("Age: %d\nPi: %.2f\nGravity: %.5f\nGrade: %c\nJava Fun: %b\n", age, pi, gravity, grade, isJavaFun);
    }
}

// 7. Type Casting Example with Annotation
public class TypeCasting {
    public static void main(String[] args) {
        double d = 99.99;
        int i = (int) d;
        int num = 42;
        double d2 = num;
        System.out.println("Original double: " + d + ", Casted to int: " + i);
        System.out.println("Original int: " + num + ", Casted to double: " + d2);
    }
}

// 8. Operator Precedence Visualized
public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Expression: 10 + 5 * 2\nExpected: 20\nResult: " + result);
    }
}

// 9. Grade Calculator with Fancy Output
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks out of 100: ");
        int marks = sc.nextInt();
        String grade = marks >= 90 ? "A" : marks >= 80 ? "B" : marks >= 70 ? "C" : marks >= 60 ? "D" : "F";
        System.out.println("Your Grade: " + grade);
    }
}

// 10. Number Guessing Game with Random Range
import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = new Random().nextInt(100) + 1, guess;
        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();
            if (guess < number) System.out.println("Too low! Try again.");
            else if (guess > number) System.out.println("Too high! Try again.");
        } while (guess != number);
        System.out.println("🎉 You guessed it right!");
    }
}

// 11. Factorial Calculator with BigInteger for Large Numbers
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
// 12. Method Overloading
public class OverloadDemo {
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        System.out.println("add(2, 3) = " + add(2, 3));
        System.out.println("add(2.5, 3.5) = " + add(2.5, 3.5));
        System.out.println("add(1, 2, 3) = " + add(1, 2, 3));
    }
}

// 13. Recursive Fibonacci
public class RecursiveFibonacci {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        System.out.println("10th Fibonacci number: " + fibonacci(10));
    }
}

// 14. Array Sum and Average
import java.util.*;
public class ArrayStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum: " + sum + ", Average: " + (sum / (double)n));
    }
}

// 15. String Reversal
import java.util.Scanner;
public class StringReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}

// 16. Palindrome Checker
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine().replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Palindrome? " + original.equals(reversed));
    }
}

// 17. Class and Object Creation
class Car {
    String make, model;
    int year;
    void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.make = "Tesla"; c.model = "Model 3"; c.year = 2022;
        c.displayDetails();
    }
}

// 18. Inheritance Example
class Animal {
    void makeSound() { System.out.println("Some sound"); }
}
class Dog extends Animal {
    void makeSound() { System.out.println("Bark"); }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        new Animal().makeSound();
        new Dog().makeSound();
    }
}

// 19. Interface Implementation
interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play() { System.out.println("Strum strum 🎸"); }
}
class Piano implements Playable {
    public void play() { System.out.println("Tinkle tinkle 🎹"); }
}
public class MusicTest {
    public static void main(String[] args) {
        new Guitar().play();
        new Piano().play();
    }
}

// 20. Try-Catch Example
import java.util.Scanner;
public class SafeDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
}
// 21. Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) { super(message); }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            int age = 16;
            if (age < 18) throw new InvalidAgeException("Age must be at least 18.");
            System.out.println("Age verified: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// 22. File Writing
import java.io.*;
import java.util.Scanner;
public class FileWriterDemo {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text to write to file: ");
            writer.println(sc.nextLine());
            System.out.println("✅ Data written to output.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

// 23. File Reading
import java.io.*;
public class FileReaderDemo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("📄 " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}

// 24. ArrayList Example
import java.util.*;
public class NameList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names (type 'done' to stop):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("done")) break;
            names.add(name);
        }
        System.out.println("👥 Names entered: " + names);
    }
}

// 25. HashMap Example
import java.util.*;
public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        map.put(1, "Alice"); map.put(2, "Bob");
        System.out.print("Enter student ID to search: ");
        int id = sc.nextInt();
        System.out.println("👤 Student: " + map.getOrDefault(id, "Not Found"));
    }
}

// 26. Thread Creation
class MessagePrinter extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) System.out.println(getName() + " says hello!");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        new MessagePrinter().start();
        new MessagePrinter().start();
    }
}

// 27. Lambda Expressions
import java.util.*;
public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zoe", "Adam", "Mia");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("🔤 Sorted names: " + names);
    }
}

// 28. Stream API
import java.util.*;
import java.util.stream.Collectors;
public class EvenFilter {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evens = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("✨ Even numbers: " + evens);
    }
}

// 29. Records
record Person(String name, int age) {}
import java.util.*;
import java.util.stream.*;
public class RecordDemo {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Alice", 22), new Person("Bob", 17));
        people.stream().filter(p -> p.age() >= 18).forEach(System.out::println);
    }
}

// 30. Pattern Matching for switch (Java 21)
public class PatternMatch {
    public static void printType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("🔢 Integer: " + i);
            case String s -> System.out.println("📘 String: " + s);
            case Double d -> System.out.println("💠 Double: " + d);
            default -> System.out.println("❓ Unknown Type");
        }
    }
    public static void main(String[] args) {
        printType(42); printType("Hello"); printType(3.14);
    }
}

// 31. Basic JDBC Connection
import java.sql.*;
public class JDBCBasics {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) System.out.println(rs.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// 32. Insert and Update Operations in JDBC
public class StudentDAO {
    public static void insertStudent(Connection conn, String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO students(name) VALUES(?)");
        ps.setString(1, name);
        ps.executeUpdate();
    }
    public static void updateStudent(Connection conn, int id, String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?");
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
    }
}

// 33. Transaction Handling in JDBC
public class TransactionDemo {
    public static void transfer(Connection conn, int from, int to, double amount) throws SQLException {
        conn.setAutoCommit(false);
        try {
            // Dummy logic assuming updateBalance is defined
            updateBalance(conn, from, -amount);
            updateBalance(conn, to, amount);
            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }
    }
    static void updateBalance(Connection conn, int id, double amt) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
        ps.setDouble(1, amt);
        ps.setInt(2, id);
        ps.executeUpdate();
    }
}

// 34. Java Modules Structure
// module-info.java in com.utils
// module com.utils {
//     exports com.utils;
// }
// module-info.java in com.greetings
// module com.greetings {
//     requires com.utils;
// }

// 35. TCP Client-Server Chat (Simplified)
// Run Server and Client in separate terminals
// Server:
// new ServerSocket(1234).accept().getOutputStream().write("Hello from Server".getBytes());
// Client:
// new Socket("localhost", 1234).getInputStream().readAllBytes()

// 36. HTTP Client API
import java.net.URI;
import java.net.http.*;
public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://api.github.com")).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
}

// 37. Using javap
// Compile any class and run: javap -c ClassName

// 38. Decompile a Class File
// Use tools like JD-GUI or CFR

// 39. Reflection in Java
import java.lang.reflect.*;
public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.lang.String");
        for (Method m : clazz.getDeclaredMethods()) System.out.println(m.getName());
    }
}

// 40. Virtual Threads (Java 21)
public class VirtualThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Thread.startVirtualThread(() -> System.out.println("Hello from virtual thread"));
        }
    }
}

// 41. Executor Service and Callable
import java.util.concurrent.*;
public class ExecutorDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> result = service.submit(() -> 42);
        System.out.println("Callable returned: " + result.get());
        service.shutdown();
    }
}
