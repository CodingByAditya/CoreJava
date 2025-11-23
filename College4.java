class College
{
	int clgid = 502;
	String Engtecher = "Sanjay Das";
}
class College1 extends College
{
	String Mathtecher = "Shiva Das";
}
class College2 extends College1
{
	String Odiatecher = "Subrava Das";
}
class College3 extends College2
{
	String Snskrittecher = "Ashok Sahu";
}
class College4 extends College3
{
	String Sciencetecher = "Sanjay Nath";

	public static void main(String[]args)
	{
      College4 c = new College4();
	  System.out.println(c.clgid);
	  System.out.println(c.Engtecher);
	  System.out.println(c.Mathtecher);
	  System.out.println(c.Odiatecher);
	  System.out.println(c.Snskrittecher);
	  System.out.println(c.Sciencetecher);
   }
}