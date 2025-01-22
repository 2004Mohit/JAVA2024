class OddSumEvenPro {
	public static void main(String[] s) {
		int num = 9367924;
		int mul = 1;
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			if(rem%2==0) {
				mul = mul * rem;
			}else{
				sum = sum + rem;
			}
		}
		System.out.println("Product of Even Digits : "+mul);
		System.out.println("Sum of Odd Digits : "+sum);
	}
}
