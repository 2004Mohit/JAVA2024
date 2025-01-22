import java.util.*;

class Program4{
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
                        for(int j = i+1 ; j < arr.length ; j++)
                        if(arr[i] == arr[j]){
				System.out.println("First Duplicate element present at index " + i);
                               	break;
                        }
			//break;
                }
        }
}
