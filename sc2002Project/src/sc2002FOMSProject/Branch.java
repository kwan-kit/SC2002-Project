package sc2002FOMSProject;

import java.util.ArrayList;
public class Branch {
    //attributes
    public Menu menu;
    private String name;
    private String location;
    private final int staffQuota;
    private Staff[staffQuota] staffList;
    private int noOfStaff;
    private Manager[3] managerList;
    private int noOfManagers;
    private boolean isOpen;
    private ArrayList<Order> allOrders;
    //constructors
    public Branch(Menu menu, String name, String location, int staffQuota, int noOfStaff, int noOfManagers, boolean isOpen, ArrayList<Order> allOrders){
        //parameter for ArrayList<Order> liveOrders not implemented
        this.menu = menu;
        this.name = name;
        this.location = location;
        this.staffQuota = staffQuota;
        this.noOfStaff = noOfStaff;
        this.noOfManagers = noOfManagers;
        this.isOpen = isOpen;
    }
    //methods
    public void printLiveOrders(){
        int size = liveOrders.size();
        for(int i = 0; i < size; i++){
            Order order = liveOrders.get(i);
            if(order.ifComplete() != 1){
                order.printOrder();
            }
        }
    }
    public void openBranch(){
        isOpen = true;
    }
    public void closeBranch(){
        isOpen = false;
    }
}
