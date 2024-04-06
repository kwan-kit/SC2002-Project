package sc2002FOMSProject;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectPaymentType 
{
	public static void selectPaymentType(ArrayList<String> paymentType)
	{
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		System.out.println("Payment by " + paymentType.get(choice-1));
	}
}
