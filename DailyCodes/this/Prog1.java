//Using this for calling m2 in m1 by main obj


class Prog1 {

	void m2() {
	
		System.out.println("In m2() by m1()");
		
		System.out.println("this in m2() : "+this);
	}

	void m1() {
	
		System.out.println("In m1()");
		
		System.out.println("this in m1() : "+this);

		this.m2();
	}

	public static void main(String[] s) {
	
		Prog1 obj = new Prog1();

		System.out.println("In main()");

		//System.out.println("this in main : "+this);
		
		obj.m1();
	}
}
