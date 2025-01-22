import java.util.*;

class Program6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size : ");
                int SIZE = sc.nextInt();
                int arr[] = new int[SIZE];
                
                System.out.println("Enter Elements : ");
                for(int i = 0 ; i < arr.length ; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Enter key value : ");
		int multiple = sc.nextInt();
		int cnt = 0;
                for(int i = 0 ; i < arr.length ; i++){
                       if(arr[i] % multiple == 0){             
			       System.out.println("An element multiple of " + multiple + " is found at index "+ i);
		       		cnt++;	
		       }

		       if(cnt == 0){
			       System.out.println("element not found ");
			       break;
		       }
		
		       }
		}
               
        }

