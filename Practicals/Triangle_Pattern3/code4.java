import java.io.*;
class code4 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number of Rows : ");
		int Row = Integer.parseInt(br.readLine());
		int ch ;
		if(Row%2==0) {
			ch = 65 + Row + Row + 1;
		}else{
			ch = 65 + Row + Row - 1;
		}
		for(int i = 1 ; i <= Row ; i++) {
			for(int j = i ; j <= Row ; j++) {
					System.out.print((char)ch + "  ");
					ch--;
			}
			System.out.println();
		}
	}
}
