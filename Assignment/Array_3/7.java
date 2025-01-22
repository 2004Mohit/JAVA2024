import java.io.*;

class Program7{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];

                System.out.println("Enter Elements :");

                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }

                System.out.println("Output:" + "\t");
		for(int i = 0 ; i < arr.length ; i++){
			if((SIZE % 2 == 1) && (SIZE >= 5) ){
			if(arr[i] % 2 == 1){
				System.out.print(arr[i]+ "\t");			 
				 }
			}
                        else if(arr[i] % 2 ==0){
                                System.out.print(arr[i] + "\t");
                        }
		}		
                System.out.println();
		}
}
	





