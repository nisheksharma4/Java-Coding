
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerStreamExample {
    public static void main(String[] args) {
    // 1. Write a Consumer<String> to print a message with "Hello " before the name.
    Consumer<String> msg = name -> System.out.println("Hello "+name);
    msg.accept("Anmol");
    

    // 2. Write a Consumer<Integer> to print the square of a number.

    // Chain two consumers using andThen() – first print the number, then print its
    // cube.

    // Use forEach() with a Consumer to print all elements of a list.

    // Create a Consumer<List<Integer>> to increment each element by 1 and print the
    // list.

    // Use a Predicate<Integer> to filter even numbers, then use a Consumer<Integer>
    // to print them.

    // Use a Function<String, Integer> to find the length of names, and print using
    // a Consumer<Integer>.

    // Combine Supplier<List<Integer>> (to generate numbers) + Predicate<Integer>
    // (filter even) + Consumer<Integer> (print).

    // Write a program that takes a list of students, uses Predicate<Student> to
    // filter those with marks > 60, then Function<Student, String> to get their
    // names, and finally forEach() to print names.

    // Build a mini calculator using Function<Integer, Integer> and lambdas (square,
    // cube, factorial).
    }
    
}
