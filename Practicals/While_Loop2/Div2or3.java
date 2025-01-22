class Div2or3 {
	public static void main(String[] s) {
		int num = 436780521;
		System.out.print("Digits Divisible by 2 or 3 : ");
		while(num>0) {
			int rem = num%10;
			num = num/10;
			if(rem%2==0 || rem%3==0)
				System.out.print(rem+" ");
		}
		System.out.println();
	}
}
