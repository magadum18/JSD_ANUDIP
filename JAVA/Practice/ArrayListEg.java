package collectionss;

import java.util.ArrayList; //import package
import java.util.Iterator;

public class ArrayListEg {
	public static void main(String[] args) {
		//creation of arraylist 
		ArrayList<Integer> aa = new ArrayList<Integer>();
		
		System.out.println(aa.isEmpty()); //true, as no elements in list
		
		//adding elements to integer list
		aa.add(1234);
		aa.add(5678);
		aa.add(0, 9876); //value at 0 index
		aa.add(5678); //duplicate value
		aa.add(3456);
		aa.add(2345);
		aa.add(6784);
		aa.add(1297);
		aa.add(1,07);
		aa.add(3,9);
		
		System.out.println(aa.isEmpty()); //false
		
		//traversing using for loop
		for(int i=0;i<aa.size();i++) {
			System.out.println(aa.get(i));
		}
		
		//creating String arraylist
		ArrayList<String> aa1 = new ArrayList<String>();
		aa1.add("abc");
		aa1.add("def");
		aa1.add("ghj");
		aa1.add("lkj");
		aa1.add("mno");
		aa1.add("qwe");
		aa1.remove(0); //remove element at index 0
		aa1.add("def");
		aa1.add("11aaa");
		aa1.add("xyz");
		
		System.out.println(aa1);  //printing aa1
		
		//adding new elements to existing arraylist
		aa1.add("tyu");
		aa1.add("uio");
		aa1.remove(5); //remove an element at index 5
		
		//traversing using foreach loop
		for(String a : aa1) {
			System.out.println(a);
		}
		
		Iterator<String> ii = aa1.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
	}
}
