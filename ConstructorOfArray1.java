import java.util.ArrayList;

class ConstructorOfArray1
{
	public static void main(String[] args) 
	{
 ArrayList<String[]> al = new ArrayList<>();

		al.add("Buku");
		al.add("Chikun");

		 for (String[] row : arrayList) {
            for (String col : row) {
                System.out.print(col + " ");
            }
		 }
		System.out.println(al);
	}
}