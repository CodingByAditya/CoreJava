class MethodExample10
{
	public static int m1(){
	System.out.println("m1-method");
	return 100;
   }
	public static String m2(){
	System.out.println("m2-method");
	return"aditya";
   }
    public static double m3(String s1,String s2){
	System.out.println("m3-method");
    return 300.00;
   }
    public static boolean m4(int a,double b,char c){
	System.out.println("m4-method");
	return true;
   }
    public static void m5(){
	System.out.println("m5-method");
   }
    public static void m6(String name, int age){
	System.out.println("m6-method");
   }
    public static void main(String[]args)
   {
    MethodExample10.m1();
	MethodExample10.m2();
	MethodExample10.m3("java","adv java");
	MethodExample10.m4(100,200.00,'1');
	MethodExample10.m5();
	MethodExample10.m6("Aditya",19);
   }
}	