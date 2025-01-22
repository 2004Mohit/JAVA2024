class Div2 {
	public static void main(String[] s) {
		int num = 2569185;
		int rem = 0;
		System.out.print("Digits Divisible by 2 : ");
		while(num>0) {
			rem = num%10;
			num = num/10;
			if(rem%2==0)
				System.out.print(rem+" ");
		}
		System.out.println();
	}
}
