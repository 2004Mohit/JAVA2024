import java.util.*;

class Program6{
    public static void main(String []s){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        
        System.out.println("Fibbonacci Series :");
        System.out.print(a + " " + b);
        for(int i = 2 ; i < num ; i++){
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
