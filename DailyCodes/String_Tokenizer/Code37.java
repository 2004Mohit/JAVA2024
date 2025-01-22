import java.util.*;

class Code37{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name: ");
		String name = sc.next();

		System.out.println("Enter Your Society Name: ");
		String socName = sc.next();

		System.out.println("Enter Wing: ");
            	char wing = sc.next().charAt(0);

		System.out.println("Enter Your Flatno: ");
                String flatNo = sc.next();
		
		System.out.println("Name : " + name);
		System.out.println("Society Name : " + socName);
		System.out.println("Wing : " + wing);
		System.out.println("flatNo : " + flatNo);
	}
}
