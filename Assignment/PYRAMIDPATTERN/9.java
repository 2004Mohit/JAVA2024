import java.io.*;

class Program9{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Rows : ");
                int row = Integer.parseInt(br.readLine());
               	for(int i =  1; i <= row ; i++){
                char ch1 = 'A';
                char ch2 = 'a';
                        for(int space =1; space <= (row-i) ; space++){
                                System.out.print(" " + "\t");
                        }
                        for(int j = 1 ; j <= (2*i)-1 ; j++){
                             if(i % 2 == 0){
			     	if(j < i){
                                        System.out.print(ch2+ "\t");
					ch2++;
                                }
                                else{
                                        System.out.print(ch2 + "\t");
					ch2--;
                                }
			     }
			    else{
				    if(j < i){
				        System.out.print(ch1+ "\t");
                                        ch1++;
                                }
                                else{
                                        System.out.print(ch1 + "\t");                                               
					ch1--;
                                }
			     }
                        
		}
                        System.out.println();
                }
        }
}
