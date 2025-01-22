import java.util.*;

class Program10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size : ");
		int SIZE = sc.nextInt();
		int arr[] = new int[SIZE];

		System.out.println("Enter Elements : ");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0 ; i < arr.length; i++){
			int temp = arr[i];
			int fact = 1;
			while(temp > 0){
				fact *= temp;
				temp--;
			}
		
			System.out.print(fact +",");
			//System.out.println("Even Sum = " + evenSum);
	}
	}
}
