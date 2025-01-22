class NumSum {
	public static void main(String[] s) {
		long num = 9307922405L;
		long rem = 0L;
		long sum = 0;
		while(num>0){
			rem = num%10;
			num/=10;
			sum = sum + rem;
		}
		System.out.println("Sum of Digits in 9307922405 is : "+sum);
	}
}
