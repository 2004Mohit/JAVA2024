class Consonant {
	public static void main(String[] s) {
		char ch = 'A';
		while(ch<='Z') {
			if( ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
				System.out.println(ch);
			ch++;
		}
	}
}
