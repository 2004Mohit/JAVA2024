import java.util.*;

class Program3{
        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array  : ");
        int SIZE = sc.nextInt();
        int arr[] = new int[SIZE];
        int cnt =0;
	int cnt1 = 0;
        
	System.out.println("Enter Elements :");
        for(int i = 0 ; i< arr.length ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key :");
        int key = sc.nextInt();

        for(int i = 0 ; i< arr.length ;i++){
            if(arr[i] == key)
            {
                cnt++;
            }
        }


    System.out.println("Array After Operation :");
    for(int i = 0 ; i< arr.length ;i++){
        if((cnt > 2) && (arr[i] == key) ){
            arr[i] = key*key*key;
	    cnt1++;
        }
}

    for(int i = 0 ; i< arr.length ;i++){
	    if(cnt1 != 0){
	    	System.out.println(arr[i]);
	    }
	    else{
		    System.out.println("element not found ");
	    		break;
	    }
       }
	
    }
}

