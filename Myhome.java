class Myfamily
{
	public void father(){
		System.out.println("Subal kumar Rout");
  }
	public void mother(){
		System.out.println("Manasi Rout");
  }
    public void sister(){
		System.out.println("Sasiprava Rout");
	}
}

class Myhome extends Myfamily
{
	public void sister(){
		System.out.println("Abhilipsa Rout");
	}
	public static void main(String[]args)
	{
      Myhome m = new Myhome();
	  m.father();
	  m.mother();
	  m.sister();
	}
}