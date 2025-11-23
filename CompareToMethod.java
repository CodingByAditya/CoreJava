class CompareToMethod 
{
	public static void main(String[] args) 
	{
		String name1 = "aditya";
		String age1 = "20";
		String name2 = "Gudu";
		String age2 = "20";
		System.out.println(name1.compareTo(name2));
		System.out.println(age1.compareTo(age2));
		System.out.println(name1.compareTo(age2));
		System.out.println(age1.compareTo(name2));
		System.out.println(age1.compareToIgnoreCase(name2));
		System.out.println(name1.compareToIgnoreCase(name2));
	}
}
