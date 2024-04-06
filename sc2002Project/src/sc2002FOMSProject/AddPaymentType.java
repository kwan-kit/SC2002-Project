package sc2002FOMSProject;

import java.util.ArrayList;
import java.util.Scanner;

public class AddPaymentType 
{
	public static void addPaymentType(ArrayList<String> paymentType)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Key in the new payment method");
		String length = scan.nextLine();
		paymentType.add(length);
	}
}
