interface India
{
	void m1();
	default void m2(){
		System.out.println("India have 28 states");
	}
	default void m3(){
		System.out.println("India have 8 unionterritories states");
	}
	default void m4(){
		System.out.println("India have 788 districts");
	}
}
class India2 implements India
{
	public void m1(){
		System.out.println("India have 137 airports");
  }

  public static void main(String[] args)
  {
	  India2 i = new India2();
	  i.m1();
	  i.m2();
	  i.m3();
	  i.m4();
  }
}