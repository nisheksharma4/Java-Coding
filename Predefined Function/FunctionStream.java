import java.util.function.Function;

public class FunctionStream {

    public static void main(String[] args) {
        // 1. Write a Function<String, Integer> to return the length of a string.
        Function<String, Integer> len = s -> s.length();
        System.out.println("Length : "+len.apply("Hello"));

        System.out.println("\n===============\n");


        // 2. Write a Function<Integer, Integer> to return the square of a number.
            Function<Integer, Integer> sq = n -> n*n;
            System.out.println("Square : "+sq.apply(6));
            System.out.println("\n===============\n");
        // 3. Use Function.andThen() → First multiply a number by 2, then add 10.
            Function<Integer, Integer> mulBy2 = n -> n*2;
            Function<Integer, Integer> add10 = n -> n+10;
            Function<Integer, Integer> multiThenAdd = mulBy2.andThen(add10);
            System.out.println("Multiply by 2 and Then Add 10 : "+ multiThenAdd.apply(20));
            System.out.println("\n===============\n");

        // 4. Use Function.compose() → First add 10, then multiply by 2.
        Function<Integer, Integer> addThenMultiply = mulBy2.compose(add10);
        System.out.println("Add and then Multiply : "+ addThenMultiply.apply(25));
        System.out.println("\n===============\n");

        // 5. Write a Function<String, String> to convert a string to uppercase and trim
        // spaces.

        Function<String, String> uppcase = s -> s.toUpperCase().trim();
        System.out.println("Apply uppercase and Trim : "+uppcase.apply("  anmol"));
        System.out.println("\n===============\n");

        //6. pipeline

        System.out.println("Pipelining method chaining\n");

        Function<Integer, Integer> pipeline = mulBy2.andThen(add10).andThen(sq);

        System.out.println("Multiply then add 10 and then square : "+pipeline.apply(5)+"\n");
    }
}
