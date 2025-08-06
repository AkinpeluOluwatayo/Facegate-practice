def check():
	name= = input('what is your name?: ')
	item = input('what do you want to buy?: ')
	unit = int(input('How many per kg?: '))
	print('''
	Are you buying more items?
	1. Yes
	2. No 
			''')
match print:
	case 1:
		item2 = input('what else do you want to buy?: ')
		unit2 = int(input('How many per kg?: '))
		print('''
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
		break	
	
		case2:
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







