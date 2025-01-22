import java.io.*;
class code9 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Row : ");
		int Row = Integer.parseInt(br.readLine());
		char ch = 'a';
		for(int i = 1;i<=Row;i++) {
			int num = Row + 1;
			for(int j = 1;j<=i;j++) {
				if(j%2==0){
					System.out.print(ch++ +" ");
				}else{
					System.out.print(num +" ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
