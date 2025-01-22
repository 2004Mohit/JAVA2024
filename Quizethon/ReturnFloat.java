class ReturnFloat {

	Float getFloat() {
	
		return 20.5f;
	}

	public static void main(String[] s) {
	
		ReturnFloat flo = new ReturnFloat();

		float val = flo.getFloat();

		System.out.println(val);
	}
}
