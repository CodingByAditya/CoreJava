class MyThread extends Thread 
{
	public void run(){
		System.out.println("IPL Start From 22nd March");
	}
	public void run(String s1){
		System.out.println("Csk Vs Mi 23nd March");
	}
}
class MainThread3

{

	public static void main(String[] args) 
	{
		MyThread m1 = new MyThread();
		m1.run();
	}
}
