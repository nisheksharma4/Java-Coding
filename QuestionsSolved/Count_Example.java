package QuestionsSolved;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Count_Example {
    
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10,20,30,40,50);

        List<Integer> li2 = Arrays.asList(10,25,25,35,35,10,20,17);

        long i = li.stream().count();

        li2.stream().filter(a->a%2==1).map(a->a*20).distinct().forEach(a->System.out.println("Distinct() : "+a));

        System.out.println("Count() function : "+i);


        //Max
        List<Integer> num = Arrays.asList(200,700,850,600,750);

        int maxVal = num.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum from num list : "+ maxVal);
    }
}
