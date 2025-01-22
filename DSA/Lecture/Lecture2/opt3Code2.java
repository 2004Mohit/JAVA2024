import java.util.*;
class opt3Sqrt {
	static int sqrt(int num) {
		int val = 0;
		int itr = 0;
		int start = 0;
		int end = 0;
		while(start <= end) {
			itr++;
			int mid = (start+end)/2;
			int sqr = mid*mid;
			if(sqr == num) {
				System.out.println(itr);
				return mid;
			}
			if(sqr > num) {
				end = mid - 1;
			} else {
				val = mid;
				start = mid + 1;
			}
		}
		System.out.println(itr);
		return val;
	}

	public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int ret = sqrt(num);
		System.out.println(ret);
	}
}
