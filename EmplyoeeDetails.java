class EmplyoeeDetails 
{
	int eid = 100;
	String name = "ADITYA ROUT";
	String desg = "Fullstack java Developer";

	public EmplyoeeDetails(){
		System.out.println("constructor executed....");
	}
	public static void main(String[] args) 
	{
    EmplyoeeDetails e = new EmplyoeeDetails();
		System.out.println(e.eid);
		System.out.println(e.name);
		System.out.println(e.desg);
	}
}
