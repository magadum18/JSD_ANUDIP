//Number increasing Pyramind Pattern 
class PatternEg1{
	
	void printPattern(int number){
		int i,j;
		//outer loop for handling number of rows
		for(i=1;i<=number;i++){
			
			//inner loop to handling number of cols
			for(j=1;j<=i;j++){
				System.out.print(j + " "); //print col values upto the row value
			}
		  System.out.println(); //print new line for each row
		}
	}
	
	public static void main(String args[]){
		int number = 5;
		PatternEg1 p = new PatternEg1();
		p.printPattern(number);
	}
}