import java.util.Scanner;
class Prog2 {
        public static void main(String[] s) {
                Scanner sc = new Scanner(System.in);
		System.out.print("Input1 : ");
		String Input1 = sc.nextLine();
		System.out.print("Input2 : ");
		String Input2 = sc.nextLine();
		String str = Input1.concat(Input2);
		System.out.println(str);
		System.out.println("Count of "+str+" : "+str.length());
	}
}
