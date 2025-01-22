import java.io.*;
import java.util.*;

class Input1 {

	boolean ch = true, ch1 = true;
        char x;
        int choice = 0, count = 0;
        String in = null;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String> stringArr = new ArrayList<String>();
	//String arr[] = new String[5];

        public static void main(String[] s) {
		Input1 obj = new Input1();
		obj.inputCode();
        }

	void inputCode() {
		Input1 obj1 = new Input1();
		while(ch) {
                        try {
	                        System.out.println("=====================================");
                        	System.out.print("Input : ");
                        	in = br.readLine();

				//arr[count] = in;	
				//count++;
				stringArr.add(in);

                        	System.out.println("Output : "+in);
                        	System.out.println("=====================================");

                        	this.ch = obj1.choice();

                	}catch(IOException ioe) {
                        	System.out.println("Exception Occur");
                	}catch(NumberFormatException ne) {
                        	System.out.println("Please, Type Only in 0 or 1 Format !!");
                	}
                }
		System.out.print("\nYour Input Strings so far : ");
		System.out.println(stringArr+"\n");
		/*for(int i = 0; i < arr.length; i++) {
		
			if(i == 0) {
				System.out.print("[ "+arr[i]+" ");
			} else if(i == (arr.length - 1)) {
				System.out.print(arr[i]+" ]");
			} else {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();*/
	}

	boolean choice() throws IOException {
		System.out.println("You Want To Continue ? [0 - Yes/1-No]");
        	System.out.print("Your Choice : ");
        	choice = Integer.parseInt(br.readLine());

		if(choice == 0) {
         
                	ch1 = true;
                }else if(choice == 1) {
         
                	ch1 = false;
        	} else {
        		System.out.println();
                	System.out.println("!! Type Only in 0 or 1 Format !!");
                	System.out.println();
                	choice();
        	}
	return ch1;
	}
}
