class StringBuilderMethod 
{
	public static void main(String[] args) 
	{
        StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb);

        sb.insert(5," Beautiful");
		System.out.println(sb);

		sb.replace(16,21," Universe");
		System.out.println(sb);

        sb.delete(6,15);
		System.out.println(sb);

		String str = sb.toString();
		System.out.println(str);

		sb.deleteCharAt(2);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

	}
}
