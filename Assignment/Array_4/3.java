import java.io.*;

class Program3{
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
                for(int i = 0 ; i < arr.length ; i++){
                        if(arr[i] > max){
				max = arr[i];
			}
		}

		int max2 = arr[0];
                for(int i = 0 ; i < arr.length ; i++){
                        if((arr[i] < max)&& (max > arr[i])){
                                max2 = arr[i];
                        }
                }

		System.out.println("The second largest element in array is : "+ (max2));

		}
			
}

