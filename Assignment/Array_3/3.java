import java.io.*;

class Program3{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size of Array : ");
                int SIZE = Integer.parseInt(br.readLine());
                int arr[] = new int[SIZE];
		int count = 0;

                System.out.println("Enter Elements :");
                
		for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }
	
		System.out.print("Enter Element whose number of occurance is to be found :");
		int ele = Integer.parseInt(br.readLine());

                for(int i = 0 ; i < arr.length ; i++){
                        if(arr[i] == ele){
				count++;
			}
			
		}

		if(count>0){
			System.out.println("Number " + ele + " occured " + count + " times in an array");
		}
		else{
			System.out.println("Number " + ele + " is not found in array");
		}	
		
               
       }

}
