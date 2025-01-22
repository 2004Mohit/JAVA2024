import java.io.*;

class Program5{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];
			
		System.out.println("Enter Elements : ");
                for(int i = 0 ; i < arr.length ; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		               
		for(int i = 0 ; i < (arr.length / 2); i++){
                        int temp = arr[i];
			arr[i] = arr[SIZE - i - 1];	
			arr[SIZE - i - 1] = temp;
		}
		
		System.out.println("Reversed Array :");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
			}

		}
}

