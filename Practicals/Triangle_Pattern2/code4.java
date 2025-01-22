import java.io.*;
class code4 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Row : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = 1;i<=Row;i++) {
			int ch = Row + 64;
			int ch1 = Row + 96;
			for(int j = 1;j<=i;j++) {
				if(i%2==0){
					System.out.print((char)ch-- +" ");
				}else{
					System.out.print((char)ch1-- +" ");
				}
			}
			System.out.println();
		}
	}
}
