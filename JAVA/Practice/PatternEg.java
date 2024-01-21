//Number Triangle Pattern
class PatternEg{
	
	void printPattern(int number){
		int i,j;
		//outer loop for handling number of rows
		for(i=1;i<=number;i++){
			
			//inner loop to print space
		  for(j=1;j<=number-1;j++){
			  System.out.print("  ");
		  }
		  //inner loop to print star
			for(j=1;j<=i;j++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		int number = 5;
		PatternEg p = new PatternEg();
		p.printPattern(number);
	}
}