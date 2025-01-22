import java.io.*;

class Program2{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];
		

		System.out.println("Enter Elements : ");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arr[0];
		int min = arr[0];
                for(int i = 0 ; i < arr.length ; i++){
                        if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}

		System.out.println("The Difference between the maximum and minimum element is : "+ (max - min));

		}
			
}

