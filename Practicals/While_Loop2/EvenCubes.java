class EvenCubes {
	public static void main(String[] s) {
		int num = 216985;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			if(rem%2==0) {
				int mul = rem * rem * rem;
				System.out.print(mul+" ");
			}
		}
		System.out.println();
	}
}
