abstract class Mobileshop 
{
	abstract void VIVO();
    abstract void oneplus();
	abstract void iphone();
}
abstract class vivoShop extends Mobileshop
{
	void VIVO(){
		System.out.println("vivo v50 series price 30,000");
   }
}
abstract class oneplusShop extends vivoShop
{
	void oneplus(){
		System.out.println("one plus 13 series price 70,000");
	}
}
 class iphoneShop extends oneplusShop 
{
	void iphone(){
		System.out.println("iphone 16 series price 1,00,000 ");
	}

	public static void main(String[] args) 
	{
		iphoneShop i = new iphoneShop();
		i.VIVO();
		i.oneplus();
		i.iphone();
	}
}
