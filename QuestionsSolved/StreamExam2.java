package QuestionsSolved;

//To print the names, only if the name consists of more than 5 characters.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExam2 {
  public static void main(String[] args) {
    List<String> li = Arrays.asList("Ram","Avinash","Balaji","Dev");

    List<String> collect = li.stream().filter(a->a.length()>5).collect(Collectors.toList());

    List<String> collect2 = li.stream().filter(a->a.charAt(0)=='A').collect(Collectors.toList());

    List<String> collect3 = li.stream().filter(a->a.endsWith("i")).collect(Collectors.toList());

    List<String> collect4 = li.stream().filter(a->a.contains("a")).collect(Collectors.toList());

    List<String> collect5 = li.stream().map(a -> a.concat("hi")).collect(Collectors.toList());

    li.stream().filter(a -> a.length()>5).map(a -> a.concat(" hi")).forEach(a -> System.out.println(a));
    li.stream().filter(a -> a.startsWith("A")).map(a -> a.concat(" hi")).forEach(a -> System.out.println(a));
    li.stream().filter(a -> a.endsWith("i")).map(a -> a.concat(" hi")).forEach(a -> System.out.println(a));
    li.stream().filter(a -> a.startsWith("R")).map(a -> a.concat(" hi")).forEach(a -> System.out.println(a));
    li.stream().filter(a -> a.contains("i")).map(a -> a.concat(" hi")).forEach(a -> System.out.println(a));
    
    System.out.println("Name length more than 5 : "+collect);
    System.out.println("Name having first Letter A : "+collect2);
    System.out.println("Names end with i : "+collect3);
    System.out.println("Names Contains a char : "+collect4);
    System.out.println("Names with hi added : "+collect5);
  }  
}
