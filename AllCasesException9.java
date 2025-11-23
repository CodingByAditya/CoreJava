class AllCasesException9 
{
	public static void main(String[] args) 
	{
		try{
		System.out.println(10/0);
		System.out.println("Aditya".charAt(11));
		}catch(ArithmeticException e1){
					System.out.println("Global Catch Block-1 executed");
		}
		System.out.println("Rest of code");
	}
}
