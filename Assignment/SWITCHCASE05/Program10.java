import java.util.Scanner;


class Program10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int balance = 0;
	while(true){
	System.out.println("********************************");
        System.out.println("Welcome to AXIS Bank ATM");
	System.out.println("Please select your transaction:");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Change PIN");
        System.out.println("5. Exit");
	System.out.println("********************************");
	//while(choice > 5);
    
        
	System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
	
	//int balance = 0;
	
	//while(choice > 5){
        switch(choice) {
            case 1:

		if(balance <= 0){
		System.out.println("Cannot Withdraw Money (LOW BALANCE)");
		}
		else{
                System.out.println("You selected: Withdraw Money");
                System.out.println("Type Amount to withdraw");
		int amt =  sc.nextInt();
		balance -= amt;
		System.out.println("Balance after withdrawl : " + balance);
		}
                break;


            case 2:
                System.out.println("You selected: Deposit Money");
                System.out.println("Type Amount to Deposit");
                int amtd =  sc.nextInt();
                balance += amtd;
		System.out.println("Balance after Depostion : " + balance);
                break;
            case 3:
		System.out.println("You selected: Check Balance");
                System.out.println(" Your Balance is "+ balance);
            	break;

            case 4:
                System.out.println("You selected: Change PIN");
                String pin = sc.next();
		System.out.println(" Type New Pin");
		System.out.println(" Pin changed Successfully");
                break;

            case 5:
                System.out.println("Exiting. Thank you for using Axis Bank ATM.");
                return;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
        
	}
	


	}
    }


    }
