public class Multadd {
    
    public static double multAdd(double a, double b, double c){
      double result = a * b + c;
      return result;
    }
    
    public static double expSum(double d){
      double result = multAdd(d, Math.exp(-d), Math.sqrt(1-Math.exp(-d)));
      return result;
    }
    
    public static void main(String[] args) {
      double test1 = multAdd(1/2, 2.0, 3.0);
      System.out.println(test1);
      double test2 = multAdd(1/2.0, Math.cos(Math.PI/4), Math.sin(Math.PI/4));
      System.out.println(test2);
      double test3 = expSum(2.0);
      System.out.println(test3);
    }

}
