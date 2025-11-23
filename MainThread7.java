class MyThread extends Thread   
{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
class MainThread7
{

	public static void main(String[] args) 
	{
		MyThread m1 = new MyThread();
		//m1.setpriority(10);
		m1.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		MyThread m2 = new MyThread();
		m2.setPriority(Thread.MIN_PRIORITY);
		m2.start();
		MyThread m3 = new MyThread();
		m3.setPriority(Thread.NORM_PRIORITY);
		m3.start();
	}
}
