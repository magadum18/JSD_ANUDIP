//Alpabet Traingle Pattern 
class PatternEg3{
	
	void printPattern(int number){
		int i,j;
		char alpha = 'A';
		for(i=1;i<=number;i++){
			//for(j=1;j<=i;j++)
			for(j=1;j<=number;j++){
				System.out.print(alpha + " ");
				alpha++;
			}
			System.out.println();
		}
	}		
	public static void main(String args[]){
		int number = 5;
		PatternEg3 p = new PatternEg3();
		p.printPattern(number);
	}
}