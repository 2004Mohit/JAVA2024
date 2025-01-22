class EvenOddCount {
	public static void main(String[] s) {		
		int num = 214367689;
		int rem = 0;
		int count1 = 0;
		int count2 = 0;
		while(num>0) {
			rem = num%10;
			num = num /10;
			if(rem%2==0)
				count1++;
			else
				count2++;
		}
		System.out.println("Odd Count : "+count2);
		System.out.println("Even Count : "+count1);
	}
}
