import java.util.ArrayList;

public class ArrayListEg{
   
    public static void main(String[] args) {
        
    
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
		aa.add(1,1354);
		
       
                
            
		System.out.println(aa.isEmpty()); //false
		
		//traversing using for loop
		for(int i=0;i<aa.size();i++) {
			System.out.println(aa.get(i));
        }
    }
    
}