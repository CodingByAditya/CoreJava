class MyThread1 extends Thread
{
	public void run(){
		for(int i=1;i<=10;i++){
		System.out.println("Hus");
		}
	}
}

class MainThread2
{
	
	public static void main(String[] args) 
	{
		MyThread1 m1 = new MyThread1();
		m1.run();
		for(int i=1;i<=10;i++){
		System.out.println("ohhh");
		}
	}
}