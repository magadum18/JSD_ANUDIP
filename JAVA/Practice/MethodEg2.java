import java.util.Scanner;
class MethodEg2{
     void calcEvenOdd(int num){
      if(num%2==0) {
           System.out.println("Number is even ");
      else{
           System.out.println("Number is Odd ");
         }
         }

}	 
         public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Number ");
           int num = sc.nextInt();

           MethodEg2 obj = new MethodEg2(); //class Object
          obj.calcEvenOdd(num);// method invoke with object
}
}