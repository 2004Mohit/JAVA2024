import java.util.Scanner;
class factor {
	public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int count = 0;
		int itr = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0)
				count++;
		itr++;
		}
		System.out.println(count);
		System.out.println(itr);
	}
}
