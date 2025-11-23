import java.util.Scanner;

class ScannerEx 
{
	public static void main(String[] args) 
	{
        Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number");
		int fno=scn.nextInt();
        System.out.println("Enter Second Number");
		int sno=scn.nextInt();
        int res = fno+sno;
		System.out.println("Result::"+res);
	}
}
