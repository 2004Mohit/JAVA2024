class Rev_Num {

	public static void main(String[] args) {
	
		int rev = 0;
		int rem = 0;
		int num = 1999;
		int temp = num;
		while(num > 0){
		
			rem = num % 10;
			rev = rev*10 + rem;
			num /= 10;
		}
		System.out.println("Rev of "+temp+" : "+rev);
	}
}
