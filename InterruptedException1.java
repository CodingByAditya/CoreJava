class InterruptedException1 
{
	public static void main(String[] args) 
	{
		System.out.println("Horry....");
		try{
		Thread.sleep(2000);
		}catch(InterruptedException ie){

		}
		System.out.println("Ohh....");
	}
}
