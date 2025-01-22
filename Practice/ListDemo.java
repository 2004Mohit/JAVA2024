import java.util.*;

class ListDemo {

	public static void main(String[] args) {
	
		List<String> ls = new ArrayList();

		Scanner sc = new Scanner(System.in);

		/*ls.add("Sanket");
		ls.add("Ruchit");
		ls.add("Harsh");
		ls.add("Atharva");
		ls.add("Shravan");
		ls.add("Sonya");

		for(String names : ls) {

			System.out.println(ls);
		}*/

		for(int i = 0; i < 5; i++) {

			String nameAdd = sc.nextLine();
			ls.add(nameAdd);
		}
			
		System.out.println("==========================");
		
		ls.sort(Comparator.naturalOrder());

		for(String str : ls) {

			System.out.println(ls);
		}

		
	}
}
