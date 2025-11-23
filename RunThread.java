class MyRunnable implements Runnable 
{
	public void run(){
		for(int i=1;i<=5;i++){
		System.out.println("User-Thread...");
		}
	}
}
class RunThread
{
	public static void main(String[] args) 
	{
       MyRunnable m = new MyRunnable();
         Thread t = new Thread(m);
		 t.start();
		for(int i=1;i<=5;i++){
		System.out.println("Main-Thread...");
		}
	}
}
