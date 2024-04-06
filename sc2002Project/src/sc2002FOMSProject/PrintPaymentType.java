package sc2002FOMSProject;

import java.util.ArrayList;

public class PrintPaymentType 
{
	public void printPaymentType(ArrayList<String> paymentType)
	{
		for (int i = 0; i<paymentType.size();i++)
		{
			System.out.println((i+1) + ". Payment by " + paymentType.get(i));
		}
	}
}
