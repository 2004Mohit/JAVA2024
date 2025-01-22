import java.io.*;
class code6 { 
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int rev = 0;
		int rem = 0;
		while(num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		if(rev==temp)
			System.out.println(temp + " is a Palindrome Number." );
		else
			System.out.println(temp + " is not a Palindrome Number." );
	}
}
