import java.util.Stack;

class StackEx 
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push(100);
		s.push(2000);
		s.push(5000);
		s.push(10000);
		System.out.println("Stack..."+s);
		s.pop();
		System.out.println("Remove Element...."+s);
        s.peek();
		System.out.println("Element At Top...."+s);
		int position = s.search(2000);
		System.out.println("Position Of 2000...."+position);
		
		System.out.println(s.empty());
		s.clear();
		System.out.println(s.empty());
	}
}
