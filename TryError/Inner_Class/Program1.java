class Outer {
	int x = 10;
	Outer() {
		System.out.println("Outer Constructor");
	}
	class Inner {
		Inner() {
			System.out.println("Inner Constructor");
		}
	}
	public static void main(String[] s) {
		Outer outObj = new Outer();
		Inner obj = outObj.new Inner();
		System.out.println(outObj.x);
	}
}

