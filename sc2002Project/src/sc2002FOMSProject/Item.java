package sc2002FOMSProject;

public class Item {
	private String name;
	private float price;
	private int stock;
	private boolean inMenu;
	private String category;
	private String description;
	
	public Item(String name, float price, int stock, boolean inMenu, String category, String description) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.inMenu = inMenu;
		this.category = category;
		this.description = description;
	}
	
	public String getName(){            
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public float getPrice(){
		return this.price;
	}
	
	public void setPrice(float Price, float price){
		this.price = price;
	}
	
	public int getStock(){
		return this.stock;
	}
	
	public void setStock(int Stock, int stock){
		this.stock = stock;
	}
	
	public boolean isInMenu() {
        return this.inMenu;
    }

    public void setInMenu(boolean inMenu) {
        this.inMenu = inMenu;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
	
}
