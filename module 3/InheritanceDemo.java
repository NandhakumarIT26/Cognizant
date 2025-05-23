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