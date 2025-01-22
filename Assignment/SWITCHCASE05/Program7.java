class Program7
{
        public static void main(String[] args)
        {
		int budget=1000;
		/*switch(budget)
		{
			case 15000:
				System.out.println("Trip Destination is Jammu and Kashmir");
				break;
			case 10000:
                                System.out.println("Trip Destination is Manali");
                                break;
			case 6000:
                                System.out.println("Trip Destination is Amritsar");
                                break;
			case 2000:
                                System.out.println("Trip Destination is Mahabaleshwar");
                                break;
			default:
                                System.out.println("Try Next Time");
                                break;
		}*/
		if(budget==15000)
		{
			System.out.println("Trip Destination is Jammu and Kashmir");
		}
		else if(budget==10000)
		{
			System.out.println("Trip Destination is Manali");
		}
		else if(budget==6000)
                {
                        System.out.println("Trip Destination is Amritsar");
                }
		else if(budget==2000)
                {
                        System.out.println("Trip Destination is Mahabaleshwar");
                }
		else
		{
			System.out.println("Try Next Time");
		}


	}
}
