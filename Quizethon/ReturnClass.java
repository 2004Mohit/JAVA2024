class ReturnClass {

	ReturnClass getClass() {
	
		return new ReturnClass();
	}

	public static void main(String[] s) {
	
		ReturnClass flo = new ReturnClass();

		System.out.println(flo.getClass());
	}
}
