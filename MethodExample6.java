class MethodExample
{
	public void percentage(){
		int num1 =333;
		int num2 =600;
		double res  =num1/num2;
		System.out.println("First number--- "+num1);
		System.out.println("Second number--- "+num2);
		System.out.println("Result---- "+res);
	}
	public static void main(String[] args) 
	{
		MethodExample m = new MethodExample();
		m.percentage();
	}
}
