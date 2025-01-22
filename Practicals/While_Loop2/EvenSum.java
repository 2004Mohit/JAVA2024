class EvenSum {
	public static void main(String[] s) {
		int num = 256985;
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			if(rem%2==0)
				sum = sum + rem;
		}
		System.out.println("Sum of Even Digits : "+sum);
	}
}
