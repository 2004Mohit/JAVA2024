import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rows : ");
		int row = sc.nextInt();
		int temp = row;

		for(int i = row; i > 0; i--) {
		
			int num1 = temp * 3;;
			int sub = 4;

			for(int j = row; j >= i; j--) {
			
				System.out.print(num1 + " ");
				num1 = num1 - sub;
				sub--;
			}
			System.out.println();
			temp--;
		}
	}
}	
