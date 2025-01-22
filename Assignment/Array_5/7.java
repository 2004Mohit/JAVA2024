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
	
		System.out.println("Composite numbers in the array are :");
                for(int i = 0 ; i < arr.length ; i++){
                        int cnt = 0;
			int num = arr[i];
			int temp = arr[i];
                        while(num > 0){
				if(temp % num == 0){	   
				cnt ++;
				}
			num--;
			}
			if(cnt != 2){
				System.out.print(arr[i] + ",");
			}
                }
        }
}
