import java.io.*;
class FileNotFoundException1
{
	public static void main(String[] args) 
	{
		FileInputStream fis = new FileInputStream("pqr.text");
		System.out.println("Hello World!");
	}
}
