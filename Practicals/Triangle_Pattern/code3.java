import java.io.*;
class code3 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Row : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = 1;i<=Row;i++) {
			int ch = i + 64;
			for(int j = 1; j<=i; j++){
				System.out.print((char)ch++ + " ");
			}
			System.out.println();
		}
	}
}
