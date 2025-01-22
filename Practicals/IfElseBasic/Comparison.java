class Comparison {
        public static void main(String[] s) {
                int num = 10;
                if((num%2==0) && (num==10))
                        System.out.println(num+" is an Even and Equal to 10");
                else if((num%2!=0) && (num==10))
                        System.out.println(num+" is an Odd and Equal to 10");
                else if((num%2==0) && (num<10))
                        System.out.println(num+" is an Even and less than 10");
		else if((num%2==0) && (num>10))
                        System.out.println(num+" is an Even and greater than 10");
		else if((num%2!=0) && (num<10))
                        System.out.println(num+" is an Odd and less than 10");
                else if((num%2!=0) && (num>10))
                        System.out.println(num+" is an Odd and greater than 10");
		else 
			System.out.println("Invaid Input");
        }
}
