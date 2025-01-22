import java.io.*;

class Program5{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rows :");
		int row = Integer.parseInt(br.readLine());
		int ch = 65 ;
		for(int i = row ; i >= 1 ; i--){
			for (int sp = 1 ; sp <= (row - i) ; sp++){
				System.out.print(" " + "\t");
			}

			for(int j = 1 ; j <= (2*i)-1 ; j++){
				System.out.print((char)ch + "\t");
			}
		ch++;
		System.out.println();
		}
	}
}
