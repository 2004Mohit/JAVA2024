import java.util.Scanner;
class code1 {
	public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows : ");
		int Row = sc.nextInt();
		int col = 0;
		for(int i = 1 ; i < Row * 2 ; i++) {
			if(i <= Row) {
				col = i;
			}else{
				col = (Row * 2) - i;
			}
			for(int j = 1 ; j <= col ; j++) {
				System.out.print("#\t");
			}
			System.out.println();
		}
	}
}
