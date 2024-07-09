package chapter5;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int i=1;
		int number,sum=0,count=0;
		/* you have to set total limit of numbers must be 
		entered to reach a desired output*/
		System.out.print("Enter the limit of Numbers : ");
		int limit = scanner.nextInt();
		while(i<=limit)
		{
			System.out.print("Enter number " + i +" : ");
			number = scanner.nextInt();
			i++;
			sum+=number;
			count++;
		}
		int average = (sum/count);
		System.out.println("Sum of numbers entered is : "+sum);
		System.out.println("Total count is : "+count);
			System.out.println("Average of numbers entered is "+average+"."+sum%count);	
	}

}
