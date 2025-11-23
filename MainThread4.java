class MyThread extends Thread  
{
	public void run(){
		System.out.println("1st Match RCB VS KKR");
	}
}
class MainThread4
{

	public static void main(String[] args) 
	{
		MyThread m1 = new MyThread();
		m1.start();
		MyThread m2 = new MyThread();
		m2.start();
		MyThread m3 = new MyThread();
		m3.start();
	}
}
