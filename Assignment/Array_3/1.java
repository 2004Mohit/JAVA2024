import java.io.*;

class Program1{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];
                
                System.out.println("Enter Elements :");
                
		for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }

		for(int i = 0 ; i < arr.length ; i++){
                        arr[i] += 15; 
                        System.out.print(arr[i] + "\t");
		}  
                System.out.println();
        }

}
