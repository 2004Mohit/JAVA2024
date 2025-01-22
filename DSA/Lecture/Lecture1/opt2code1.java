import java.util.Scanner;
class opt2factors {
	static void factors(int num) {
		int count = 0;
		int itr = 0;
		for(int i = 1; i*i <= num; i++) {
			if(num % i == 0) {
				if(i == num/i)
					count = count + 1;
				else
					count = count + 2;
		itr++;
			}
		}

		System.out.println(count);
		System.out.println(itr);
	}

	public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		factors(num);
	}
}
