class SleepThread extends Thread 
{
	public void run(){
		for(int i=1;i<=5;i++){
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){

			}
		      System.out.println(i);
		}
	}
}
class MainSleep
{
	public static void main(String[] args) 
	{
       SleepThread s1 = new SleepThread();
       SleepThread s2 = new SleepThread();
	   s1.start();
	   s2.start();
	}
}
