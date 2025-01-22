import java.io.*;
class code4 { 
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int fact = 1;
		while(num > 0) {
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial of "+temp+" is : "+fact);
	}
}
