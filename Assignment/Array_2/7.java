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

		if(SIZE % 2 == 0){
			System.out.println("Array Elements are: ");
			for(int i = 0 ; i < arr.length ; i+=2){
				System.out.println(arr[i]);
			}
		}
		else{
			System.out.println("Array Elements are: ");
			 for(int i = 0 ; i < arr.length ; i++){
                                System.out.println(arr[i]);
                        }
		}
	}
}
