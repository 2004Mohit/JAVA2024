import java.io.*;
class code20{
        public static void main(String[] args)throws IOException{
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        String name= br.readLine();
        System.out.println("NAME= " +name);
        br.close();
        String company=br.readLine();
        System.out.println("COMAPNY NAME = " + company);
        }
}
