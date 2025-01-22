class OddPrint {
	public static void main(String[] s) {		
		int num = 216985;
		int rem = 0;
		while(num>0) {
			rem = num%10;
			num = num /10;
			if(rem%2!=0)
			System.out.print(rem+" ");
		}
		System.out.println();
	}
}
