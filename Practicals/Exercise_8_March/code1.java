import java.io.*;
class code1 { 
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int num1 = 1;
		System.out.print("Factors : ");
		while(num > 0) {
			if(temp%num1==0) {
				System.out.print(num1 + " ");
			}
			num1++;
			num--;
		}
		System.out.println();
	}
}
