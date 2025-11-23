class College10 
{
	int clgcenterno = 205;
	String clgname = "BHADRAK INSTITUTE OF ENGINGERING & TECHNOLOGY";
    String Address = "Barpada,Bhadrak";
	
	public void m1(){
		System.out.println("This is a old & Famous clg");
	}
}
    public class College20 extends College10 
    {
		String pincode ="756100";
		
		public void m2(){
		System.out.println("This is The address of BIET");

    }
	public static void main(String[] args) 
	{
		College20 c = new College20();
		System.out.println(c.clgcenterno);
		System.out.println(c.clgname);
		System.out.println(c.Address);
		System.out.println(c.pincode);
        c.m1();
		c.m2();
		}
}
	