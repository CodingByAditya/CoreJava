import java.util.ArrayList;

class ArrayList1
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(2000);
		al.add(10);
		al.add("Buku");
		al.add("Ciku");
		al.add(true);
		al.add(null);
		al.add(false);
		System.out.println(al);
		System.out.println(al.size());
		al.add(1,"0");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.set(1,"25.21");
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
	}
}
