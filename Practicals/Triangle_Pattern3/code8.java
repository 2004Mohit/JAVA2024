import java.io.*;
class code8 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number of Rows : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = Row ; i >= 1 ; i--) {
				int ch = 64 + i;
			for(int j = i ; j >= 1 ; j--) {
				if(Row%2!=0) {
					if(i%2==0)
						System.out.print((char)ch-- + "  ");
					else
						System.out.print(j + "  ");
				}else{
					if(i%2==0)
						System.out.print(j + "  ");
					else
						System.out.print((char)ch-- + "  ");
				}
			}
			System.out.println();
		}
	}
}
