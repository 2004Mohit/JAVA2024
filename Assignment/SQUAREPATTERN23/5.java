import java.util.*;
class Program5{
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows");
        int row = sc.nextInt();
        int num = row ;
        for(int i = 1 ; i<=row ; i++){
            for(int j = 1 ; j<=row ; j++){
                if((i % 2 == 1) && (j % 2 == 0)){   
                        System.out.print("$\t");
                        num++;
                    }
                    else{
                        System.out.print(num+"\t");
                        
                    }
              
            }
            System.out.println();
        }
    
    }
}


