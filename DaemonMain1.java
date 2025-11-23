class DaemonThread extends Thread 
{
	public void run(){
		for(int i=1;i<=10;i++){
		System.out.println("Life Is Already In Dipression....");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){

		 }
	  }
	}
}
class DaemonMain1
{

	public static void main(String[] args) 
	{
        DaemonThread d = new DaemonThread();
		d.setDaemon(true);
		d.start();
        for(int i=1;i<=5;i++){
		System.out.println("Not make This Complicated....");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){

		 }
	   }
	}
}
