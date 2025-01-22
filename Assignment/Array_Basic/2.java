import java.io.*;

class Program2{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Size of Array: ");
		int SIZE = Integer.parseInt(br.readLine());
		int arr[] = new int[SIZE];

		for(int i = 0 ; i < arr.length ; i++){
                
			System.out.print("Enter Element at index  " + i + " : ");
			int ele = Integer.parseInt(br.readLine());
                
			arr[i] = ele;
		}

		for(int i = 0 ; i < arr.length ; i++){ 			
			System.out.print(arr[i] + ",");                                                                                                                               }
	}
}
