package atmproject;
import java.util.*;
public class atm {

	public static void main(String[] args) {
		try{
          Scanner sc=new Scanner(System.in);
		  System.out.println("Hey Welcome to all in One Atm");
          System.out.println("Enter Your Pin Number");
		  int pin=sc.nextInt();
		  int balance=1000;
		  int amount=0; //for adding amount we use this,intial keeping it as zero.
		  int take_amount=0;
		  String name="Preethi";
		  // creating dummy value for the pin.
		  if(pin==1234)
		  {  
			System.out.println("Hello "+name);
			        System.out.println("Press 1 to check Balance");
					System.out.println("Press 2 to Add Amount");
					System.out.println("Press 3 to Withdraw Amount");
					System.out.println("Press 4 to print the reciept");
					System.out.println("Press 5 to Exit /Quit");
					System.out.println();
               while(true) //this while loop executes untill user wants to exit.
			   {
                    
				    System.out.println("Enter Your Choice");		
					int choice=sc.nextInt();
					switch(choice)
					{
                        case 1:
						  System.out.println("Your Balance is:"+balance);
						  break;
						case 2:
                           System.out.println("How much amount do you want to add");
						   amount=sc.nextInt();
						   balance=balance+amount; //adding amount to existing balance.
						   System.out.println("Successfully added your current balance is:"+balance);
						   break;
						case 3:
						System.out.println("How much amount do you want to withDraw ");
						take_amount=sc.nextInt();
						if(take_amount>balance)
						{
							System.out.println("Insufficient Balance");
						}
						else
						{
							balance=balance-take_amount;
							System.out.println("Your Current Balance Is: "+balance);
						}
						break;
						case 4:
						System.out.println("Thanks for Comming");
						System.out.println("Your current balance is:"+balance);
						System.out.println("Amount added: "+amount);
						System.out.println("Amount taken: "+take_amount);
						break;
					}
					if(choice==5)
					{
						break;
					}
			    }

		  }
		  else{
			System.out.println("Wrong Pin Number");
		  }
		}
		catch(Exception e){
              System.out.println(e);
		}
//      to connect java with database we require database jar file
	}

}
