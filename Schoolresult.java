class Schoolexam
{
	public void Mmark(int a, int b){
	System.out.println("Mathmark");
  }
	public void Emark(int c){
	System.out.println("Engmark");
  }
    public void Smark(int s,int y,int n){
	System.out.println("Sciencemark");
  }
}
class Schoolresult extends Schoolexam
{
	public void Mmark(int a, int b){
	System.out.println("Mathresult");
  }
	public void Emark(int c){
	System.out.println("Engresult");
  }
    public void Smark(int s,int y,int n){
	System.out.println("Scienceresult");
  }

    public static void main(String[]args)
  {
     Schoolresult s = new Schoolresult();
	 s.Mmark(100,200);
	 s.Emark(100);
	 s.Smark(92,82,65);
  }
}