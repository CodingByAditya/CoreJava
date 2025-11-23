class StringBufferMethod
{
	public static void main(String[] args) 
	{
        StringBuffer sb1 = new StringBuffer("NAGALAND");
		System.out.println(sb1.reverse());

		StringBuffer sb2 = new StringBuffer("MEGHALAY");
		sb2.replace(2,6,"Hindustan");
		System.out.println(sb2);

		StringBuffer sb3 = new StringBuffer("Haryana");
		sb3.delete(2,5);
		System.out.println(sb3);

		StringBuffer sb4 = new StringBuffer("Keral");
		sb4.insert(3,"lll");
		System.out.println(sb4);

		StringBuffer sb5 = new StringBuffer("Goa");
        sb5.deleteCharAt(2);
		System.out.println(sb5);

		StringBuffer sb6 = new StringBuffer("Satya");
		sb6.append(" Swani");
		System.out.println(sb6);
	}
}
