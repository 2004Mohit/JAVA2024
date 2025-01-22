import java.util.*;

class Program2{
       public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

               System.out.println("Enter number : ");
               int num = sc.nextInt();
               int temp = num;
               int fact = 1;
               int digit = 0;
               int sum = 0;
               if (num > 0) {
                       while (num > 0) {
                               digit = 0;
                               digit = num % 10;
                               fact = 1;
                               for (int i = 1; i <= digit; i++) {
                                       fact *= i;
                               }
                               num /= 10;
                               sum += fact;
                       }
                               if (sum == temp) {
                                       System.out.println(temp + " is a Strong Number");
                                       
                               } else {

                                       System.out.println(temp + " is not a Strong Number");
                                      
                               }
                       
               } else {
                       System.out.println("Enter Postive Integer");
               }

       }

}
