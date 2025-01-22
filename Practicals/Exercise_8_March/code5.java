import java.io.*;
class code5 { 
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int rem = 0;
		System.out.print("Reverse of " + temp + " is : ");
		while(num > 0) {
			rem = num % 10;
			num = num/10;
			System.out.print(rem);
		}
		System.out.println();
	}
}
