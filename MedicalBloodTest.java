class MedicalBloodTest 
{
	public void report(){
		System.out.println("All Test");
   }
	public void report(String test1){
		System.out.println(test1);
   }
	public void report(String test1,String test2){
		System.out.println(test1+""+test2);
   }
	public void report(String test1,String test2,String test3){
		System.out.println(test1+""+test2+""+test3);
   }
    public void report(String test1,String test2,String test3,String test4){
        System.out.println(test1+""+test2+""+test3+""+test4);
   }

    public static void main(String[] args) 
	{
		MedicalBloodTest m = new MedicalBloodTest();
		m.report();
		m.report("Dipetis");
		m.report("RBC","WBC");
		m.report("COLLESTROL","Urine","ECG");
		m.report("CBC","Lipid panel","Thyroid","CT");

	}
}
