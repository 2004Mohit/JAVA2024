import java.util.*;

class Program2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size : ");
		int SIZE = sc.nextInt();
		int arr[] = new int[SIZE];
		int evenSum = 0;
		int oddSum = 0;

		System.out.println("Enter Elements : ");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0 ; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				evenSum += arr[i];
			}
			else if(arr[i] % 2 == 1){
				oddSum += arr[i];
			}
		}
			System.out.println("Odd Sum = " + oddSum);
			System.out.println("Even Sum = " + evenSum);
	}
}
