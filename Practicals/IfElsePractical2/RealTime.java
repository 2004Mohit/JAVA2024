class RealTime {
	public static void main(String[] s) {
		double unit = 25f;
		if(unit>=1 && unit<=100)
			System.out.println("Charges : Rs 2 per unit");
		else if(unit>100 && unit<=1000)
                        System.out.println("Charges : Rs 7 per unit");
		else if(unit>1000)
                        System.out.println("Charges : Rs 12 per unit");
		else
                        System.out.println("Invalid Input");
	}
}
