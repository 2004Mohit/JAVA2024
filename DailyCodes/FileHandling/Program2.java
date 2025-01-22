import java.io.*;
class Program2 {

        public static void main(String[] s) throws IOException {

               	File fObj = new File("/home/mohit/JAVA2024/DailyCodes/FileHandling");

		String TotalCount[] = fObj.list();

		for(int i = 0; i < TotalCount.length; i++) {

			if(TotalCount[i].isFile()) {
	       			String count[] = TotaCount[i];
	       			System.out.println("Files Count : " + count.length);
	       		}else{
	       			String count[] = TotaCount[i];
	       			System.out.println("Folders Count : " + count.length);
	       		}
		}
        }
}
