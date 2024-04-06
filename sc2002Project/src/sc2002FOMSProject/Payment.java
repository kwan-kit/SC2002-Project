package sc2002FOMSProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintPaymentType printPaymentType = new PrintPaymentType();
		AddPaymentType addPaymentType = new AddPaymentType();
		SelectPaymentType selectPaymentType = new SelectPaymentType();
		ArrayList<String> paymentType = new ArrayList<String>();
		
		paymentType.add(0, "CreditCard");
		paymentType.add(1, "Cash");
		paymentType.add(2, "Online Payment");
		
		int choice = scan.nextInt();
		while (choice < 4)
		{
			if (choice == 1)
			{
				printPaymentType.printPaymentType(paymentType);
			}
			else if (choice == 2)
			{
				addPaymentType.addPaymentType(paymentType);
			}
			else if (choice == 3)
			{
				selectPaymentType.selectPaymentType(paymentType);
			}
			choice = scan.nextInt();
		}

	}

}
