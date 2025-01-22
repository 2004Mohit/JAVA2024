class Career {
        public static void main(String[] s) {
                float per = 60f;
		if(per<=75 && per>=65)
                        System.out.println("Pharmacy or Bachelor in Science");
                else if(per<=85 && per>75)
                        System.out.println("Engineering");
		else if(per > 85)
                        System.out.println("Medical");
		else 
			System.out.println("Not Eligible for Medical or Engineering or Pharmacy or Bachelor in Science");
        }
}
