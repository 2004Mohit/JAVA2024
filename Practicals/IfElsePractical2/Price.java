class Price {
        public static void main(String[] s) {
                int Sell = 1000;
		int Cost = 1000;
                if(Sell>Cost)
                        System.out.println("Profit of "+(Sell-Cost));
                else if(Cost>Sell)
                        System.out.println("Loss of "+(Cost-Sell));
                else
                        System.out.println("No Profit No Loss");

        }
}
