import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateStreamWork {
    public static void main(String[] args) {

        // Write a Predicate<Integer> to check if a number is even. Test it with
        // multiple values.
        System.out.println("ISEven ");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Output : " + isEven.test(5));
        System.out.println("Output : " + isEven.test(5));
        System.out.println("===================================\n");

        // Write a Predicate<String> to check if a string is empty or null.
        System.out.println("IsNull Checking...");
                Predicate<String> isNull = a -> a == null || a.isEmpty();
                System.out.println("Is Null : " + isNull.test("Hello"));
                System.out.println("===================================\n");

        // Use a Predicate<String> to filter names starting with "A" from a list.
        
         List<String> names = Arrays.asList("Abhishek", "abhinav", "Nishek", "khushi");

        Predicate<String> filteredNames = a -> a.startsWith("a") || a.startsWith("A");
        Predicate<String> filterEndWithA = s -> s.endsWith("k");
        System.out.println("Names End with K");
        names.stream().filter(filterEndWithA).forEach(System.out::println);

        System.out.println("\nNames Starts with A or a");
        System.out.println("\nFiltered Names : ");
        names.stream().filter(filteredNames).forEach(System.out::println);

        System.out.println("===================================\n");

        // Combine two predicates: check if a number is positive AND even.
        System.out.println("Two Predicate Functions ");

        Predicate<Integer> isPositive = a -> a > 0;
        Predicate<Integer> isPositiveAndEven = a -> isPositive.test(a) && isEven.test(a);
        System.out.println("Positive and Even : " + isPositiveAndEven.test(-5));
        System.out.println(isPositiveAndEven.test(44));

        System.out.println("===================================\n");

        // Negate a predicate: check if a number is not divisible by 3.
        System.out.println("Negate function is used ");
        Predicate<Integer> isDivisibleBy3 = a -> a % 3 == 0;
        Predicate<Integer> isNotDivisibleBy3 = isDivisibleBy3.negate();
        System.out.println("Is Divisible By 3 : " + isNotDivisibleBy3.test(6));

    }
}
