public class ArrayDemo {

	public static void main(String[] args) {
	
		String name = "Roshan";

		String[] names = {"Sanket","Harsh","Atharva","Shravan"};

		for(String str : names) {
		
			System.out.println(str);
		}

		names[3] = null;

		System.out.println(names[3]);
	}
}
