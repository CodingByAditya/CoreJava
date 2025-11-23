class MyHookThread extends Thread 
{
	public void run(){
		System.out.println("Hook Thread Executed Successfully....");
	}
}
class MainHook
{
	public static void main(String[] args) 
	{
		MyHookThread t = new MyHookThread();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t);
		
		for(int i=1;i<=10;i++){
		System.out.println("JVM Is Executed....");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){

		}
		if(i==5){
			System.exit(0);
		}
	  }
    }
}
