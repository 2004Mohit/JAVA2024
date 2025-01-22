import java.util.*;

class Program8{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size : ");
                int SIZE = sc.nextInt();
                char arr[] = new char[SIZE];
                
                System.out.println("Enter Elements : ");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = sc.next().charAt(0);
                }
		
		System.out.println("Before Reverse :");
                for(int i = 0 ; i < arr.length ; i+=2){
                     System.out.print(arr[i]);
		} 
               

		for(int i = 0 ; i < (arr.length / 2) ; i++){
			arr[i] = arr[SIZE - i -1];
        	}

		System.out.println();
		System.out.println("After Reverse :");
                for(int i = 0 ; i < arr.length ; i+=2){
                     System.out.print(arr[i]);
                }
	}
}
