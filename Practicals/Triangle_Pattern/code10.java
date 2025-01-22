import java.io.*;
class code10 {
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Row : ");
		int Row = Integer.parseInt(br.readLine());
		for(int i = 1;i<=Row;i++) {
			int ch = i + 64;
			for(int j = Row; j>=i; j--){
				if(Row%2==0) {
					if(ch%2==0){
                                        	System.out.print((char)ch + " ");
                                	}else{
                                        	System.out.print(ch + " ");
					}
				}else{
					if(ch%2==0){
                                        	System.out.print(ch + " ");
                                	}else{
                                        	System.out.print((char)ch + " ");
                                	}
                                }
				ch++;
			}
			System.out.println();
		}
	}
}
