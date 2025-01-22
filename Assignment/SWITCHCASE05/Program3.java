class Program3
{
        public static void main(String[] args)
        {
		String size="M";
		/*switch(size)
		{
			case "S":
				System.out.println("Small");
				break;
			case "XL":
				System.out.println("Extra Large");
				break;
			case "XXL":
				System.out.println("Double Extra Large");
                                break;
			case "XXXL":
				System.out.println("Triple Extra Large");
                                break;
			case "XS":
				System.out.println("Extra Small");
                                break;
			case "M":
				System.out.println("Medium");
                                break;
			default:
				System.out.println("Invalid Input");

		}*/
		if(size=="S")
		{
			System.out.println("Small");
		}
		else if(size=="XL")
		{
			System.out.println("Extra Large");
		}
		else if(size=="XXL")
		{
			System.out.println("Double Extra Large");
		}
		else if(size=="XXXL")
                {
                        System.out.println("Triple Extra Large");
                }
		else if(size=="M")
		{
			System.out.println("Medium");
		}
		else if(size=="XS")
		{
			System.out.println("Extra Small");
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}
}
