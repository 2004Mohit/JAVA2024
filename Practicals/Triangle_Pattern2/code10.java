import java.io.*;
class code10 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Row : ");
		int Row = Integer.parseInt(br.readLine());
		char ch = 'a';
		int num = 1;
		for(int i = 1;i<=Row;i++) {
			for(int j = 1;j<=i;j++) {
				if(i%2==0){
					System.out.print(ch+" ");
				}else{
					System.out.print(num+" ");
				}
				ch++;
				num++;
			}
			System.out.println();
		}
	}
}
