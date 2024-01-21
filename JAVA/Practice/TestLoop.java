//package ConditionalStatement
import java.util.Scanner;
public class TestLoop {
	public static void main(String args[])
	{ 
	  int option;
	do
	{	System.out.println("Add-1");
		System.out.println("Subtract-2");
		System.out.println("Multiply-3");
		System.out.println("Even/Odd-4;");
		System.out.println("quit-5;");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your option");
		 option=sc.nextInt();
		 switch(option)
		 {
		    case 1:
			 System.out.println("enter first number");
			 int a=sc.nextInt();
		     
		     System.out.println("enter second number");
		     int b=sc.nextInt();
		     int ans=a+b;
		     System.out.println("the addition of first and second number ="+ ans);
		     break;
		     
		    case 2:
		    	System.out.println("enter first number");
				 int m=sc.nextInt();
				 System.out.println("enter second number");
			     int n=sc.nextInt();
			     int c=m-n;
			     System.out.println("the subtraction of first and second number= "+ c);
			     break;
			case 3:
		    	System.out.println("enter first number");
				 int s=sc.nextInt();
				 System.out.println("enter second number");
			     int t=sc.nextInt();
			     int st=s*t;
			     System.out.println("multiplication of two number= "+ st);
			     break;
		    case 4:
		    	System.out.println("enter first number");
				 int num=sc.nextInt();
				 if(num%2==0)
				 {
				 System.out.println(" given number is even number");
				 }
				 else
				 {
					 System.out.println(" given number is odd number");
				 }
			     
			     break;
		    case 5:
		    	System.out.println("quit");
		    	break;
		 }
	}
	  while(option !=5);
	
	}
}