class Student 
{
	int sid;
	String sname;

	public Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	public String toString(){
		return sid+" "+sname;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(101,"mannu");
		Student s2 = new Student(102,"sidharth");

		System.out.println(s1);
		System.out.println(s2);

	}
}
