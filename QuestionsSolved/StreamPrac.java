import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

//To print only the even numbers that are present in a collection

class StreamPrac{
    public static void main(String[] args) {
        
        // List<Integer> li = Arrays.asList(10,20,30,40,50,60);

        // Stream<Integer> stream =li.stream();

        // Stream<Integer> filter = stream.filter(a->a%2==0);

        // List<Integer> collect = filter.collect(Collectors.toList());

        // collect.forEach(e->System.out.println(e));

        // Stream<Integer> c = li.stream().filter(a -> a%2==0).collect(Collectors.toList());
        // System.out.println(c);

        List<Integer> collect2 = Stream.iterate(0, x-> x + 1)
        .limit(100)
        .filter(x->x%2==0)
        .map(x -> x/2)
        .distinct()
        .sorted((a,b) -> (b-a))
        .collect(Collectors.toList());

        System.out.println(collect2);
    }
}