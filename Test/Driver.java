public class Driver {
    
   public static void main(String[] args) {
    Calculation c = (a,b) -> a+b;

    System.out.println("Addition : "+ c.sum(5, 10));
   }
}
