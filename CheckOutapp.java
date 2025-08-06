import java.util.Scanner;
public class CheckOutapp {
	public static void main(String[] args) {

addName();
addItems();
}

    public static void addName(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("What is your name: ");
     String name = scanner.nextLine();
      
}

    public static void addItems(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("What do you want to buy?: ");
    String item = scanner.nextLine();

    System.out.print("How much per kg: ");
    int unit = scanner.nextInt();

    System.out.println("""
	Are you buying more items?
	1. Yes
	2. No 
			""");
	int more = scanner.nextInt();

switch(more){
case 1: 	
       System.out.println("What else do you want to purchse: ");

	String order = scanner.nextLine();


	 System.out.println("How much per kg: ");
    	int unit2 = scanner.nextInt();

	

	System.out.print("""

	RECIEPT
	STORE NAME: ELROI FARMS ENTERPRISE
	LOCATION: NO 11, ISAAC ADENUGA STREET AGILITY ESTATE,
		  MILE 12, LAGOS.
	TELEPHONE: 08110923670,08104883602.
	GMAIL: Elroifarmsenterprise@gmail.com
	DATE: 10 / AUG / 2025 TIME: 8:00 AM.
	CASHIER : CASHIER 4
	CUSTOMER NAME: AKINYEMI AYOMIDE BLESSING.
	TOTAL PRICE: $150.00
						""");
break;
case 2:
	System.out.print("""

	RECIEPT
	STORE NAME: ELROI FARMS ENTERPRISE
	LOCATION: NO 11, ISAAC ADENUGA STREET AGILITY ESTATE,
		  MILE 12, LAGOS.
	TELEPHONE: 08110923670,08104883602.
	GMAIL: Elroifarmsenterprise@gmail.com
	DATE: 10 / AUG / 2025 TIME: 8:00 AM.
	CASHIER : CASHIER 4
	CUSTOMER NAME: AKINYEMI AYOMIDE BLESSING.
	TOTAL PRICE: $100.00
						""");
   
 




}


}
     

















}