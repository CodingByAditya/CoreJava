import java.util.LinkedList;
class LinkedListEx 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add(1000);
		ll.add(2000);
		ll.add(2000);
		ll.add(5050.20);
		ll.add("Darjling");
		ll.add(false);
		ll.add(null);
		System.out.println(ll);
		ll.add(4,"Meghalaya");
		System.out.println(ll);
		System.out.println(ll.get(5));
        ll.set(7,true);
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
	}
}
