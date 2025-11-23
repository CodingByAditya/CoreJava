class AllCasesException8 
{
	public static void main(String[] args) 
	{
		try{
		System.out.println(10/0);
		System.out.println("Aditya".charAt(1));
		}catch(ArithmeticException e1){
					System.out.println("Catch Block-1 executed");
		}catch(StringIndexOutOfBoundsException e2){
					System.out.println("Catch Block-2 executed");
		}
		System.out.println("Rest of code");
	}
}
