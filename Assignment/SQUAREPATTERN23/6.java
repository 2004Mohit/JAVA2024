import java.io.*;

class Program6{
    public static void main(String[] s)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Rows :");
        int row = Integer.parseInt(br.readLine());

        for(int i = 1 ; i <= row ; i++){
            int num = row * row;
            for(int j = 1 ; j <= row ; j++)
            {
                if(i % 2 != 0)
                {
                    System.out.print(num+"\t");
                    num--;
                }
                else{
                    if(j%2==1)
                    {
                        System.out.print(num+"\t");
                        num-=5;
                    }
                    else{
                        System.out.print(num+"\t");

                    }
                }
            }
            System.out.println();
	}
    }
}
