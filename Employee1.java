class Employee1 
{
	    int eid;
		String ename;

		public Employee1(int eid,String ename)
			{
			this.eid = eid;
			this.ename = ename;
		}

			public static void main(String[] args) 
		{
				Employee1 e1 = new Employee1(100,"Aditya");
				Employee1 e2 = new Employee1(101,"Bikash");
				Employee1 e3 = new Employee1(100,"Sidharth");

		     System.out.println(e1.hashCode());
			 System.out.println(e2.hashCode());
			 System.out.println(e3.hashCode());
	}
}
