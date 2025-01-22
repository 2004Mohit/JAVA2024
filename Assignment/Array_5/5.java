import java.util.*;

class Program5{
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
                        int cnt = 0;
			int temp = arr[i];
                        while(temp > 0){
				   	temp /= 10;
					cnt ++;
                        }
			System.out.print(cnt + ",");
                }
        }
}
