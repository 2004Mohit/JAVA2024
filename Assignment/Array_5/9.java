import java.util.*;

class Program9{
public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Number : ");
                int num = sc.nextInt();
		int temp = num;
		int cnt = 0;
		int rem = 0;
		int rev = 0;
		while(temp > 0){
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
			cnt++;
		}
		//System.out.println("cnt :"+cnt);
                
		int arr[] = new int[cnt];
		
		int i = 0 ;
		int rem1 = 0;
		while(rev > 0){
			rem1 = rev % 10;
			arr[i] = rem1 + 1;
			rev /= 10;
			i++;	
		}
		
		for(int j = 0 ; j < cnt ; j++){
			System.out.println(arr[j]);
		}
        }
}
