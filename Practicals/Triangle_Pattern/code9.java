import java.io.*;
class code9 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Row : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = Row;i>=1;i--) {
			int ch = Row + 64;
			for(int j = 1; j<=i; j++){
				System.out.print((char)ch-- + " ");
			}	
			System.out.println();
		}
	}
}
