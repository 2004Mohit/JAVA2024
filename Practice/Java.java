import java.util.*;
class Input {

	public static void main(String[] s) {
		String in = null;

		Scanner sc = new Scanner(System.in);

		boolean ch = true;
		int choice = 0;
		while(ch) {
 			System.out.println("=====================================");
			System.out.print("Input : ");
			in = sc.nextLine();
			System.out.println("Output : "+in);
			System.out.println("=====================================");
			System.out.println("You Want To Continue ? [0 - Yes/1-No]");
			System.out.print("Your Choice : ");
			choice = sc.nextInt();
			if(choice == 0)
				ch = true;
			else 
				ch = false;
		}
	}
}
