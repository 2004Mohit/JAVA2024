import java.io.*;
class code1 {
        public static void main(String[] s) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Number of Rows : ");
                int Row = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= Row ; i++) {
			for(int j = i ; j <= Row ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
