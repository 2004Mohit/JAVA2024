import java.util.*;

class Program4{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size of First Array: ");
                int SIZE1 = sc.nextInt();
                int arr1[] = new int[SIZE1];

                System.out.println("Enter Size of Second Array : ");
                int SIZE2 = sc.nextInt();
                int arr2[] = new int[SIZE2];
		
		System.out.println("Enter Elements First Array:: ");
                for(int i = 0 ; i < arr1.length ; i++){
                        arr1[i] = sc.nextInt();
                }

		System.out.println("Enter Elements Second Array:: ");
                for(int i = 0 ; i < arr2.length ; i++){
                        arr2[i] = sc.nextInt();
                }

		
		System.out.println("Common Elements in given Array are : ");
		for(int i = 0 ; i < arr1.length ; i++){
			for(int j = 0 ; j < arr2.length ; j++){
				if(arr1[i] == arr2[j]){
					System.out.print(arr1[i] + ",");
				}
			}
		}
	}
}
		 
