interface LibraryUser {
	public void registerAccount(int age);
	public void requestBook(String bookType);
	
} class KidsUser implements LibraryUser {
	//int age;
//String bookType;
public void registerAccount(int age)
{   // this.age=age;
if(age<12)
{
	System.out.println("You have seccessfully registered kids account");
}
else
{
	System.out.println("sorry age must be less than 12 to register as a kids");
}



	
}
public void requestBook(String bookType)
{
	//this.bookType=bookType;
	if(bookType=="kids")
	{
		System.out.println("Books issued successfully,please return the book in 10 days");
	}else
	{
		System.out.println("oops , you are not allowed to take only kids books");
	}
	System.out.println("---------------------------------------------------");
}


}
 class AdultUser implements LibraryUser
{


	public void registerAccount(int age)
    
	{ 
	//this.age=age;
	   if(age>12)
	 {
		   System.out.println("you have successfully registered under an  adult account");
		   
	}
	 else
	 {
		 System.out.println("sorry,age must be greater than 12 to register as an adult");
	 }
		
	
	}
	public void requestBook(String bookType)
	{
	   //this.bookType=bookType;
	 if(bookType=="fiction")
	 {
		 System.out.println("book issued successfully return the book within 7 days");
	 }
	 else
	 {
		 System.out.println("oops you are not allowed to take only adult fiction books");
	 }

	
	}
}
	
	

public class BooksObject {
	public static void main(String args[])
	{
		KidsUser k=new KidsUser();
		AdultUser a=new AdultUser();
		k.registerAccount(10);
		k.requestBook("kids");
		a.registerAccount(18);
		a.requestBook("fiction");
		
	}

}