import java.io.*;
class code6 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number of Rows : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = Row ; i >= 1 ; i--) {
				char ch = 'a';
				int num = 1;
			for(int j = 1 ; j <= i ; j++) {
				if(j%2==0)
					System.out.print(ch++ + "  ");
				else
					System.out.print(num++ + "  ");
			}
			System.out.println();
		}
	}
}
