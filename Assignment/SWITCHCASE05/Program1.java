class Program1
{
	public static void main(String[] args)
	{
		int num=28;
		/*if(num%2==0)
		{
			System.out.println(num+" is an even number");
		}
		else{
			System.out.println(num+" is an odd number");
		}*/
		int result=num%2;
		switch(result)
		{
			case 0:
				System.out.println(num+" is an even number");
				break;
			case 1:  
                                System.out.println(num+" is an odd number");
                                break;
			/*deafult:
				System.out.println("Enter Valid Number");
				break;*/
	}
	}

}
