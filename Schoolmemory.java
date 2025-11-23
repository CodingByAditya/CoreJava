interface Memory
{
	default void somememory(){
		System.out.println("We have some memory in school life");
	}
}
class Schoolmemory implements Memory
{
	 	public void somememory(){
		    System.out.println("We have some memory in school life");
		}
		public static void main(String[]args)
	{
        Schoolmemory s = new Schoolmemory();
		s.somememory();
	}
}