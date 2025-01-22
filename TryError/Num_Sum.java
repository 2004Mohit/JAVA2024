class Num_Sum {

	public static void main(String[] args) {
	
		int sum = 0;
		int num = 576;
		while(num > 0){
			sum += (num%10);
			num /= 10;
		}
		System.out.println("Sum of 576 : "+sum);
	}
}
