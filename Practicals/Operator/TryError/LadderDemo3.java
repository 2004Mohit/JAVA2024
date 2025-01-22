class LadderDemo3 {
        public static void main(String[] s) {
                int x = 70;
		char ch = 70;
		float fl = 70;
                if(ch==fl) {
                        System.out.println(ch+" and "+fl+" are Equal");
                }

		if(ch==x) {
                        System.out.println(ch+" and "+x+" are Equal");
		}

		if(ch==x && ch==fl) {
                        System.out.println("All are Equal");
		}
        }
}
