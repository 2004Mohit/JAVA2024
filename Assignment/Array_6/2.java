import java.util.*;

class Program2{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size : ");
                int SIZE = sc.nextInt();
                int arr[] = new int[SIZE];
                int sum = 0;
                int cnt = 0;
                
                System.out.println("Enter Elements : ");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = sc.nextInt();
                }

                for(int i = 0 ; i < arr.length ; i++){
                       int cnt1 = 0;
		       int temp = arr[i];
		       int num = arr[i];
			while(num > 0){
				if(temp % num == 0){
					cnt1++;
				}
			
			num--;
			}
		

                	if(cnt1 == 2){
				sum += temp;
                        	cnt++;
			}
		}
               System.out.println("Sum of all prime numbers is " + sum + " and count of prime numbers in given array is "+ cnt);
        }
}
