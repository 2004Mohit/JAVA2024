class SkipVowels {
	public static void main(String[] s) {
		for(char ch = 65;ch<91;++ch){
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				continue;
			}
			System.out.println(ch);
		}
	}
}
