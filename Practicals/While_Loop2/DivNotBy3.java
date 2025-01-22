class DivNotBy3 {
	public static void main(String[] s) {
		int num = 2569185;
		System.out.print("Digits not Divisible by 3 : ");
		while(num>0) {
			int rem = num%10;
			num = num/10;
			if(rem%3!=0)
				System.out.print(rem+" ");
		}
		System.out.println();
	}
}
