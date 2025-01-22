import java.io.*;
class LectureCode {

        public static void main(String[] s) throws IOException {

               	File fObj = new File("/home/mohit/JAVA2024/DailyCodes/FileHandling");

		String files[] = fObj.list();
	       	
	       	System.out.println("Files Count : " + files.length);
        }
}
