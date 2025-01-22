import java.util.*;

class Program9{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size : ");
                int SIZE = sc.nextInt();
                int arr[] = new int[SIZE];
                
                System.out.println("Enter Elements : ");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = sc.nextInt();
                }
		
		int cnt = 0 ;
		for(int j = 0; j < arr.length ; j++){
	       	int rem = 0;	
               	int rev = 0;
		int temp = arr[j];
			while(temp > 0){
				rem = temp % 10;
				rev = rev * 10 + rem;
				temp /= 10;
			
			}
		
			if( (arr[j] == rev) || (temp > 10)){
				cnt++;	
			}
		}

		System.out.println("Count of Palindrome Elements :" + cnt);
        	}
	}

