import java.util.*;

class Program1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size : ");
		int SIZE = sc.nextInt();
		int arr[] = new int[SIZE];
		int flag = 0;

		System.out.println("Enter Elements : ");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0 ; i <= (SIZE / 2) ; i++){
			if(arr[i] < arr[i+1]){
				flag = 1;
			}
			else{
				flag = 0;
			}
		}

		if(flag == 1){
			System.out.println("The given array is in ascending order");
		}
		else{
			System.out.println("The given array is not in ascending order");
		}
		
	}
}
