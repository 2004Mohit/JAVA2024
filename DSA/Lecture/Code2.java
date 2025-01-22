import java.util.*;
class Count {
	static int count(int start, int end) {
		int end1 = end + 1;
		int ans = end1 - start;
		
		return ans;
	}

	public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Starting Number : ");
		int start = sc.nextInt();
		System.out.print("Ending Number : ");
		int end = sc.nextInt();
		int ret = count(start,end);
		System.out.println("Count of Number between Start & End : " + ret);
	}
}
