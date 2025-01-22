class OddSqSum {
	public static void main(String[] s) {
		int num = 2469185;
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			if(rem%2!=0) {
				int mul = rem * rem;
				sum = sum + mul;
			}
		}
		System.out.println(sum);
	}
}
