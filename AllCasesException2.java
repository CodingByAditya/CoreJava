class AllCasesException2 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome");
		System.out.println("To");
		System.out.println("Puri");
		try{
		System.out.println(10/2);
		}catch(NullPointerException npe){
					System.out.println("Catch Block Is Executed");
		
		}
		System.out.println("Namaste");
	}
}
