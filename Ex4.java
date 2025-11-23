class Ex4
{
	static int a =10;
    static String b ="ADITYA";

	static{
		System.out.println("static block execute");
	}
	 public static void main(String[] args)
	{
		 System.out.println(Ex4.a);
		 System.out.println(Ex4.b);
	}
}