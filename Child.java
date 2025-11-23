class Parent 
{
	void Advice(){
       System.out.println("Don't Expens Money");
	}
}

class Child extends Parent
{
	void Advice(){
       System.out.println("Expens Money");
	}

	public static void main(String[] args) 
	{
        Parent p = new  Child();
		p.Advice();
	}
}
