package chapter5;
import java.util.Scanner;
public class WhileAsExit {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int end=-999; // declares stop condition of number
		int number,sum=0;
		// reading number
		System.out.print("Enter number : ");
		number = scanner.nextInt();
		/*end=-999 to exit the program and get output, we use while for it*/
		while(number!=end)
			// run the input until number is not equal to -999
		{
			sum+=number;
			System.out.print("Enter another number : ");
			number = scanner.nextInt();
		}
		System.out.println("Sum of numbers entered is : "+sum);
	}

}
