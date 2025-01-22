import java.io.*;
class code2 {
        public static void main(String[] s) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Number of Rows : ");
                int Row = Integer.parseInt(br.readLine());
		int num = 1;
		for(int i = 1 ; i <= Row ; i++) {
			for(int j = i ; j <= Row ; j++) {
				if(i==1) {
					System.out.print((num*2) + "  ");
					num++;
				}else{
					System.out.print((num*2) + " ");
					num++;
				}
			}
			System.out.println();
		}
	}
}
