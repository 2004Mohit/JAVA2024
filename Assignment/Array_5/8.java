import java.util.*;

class Program8{
public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size : ");
                int SIZE = sc.nextInt();
                int arr[] = new int[SIZE];

                System.out.println("Enter Elements : ");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = sc.nextInt();
                }
		
		int min = arr[0];
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}

		int min2;
		if(min == arr[0]){
			 min2 = arr[1];
		}
		else{
			min2 = arr[0];
		}
	

		for(int i = 0 ; i < arr.length ; i++){
			if((min2 > arr[i]) && (arr[i] > min))  {
				min2 = arr[i];
			}
		
		}

		System.out.println("The Second Smallest element in array is : " + min2);
        }
}
