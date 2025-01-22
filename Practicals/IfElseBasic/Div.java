class Div {
        public static void main(String[] s) {
                int num = 10;
                if(num%3==0)
                        System.out.println(num+" is divisible by 3");
                else if(num%7==0)
                        System.out.println(num+" is divisible by 7");
                else if(num%3==0 && num%7==0)
			Sysem.out.println(num+" is Divisible by Both 3 & 7.");
		else
                        System.out.println(num+" is neither divisible by 3 nor 7");
        }
}
