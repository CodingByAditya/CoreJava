class Company
{
	static String Company1name="TATA";
	static String Company2name="IBM";
	String numberofemployee;
	String employeename;
	String numberofdepartment;
	String nameofdepartment;
	String GSTno;

    public Company(String numberofemployee,String employeename,String numberofdepartment,String nameofdepartment,String GSTno)
	    {
		this.numberofemployee=numberofemployee;
		this.employeename=employeename;
		this.numberofdepartment=numberofdepartment;
		this.nameofdepartment=nameofdepartment;
		this.GSTno=GSTno;
}
public static void main(String[]args)
	{
    Company c1=new Company("001","Aditya Rout","010","Mechanical","09AAACH7409R1ZZ");
    Company c2=new Company("002","Bibhuti Ranjan Behera","015","Electrical","29AAACH7409R1ZX");

    Company c3=new Company("100","Bibek Pradhan","230","CSE","27AAACH7409R1Z1");
	Company c4=new Company("120","Goutam Nayak","250","IT","23AAACH7409R1Z9");

	System.out.println("//WELCOME TATA GROUP OF COMPANY\\");
    System.out.println("---First Employee Detais---");
	System.out.println("numberofemployee="+c1.numberofemployee); 
	System.out.println("employeename="+c1.employeename);
	System.out.println("numberofdepartment="+c1.numberofdepartment);
	System.out.println("nameofdepartment="+c1.nameofdepartment);
	System.out.println("GSTno="+c1.GSTno);
	System.out.println("Company1name="+Company.Company1name);

	System.out.println("---Second Employee Detais---");
    System.out.println("numberofemployee="+c2.numberofemployee);
    System.out.println("employeename="+c2.employeename); 
	System.out.println("numberofdepartment="+c2.numberofdepartment);
	System.out.println("nameofdepartment="+c2.nameofdepartment);
	System.out.println("GSTno="+c2.GSTno);
	System.out.println("Company1name="+Company.Company1name);

    System.out.println("//WELCOME IBM COMPANY\\");
    System.out.println("---First Employee Detais---");
	System.out.println("numberofemployee="+c3.numberofemployee); 
	System.out.println("employeename="+c3.employeename);
	System.out.println("numberofdepartment="+c3.numberofdepartment);
	System.out.println("nameofdepartment="+c3.nameofdepartment);
	System.out.println("GSTno="+c3.GSTno);
	System.out.println("Company2name="+Company.Company2name);

    System.out.println("---Second Employee Detais---");
    System.out.println("numberofemployee="+c4.numberofemployee);
    System.out.println("employeename="+c4.employeename); 
	System.out.println("numberofdepartment="+c4.numberofdepartment);
	System.out.println("nameofdepartment="+c4.nameofdepartment);
	System.out.println("GSTno="+c4.GSTno);
	System.out.println("Company2name="+Company.Company2name);
   }
}