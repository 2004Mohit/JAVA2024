import java.io.*;

class Program6{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                char arr[] = new char[SIZE];
               
                System.out.println("Enter Elements :");
                
		for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = br.readLine().charAt(0);
		}

                for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ){
			}
			else{
				System.out.print(arr[i]  + "\t");
			}

		}  
                System.out.println();
        }

}
