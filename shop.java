abstract class Shop
{
	abstract void shop1();

	public void shop2(){
		System.out.println("car shop");
	}

	abstract void shop3();
}
class shop4 extends Shop
{
	public void shop1(){
		System.out.println("bike shop");
	}
	public void shop3();
		System.out.println("vegetable shop");
}

	public static void main(String[] args) 
	{
		shop4 s = new shop4();
		s.shop1();
		s.shop2();
		s.shop3();
	}
}
