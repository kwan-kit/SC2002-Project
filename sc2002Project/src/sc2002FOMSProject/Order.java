package sc2002FOMSProject;

import java.util.ArrayList;
public class Order {
	private int orderID;
	private boolean takeAway;
	private boolean confirmedOrder;
	private boolean ready;
	private boolean complete;
	
	ArrayList<Item> cart = new ArrayList<Item>();
	int size = cart.size();
	
	public void printOrder(int orderID) {
		System.out.println(orderID);
		if(takeAway) {
			System.out.println("Takeaway");
		}
		else {
			System.out.println("Dine in");
		}
		for(int i = 0; i<size; i++) {
			System.out.println(cart.get(i).getName());// +  " " + cart.get(i).getQuantity() + " " + cart.get(i).getTotalPrice());
			System.out.println(cart.get(i).getDescription() + " " + cart.get(i).getCategory());
		}
	}
	
	public boolean ifComplete() {
		return complete;
	}
	
	public void getOrderStatus() {
		printOrder(orderID);
		if(!complete) {
			if(ready) {
				System.out.println("Ready to pickup");
			}
			else
			{
				System.out.println("Preparing order");
			}
		}
		else{
			System.out.println("Order completed");	
			
		}
	}
	
}

