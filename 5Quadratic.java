import java.util.Scanner;

public class Quadratic{
   public static void main(String args[]){
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter A: ");
    if (!in.hasNextDouble()) {
      String word = in.next();
      System.err.println(word + " is not a number");
      return;
    }
    double a = in.nextDouble();
    
    System.out.print("Enter B: ");
    if (!in.hasNextDouble()) {
      String word = in.next();
      System.err.println(word + " is not a number");
      return;
    }
    double b = in.nextDouble();
    
    System.out.print("Enter C: ");
    if (!in.hasNextDouble()) {
      String word = in.next();
      System.err.println(word + " is not a number");
      return;
    }
    double c = in.nextDouble();
    
    if (a <= 0) {
      System.out.println("This is not a quadratic equation");
      return;
    }
    
    double delta = b*b - 4.0*a*c;
    if (delta > 0) {
      double sqrt = Math.sqrt(delta);
      double root1 = (-b + sqrt) / (2*a);
      double root2 = (-b - sqrt) / (2*a);
      System.out.println(root1);
      System.out.println(root2);
    } else if (delta == 0) {
      double sqrt = Math.sqrt(delta);
      double root1 = (-b + sqrt) / (2*a);
      System.out.println("There is only one root: " + root1);
    } else {
      System.out.println("There is no root");
    }

    // 561, 2-42, 521
   }
}
