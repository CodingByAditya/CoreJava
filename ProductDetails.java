class ProductDetails 
{
	int pid = 200;
	String pname = "Thumpsup";
	 String pexpairy ="15.02.2025";
	String pcolor = "blue";
	double pprice = 99.0;

	public ProductDetails(){
    System.out.println("constructor executed....");
	}
	public static void main(String[] args) 
	{
		ProductDetails p = new ProductDetails();
        System.out.println(p.pid);
        System.out.println(p.pname);
		System.out.println(p.pexpairy);
		System.out.println(p.pcolor);
		System.out.println(p.pprice);
	}
}
