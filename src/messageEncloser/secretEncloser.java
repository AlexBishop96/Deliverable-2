package messageEncloser;
import java.util.Scanner;
public class secretEncloser {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//Create a Scanner object for keyboard input.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name ");
		String str = input.nextLine().toUpperCase();
		String message = "";
		int checksum = 0;
		
		for(int i=0;i<str.length();++i) {
			
			message += ((int)str.charAt(i)-64)+"-";
			checksum += str.charAt(i)-64;
			
		}
		
		System.out.println("Your encoded message is " + message.substring(0,message.length()-1));
		System.out.println("Message checksum is " + checksum);
		input.close();
    }
}

