class DigitsMul {
	public static void main(String[] s) {
		int num = 234;
		int mul = 1;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			mul = mul * rem;
		}
		System.out.println(mul);
	}
}
