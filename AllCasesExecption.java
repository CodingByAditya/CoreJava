class AllCasesExecption 
{
	void m3(){
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			e.printStackTrace().getMessage();
			
		}
	}
	void m2(){
		m3();
	}
	void m1(){
		m2();
	}
	public static void main(String[] args) 
	{
		AllCasesExecption e = new AllCasesExecption();
		e.m1();
	}
}
