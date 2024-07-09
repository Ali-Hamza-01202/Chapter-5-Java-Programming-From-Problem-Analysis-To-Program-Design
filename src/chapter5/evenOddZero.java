package chapter5;
import java.util.Scanner;
public class evenOddZero {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int number;
		int evenCount=0,oddCount=0,zeros=0;
		System.out.println("Please enter 20 digits, positive,negative or zeros");
		for(int i=0;i<=19;i++)
		{
			// to understand even, odd and zero count
			number = scanner.nextInt();
			if(number==0)
			{
				zeros++;
			}
			else if(number%2==1)
			{
				oddCount++;
			}
			else
			{
				evenCount++;
			}
		}
		System.out.println("There are "+evenCount+" even Numbers\n"+oddCount+" Odd Number"
				+"\n"+zeros+" Zero");
	}

}
