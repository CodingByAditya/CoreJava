class MyBiodata 
{
	public void name(){
		System.out.println("Aditya Rout");
	}
	public void age(){
		System.out.println("Age = 19");
	}
	public void Schoolstudy(){
		System.out.println("S.S.V.M,PURUNA BAZAR,BHADRAK");
	}
	public void Higherstudy(){
		System.out.println("VINAYAK RESIDENTIAL HIGHER SECONDARY SCHOOL,BHADRAK");
	}
	public void Betechstudy(){
		System.out.println("BHADRAK INSTITUTE OF ENGINEERING AND TECHNOLOGY,BHADRAK");
	}

	public static void main(String[] args) 
	{
		MyBiodata m = new MyBiodata();
		m.name();
		m.age();
        m.Schoolstudy();
		m.Higherstudy();
        m.Betechstudy();
	}
}
