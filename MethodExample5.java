class MethodExample6
{
	public void percentage(){
		int num1 =100;
		int num2 =200;
		int res  =num2/num1*100;
		System.out.println("First number--- "+num1);
		System.out.println("Second number--- "+num2);
		System.out.println("Result---- "+res);
	}
	public static void main(String[] args) 
	{
		MethodExample6 m = new MethodExample6();
		m.percentage();
	}
}
