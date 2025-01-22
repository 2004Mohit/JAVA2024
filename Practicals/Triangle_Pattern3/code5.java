import java.io.*;
class code5 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number of Rows : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= Row ; i++) {
				char ch = 'A';
				char ch1 = 'a';
			for(int j = i ; j <= Row ; j++) {
				if(i%2==0)
					System.out.print(ch1++ + "  ");
				else
					System.out.print(ch++ + "  ");
			}
			System.out.println();
		}
	}
}
