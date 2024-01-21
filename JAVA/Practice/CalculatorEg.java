// Method overloading
class Calculator {
    
   //same name same datatype but no of parmeters
    public void add(int a, int b){
    System.out.println("sum of two numbers: " + (a + b));
}
  //same name same datatype but no of parmeters
    public void add(int a, int b, int c){
    System.out.println("sum of three numbers: " + (a + b + c));
}
  //same name same no of parmeters but datatype change
    public void add(double a, double b){
    System.out.println("sum of two numbers: " + (a + b));
}
}
// main class
class CalculatorEg{

  public static void main(String args[]) {
        Calculator c = new Calculator();//object creation
        c.add(10 ,20);//invoke with object
        c.add(10,20,30);
        c.add(10.8,20.4);
    }
   }
    