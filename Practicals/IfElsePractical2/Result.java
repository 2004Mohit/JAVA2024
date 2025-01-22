class Result {
	public static void main(String[] s) {
		float per = 54f;
		if(per>=75 && per<=100)
			System.out.println("Passed : First Class with Distinction");
		else if(per>=60 && per<75)
			System.out.println("Passed : First Class");
		else if(per>=54 && per<60)
			System.out.println("Passed : Second Class");
		else if(per<47)
			System.out.println("Fail");
		else
			System.out.println("Invalid Input");
	}
}
