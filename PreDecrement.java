class PreDecrement 
{
	public static void main(String[] args) 
	{
		int i = 50;

		int j = --i + i + --i + i + --i + i + --i;

		System.out.println(i);
		System.out.println(j);
	}
}
