class Program1{
	public static void main(String[] args){
		long num = 2569185L;
		while(num>0){
			long rem = num % 10;
			num /= 10;
			if(rem % 2 == 0){
				System.out.print(rem + "  ");
			}
		}
	}
}

