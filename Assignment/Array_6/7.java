import java.util.*;

class Program7{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size : ");
                int SIZE = sc.nextInt();
                int arr[] = new int[SIZE];
                
                System.out.println("Enter Elements : ");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = sc.nextInt();
                }
		

                for(int i = 0 ; i < arr.length ; i++){
                      	
			if(arr[i] > 65 && arr[i] < 97){
				 System.out.print((char)arr[i] + "\t") ;
       		 	}
			else{
				System.out.print(arr[i] + "\t");
			}
		} 
          
        	}
	
}
