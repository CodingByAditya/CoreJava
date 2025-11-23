class parent1
{
	int money = 100000;
} 
class child1 extends parent1
{

}
class child2 extends parent1
{

}
class parent2 extends child1,child2
{


	public static void main(String[] args) 
	{
		parent2 p = new parent2();
	}
}
