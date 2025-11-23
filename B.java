class A
{
	public int m1(int a){
	System.out.println("Bikash");
	return 200;
  }
}
class B extends A
{
    public String m1(int a){
	System.out.println("Bikash");
  }

  public static void main(String[]args)
	{
	  B b = new B();
	  b.m1(100);
	}
}