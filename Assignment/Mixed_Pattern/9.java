import java.io.*;

class Program9{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
                for(int i = row ; i >= 1 ; i--){
                	//int num = 1;
			int ch = 64 + i;
			for(int j = 1 ; j <= i ; j++){
			        if(row % 2 == 0){
					if(i % 2 != 0){	
					 	System.out.print((char)(ch) + " ");
						ch--;
					}
					else{
						System.out.print(j + " ");
						
					}
				}
				else{
					if(i % 2 != 0){
                                                System.out.print(j + " ");
                                        }
                                        else{
                                                System.out.print((char)(ch) + " ");
                                                ch--;
                                        }
                                }
                        }
			
                        System.out.println();

        }
        }
}
