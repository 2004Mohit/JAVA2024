import java.io.*;
class code6 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Row : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = Row;i>=1;i--) {
			for(int j = 1; j<=i; j++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
