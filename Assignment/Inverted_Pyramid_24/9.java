import java.io.*;

class Program9{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rows :");
		int row = Integer.parseInt(br.readLine());
		for(int i = row ; i >= 1 ; i--){	
			for (int sp = 1 ; sp <= (row - i) ; sp++){
				System.out.print(" " + "\t");
			}

			for(int j = 1 ; j <= (2*i)-1 ; j++){
				if(j % 2 == 0){
					System.out.print("0\t");
				}
				else{
					System.out.print("1\t");
				}

			}
		System.out.println();
		}
	}
}
