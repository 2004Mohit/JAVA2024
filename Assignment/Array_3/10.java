import java.io.*;

class Program10{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];
                int prod = 1;

		System.out.println("Enter Elements :");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = Integer.parseInt(br.readLine());
               		}	
		
		for(int i = 0 ; i < arr.length ; i++){
			int temp = arr[i];
			int num = arr[i];
			int cnt = 0;
			while(num > 0){
				if(temp %  num == 0){
					cnt++;
				}
				num--;
				
			}
			
			if(cnt == 2){
				prod *= arr[i];
			}
		}
		System.out.println("Product : " + prod);
		
	}
}
	

