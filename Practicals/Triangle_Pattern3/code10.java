import java.io.*;
class code10 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number of Rows : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = Row ; i >= 1 ; i--) {
				int ch = 96 + i;
				int ch1 = 64 + i;
			for(int j = 1 ; j <= i ; j++) {
				if(i%2==0) {
					System.out.print((char)ch1-- + "  ");
				}else{
					System.out.print((char)ch-- + "  ");
				}
			}
			System.out.println();
		}
	}
}
