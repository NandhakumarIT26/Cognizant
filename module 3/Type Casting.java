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