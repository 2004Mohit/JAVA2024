class Triplet {
	public static void main(String[] s) {
		int a = 2;
		int b = 2;
		int c = 2;
		if((a*a+b*b==c*c) || (c*c+a*a==b*b) || (a*a+c*c==b*b)) 
			System.out.println("It is a Pythagorean Triplet.");
		else 
			System.out.println("Not a Pythagorean Triplet.");
	}
}
