import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{
   private static Scanner console = new Scanner(System.in);

   public static void main(String args[]){
   
      Random random = new Random();
      int answer = random.nextInt(100) + 1;
      guess(answer);
      
   }

   private static void guess(int answer) {
      System.out.print("Type a number: ");
      
      int input = console.nextInt();
      
      if (input == answer) {
         System.out.println(input + " is correct!");
      }
      else if (input > answer) {
         System.out.println(input + " is too high");
         guess(answer);
      }
      else {
         System.out.println(input + " is too low");
         guess(answer);
      }
   }
}
