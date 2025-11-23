class SplitMethod 
{
	public static void main(String[] args) 
	{
		String Place = "I Want To Visit Maldipe";
		String[] Place1 = Place.split(" ");
		System.out.println(Place1[0]);
		System.out.println(Place1[1]);
		System.out.println(Place1[2]);
		System.out.println(Place1[3]);
		System.out.println(Place1[4]);
		System.out.println("...............");

		for(String Place2:Place1)
		{
		   System.out.println(Place2);
	}
}
}
