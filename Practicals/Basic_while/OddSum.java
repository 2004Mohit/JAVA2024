class OddSum {
	public static void main(String[] s) {
		int sum = 0;
		int x = 150;
		while(x>=101) {
			if(x%2!=0)
				sum = sum + x;
			x--;
		}
		System.out.println(sum);
	}
}
