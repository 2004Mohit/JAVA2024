import java.util.*;

class Program5{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first Array  : ");
		int SIZE1 = sc.nextInt();
		int arr1[] = new int[SIZE1];

		System.out.println("Enter the elements of first Array");
		for(int i = 0 ; i< arr1.length ; i++){
			arr1[i]	= sc.nextInt();
			}
		
        System.out.println("Enter the size of second Array  : ");
		int SIZE2 = sc.nextInt();
		int arr2[] = new int[SIZE2];
		
        System.out.println("Enter the elements of second Array");
		for(int i = 0 ; i< arr2.length ; i++){
				arr2[i]	= sc.nextInt();
				}

	
		int arr3[] = new int[SIZE1+SIZE2];
		for(int i = 0 ; i< arr1.length ; i++){
			arr3[i] = arr1[i];
		}
		for(int i = 0 ; i< arr2.length ; i++){
			arr3[SIZE1 + i] = arr2[i];
		}

        System.out.println("Merged Array :");
		for(int i = 0 ; i< arr3.length ; i++){
			System.out.println(arr3[i]);
		}
	}
}
