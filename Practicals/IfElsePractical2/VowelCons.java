class VowelCons {
        public static void main(String[] s) {
                char ch = 'c';
                if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'||ch=='A' ||ch=='I' ||ch=='E' ||ch=='O' ||ch=='U')
                        System.out.println(ch + " is Vowel.");
                else if((ch>97 && ch<123) || (ch>65 && ch<91))
                        System.out.println(ch+" is consonant.");
		else 
			System.out.println("Invalid Input.");
        }
}
