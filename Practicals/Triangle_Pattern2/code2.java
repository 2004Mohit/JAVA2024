import java.io.*;
class code2 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Row : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = 1;i<=Row;i++) {
			char ch = 'a';
			for(int j = 1;j<=i;j++) {
				if(i%2==0){
					System.out.print("$ ");
				}else{
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
