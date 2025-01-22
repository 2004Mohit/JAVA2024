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

                int max = arr[0];
                for(int i = 0 ; i < arr.length ; i++){
                        if(arr[i] > max){
                                max = arr[i];
                        }
                }

                int max2 = 0;
                for(int i = 0 ; i < arr.length ; i++){
                        if((max2 < arr[i]) && (arr[i] < max)  )  {
                                max2 = arr[i];
                        }

                }

                int max3 = 0;
                for(int i = 0 ; i < arr.length ; i++){
                        if((max3 < arr[i]) && (arr[i] < max2) )  {
                                max3 = arr[i];
                        }

                }
            System.out.println("Third Largest Element is : "+ max3);
}

}
