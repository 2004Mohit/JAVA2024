import java.util.Scanner;
class optfactors {
	static void factors(int num) {
		int count = 0;
		int itr = 0;
		for(int i = 1; i <= num/2; i++) {
			if(num % i == 0)
				count++;
		itr++;
		}

		System.out.println(count+1);
		System.out.println(itr);
	}
	public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		factors(num);
	}
}
