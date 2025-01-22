import java.util.*;
class Array {

	static void findElement(int ele) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int position = 0;
		
		System.out.print("Array Size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Array Elements : ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(ele == arr[i]) {
				count++;
				position = i;
				break;
			}
		}

		if(count == 0)
			System.out.println(ele + " not Found");
		else
			System.out.println(ele + " Found " + position);
	}

	public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Element To Find : ");
		int ele = sc.nextInt();
		findElement(ele);
				
	}
}
