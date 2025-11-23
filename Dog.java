class Dog 
{
	int legs=4;
	int tails=1;
	int eyes=2;
	String name="Kallu";
	String color="brown";

	public void bark(){
		System.out.println("Dog is Barking");
	}
	public void bite(){
		System.out.println("Dog is Biteing");
	}
	public static void main(String[] args) 
	{
		Dog d =new Dog();
		System.out.println(d.name);
		System.out.println(d.tails);
		System.out.println(d.eyes);
		System.out.println(d.legs);
		System.out.println(d.color);
		d.bark();
		d.bite();
	}
}
