import java.io.*;

class Program7{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                int num = row;
		for(int i = 1 ; i <= row ; i++){
			int ch = 64 + i;
                        for(int j = 1 ; j <= row ; j++){
                                if(row % 2 == 0){
					if(j % 2 != 0){
						System.out.print(num + "\t");
					}
					else{
						System.out.print((char)ch + "\t");
					}
				}
                                else{
					if((i + j) % 2 == 0){
						System.out.print((char)ch + "\t");
					}
					else{
						System.out.print(num + "\t");
					}
                                }
                                num++;
                        }

                        System.out.println();
                }
        }
}
