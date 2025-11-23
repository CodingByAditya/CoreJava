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
class parent3 extends child1,child2
{


	public static void main(String[] args) 
	{
		parent3 p = new parent3();
	}
}