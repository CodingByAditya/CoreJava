class Teacher 
{
	static void order(){
		System.out.println("Please Silence Children");
	}
}
class Children extends Teacher
{
	static void order(){
		System.out.println("Children are not obey teachers order");
}

	public static void main(String[] args) 
	{
		Teacher t = new Children();
		t.order();
	}
}
