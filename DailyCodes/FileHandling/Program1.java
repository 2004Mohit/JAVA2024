import java.io.*;
class Program1 {

        public static void main(String[] s) throws IOException {

                //Files
                File fobj1 = new File("file1.txt");
                fobj1.createNewFile();

                File fobj2 = new File("file2.txt");
                fobj2.createNewFile();

                File fobj3 = new File("file3.txt");
                fobj3.createNewFile();

                File fobj4 = new File("file4.txt");
                fobj4.createNewFile();

                File fobj5 = new File("file5.txt");
                fobj5.createNewFile();

                //Folders
                File fdir1 = new File("Folder1");
                fdir1.mkdir();

                File fdir2 = new File("Folder2");
                fdir2.mkdir();

                File fdir3 = new File("Folder3");
                fdir3.mkdir();

                File fdir4 = new File("Folder4");
                fdir4.mkdir();

                File fdir5 = new File("Folder5");
                fdir5.mkdir();
        }
}
