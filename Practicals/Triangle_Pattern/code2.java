import java.io.*;
class code2 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Row : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = 1;i<=Row;i++) {
			for(int j = Row; j >= Row-i+1; j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
