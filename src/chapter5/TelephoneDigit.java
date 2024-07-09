package chapter5;
import javax.swing.JOptionPane;
public class TelephoneDigit {

	public static void main(String[] args)
	{
		String input,output;
		char letter;
				do
		{
			input = javax.swing.JOptionPane.showInputDialog("Program to convert uppercase"
					+ "letters to their corresponding telephone digit.\nTo stop the"
					+ "program enter #\nEnter a letter");
				letter = input.charAt(0);
				letter = Character.toUpperCase(letter);
				output = "The letter you entered is : "+letter+"\nThe corresponding telephone Number is : ";
				if(letter>='A'&&letter<='Z')
				{
				switch(letter)
				{
				case 'A':
				case 'B':
				case 'C':
					output = output+"2";
					break;
				case 'D':
				case 'E':
				case 'F':
					output = output+"3";
					break;	
				case 'G':
				case 'H':
				case 'I':
					output = output+"4";
					break;	
				case 'J':
				case 'K':
				case 'L':
					output = output+"5";
					break;
				case 'M':
				case 'N':
				case 'O':
					output = output+"5";
					break;	
				case 'P':
				case 'Q':
				case 'R':
				case 'S':	
					output = output+"5";
					break;
				case 'T':
				case 'U':
				case 'V':
					output = output+"6";
					break;		
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':	
					output = output+"7";
					break;		
				}
				JOptionPane.showMessageDialog(null, output,"Telephone Digit",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					if(letter=='#')
					{
						JOptionPane.showMessageDialog(null, "Exiting the program","Exit",JOptionPane.OK_CANCEL_OPTION);
					}
					else
					{
					JOptionPane.showMessageDialog(null, "Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
					}
					}
		}while(letter!='#');
		
	}

}

