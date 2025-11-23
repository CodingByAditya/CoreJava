class Ex8
{
     int a;
	 int b;
	{
		System.out.println("NSB executed");
		a=100;
		b=200;
	}
	public static void main(String[] args)
	{
		Ex8 e = new Ex8();
		System.out.println(e.a);
		System.out.println(e.b);
	}
}