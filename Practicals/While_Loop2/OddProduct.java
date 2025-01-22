class OddProduct {
	public static void main(String[] s) {
		int num = 256985;
		int mul = 1;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			if(rem%2!=0)
				mul = mul * rem;
		}
		System.out.println("Product of Odd Digits : "+mul);
	}
}
