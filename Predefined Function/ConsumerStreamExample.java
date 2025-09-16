
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerStreamExample {
    public static void main(String[] args) {
        // 1. Write a Consumer<String> to print a message with "Hello " before the name.
        Consumer<String> msg = name -> System.out.println("Hello " + name);
        msg.accept("Anmol");

        System.out.println("\n===========================\n");
        // 2. Write a Consumer<Integer> to print the square of a number.
        System.out.println("Write a Consumer<Integer> to print the square of a number.");
        Consumer<Integer> square = n -> System.out.println(n * n);
        square.accept(5);

        System.out.println("\n===========================\n");

        // 3. Chain two consumers using andThen() – first print the number, then print
        // its
        // cube.
        System.out.println("Chain two consumers using andThen() – first print the number, then print its cube.");

        Consumer<Integer> num = n -> System.out.println("Num : " + n);
        num.accept(5);

        Consumer<Integer> cube = n -> System.out.println("Cube : " + n * n * n);
        cube.accept(4);

        Consumer<Integer> chaining = num.andThen(cube);
        chaining.accept(3);
        System.out.println("\n===========================\n");

        // 4. Use forEach() with a Consumer to print all elements of a list.

        List<Integer> li = Arrays.asList(10, 20, 30, 40, 50, 60);
        li.forEach(System.out::println);

        System.out.println("\n===========================\n");
        // 5. Create a Consumer<List<Integer>> to increment each element by 1 and print
        // the
        // list.
        Consumer<List<Integer>> incrBy1 = list -> {
            list.replaceAll(a -> a + 1);
            System.out.println(list);
        };
        incrBy1.accept(li);
        System.out.println("\n===========================\n");
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
