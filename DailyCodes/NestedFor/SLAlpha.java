class SLAlpha {
        public static void main(String[] args) {
                char lr='a';
                char ch='A';
                for(int i=1;i<=3;i++) {
                        for(int j=1;j<=3;j++) {
                                if(i%2==0) {
                                        System.out.print(ch++ + " ");
                                }else{
                                        System.out.print(lr++ + " ");
                                }
                        }
			System.out.println();
                }
        }
}
