import java.io.*;
class code2 { 
	public static void main(String[] s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int count = 0;
		while(temp > 0) {
			if(num%temp==0) {
				count++;
			}
			temp--;
		}
		if(count==2)
			System.out.println(num + " is Prime Number.");
		else
			System.out.println(num + " is not a Prime Number.");
	}
}
