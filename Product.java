class Mobile
{
	static String brand="Apple";
	String name;
	String color;
	double price;
    
	public Mobile(String name,String color,double price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public static void main(String[] args) 
	{
		Mobile m1 = new Mobile("Iphone 12","Black",45000.00);
		Mobile m2 = new Mobile("Iphone 13","Orange",50000.00);
		Mobile m3 = new Mobile("Iphone 14","Gray",60000.00);

		System.out.println("****Welcome my Apple Store****");
		System.out.println("-------First Phone Details----------");
		System.out.println("Name: "+m1.name);
		System.out.println("Color: "+m1.color);
		System.out.println("Price: "+m1.price);
		System.out.println("Brand: "+Mobile.brand);
		System.out.println("-------Second Phone Details----------");
		System.out.println("Name: "+m2.name);
		System.out.println("Color: "+m2.color);
		System.out.println("Price: "+m2.price);
		System.out.println("Brand: "+Mobile.brand);
		System.out.println("-------Third Phone Details----------");
		System.out.println("Name: "+m3.name);
		System.out.println("Color: "+m3.color);
		System.out.println("Price: "+m3.price);
		System.out.println("Brand: "+Mobile.brand);
	}
}

