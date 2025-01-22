class MainPosReplace {

	static void main() {

		System.out.println("Hello");
	}
	
	protected void finalize() {
	
		System.out.println("Finalize Method");
	}

	public static void main(String[] s) {
	
		System.out.println("Hii");
		main();
	}

}
