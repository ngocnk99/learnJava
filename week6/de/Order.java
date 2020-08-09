package de;
import java.util.ArrayList;
public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public int qtyOrdered = 0;
	private  String dateOrdered;
    public static final int LIMITED_NUMBER_OREDERED = 5;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public static int nbOrder = 0;
    
    public Order() {
    	super();
    	nbOrder ++;	
    }
    
    public static int getnbOrder() {
    	return nbOrder;
    }
    
    public static void shownbOrder() {
    	System.out.print("nbOrder:" + nbOrder);
    }



	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addMedia(Media media)
	{
		if(this.qtyOrdered < MAX_NUMBER_ORDERED)
		{
			this.itemsOrdered.add(media);
			System.out.println("Added successfully");
			this.qtyOrdered += 1;
		}
		else
		{
			System.out.println("!! Reached max limitted orders");
		}
	}
	
	public void removeMedia(Media media)
	{
		this.itemsOrdered.remove(media);
		System.out.println("Deleted successfully");
		this.qtyOrdered -= 1;
	}
	
	public void removeMedia(int i)
	{
			this.itemsOrdered.remove(i);
			System.out.println("Deleted successfully");
			this.qtyOrdered -= 1;
	}
	
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < this.qtyOrdered; i++)
		{  	
			sum += itemsOrdered.get(i).getCost();
		}
		return sum;
	}
   
   public void showorder() {
	   System.out.print("----------------------------\n" );
	   for(int i = 0; i < this.qtyOrdered; i++)
		{  
		   int j = i+1;
		   System.out.print("STT:" +j +"\n" );
		   this.itemsOrdered.get(i).print();
		}
   }
		
  
	
	public void printListOrders()
	{
		System.out.println("*********************Order************************");
		System.out.println("Date: " + dateOrdered);
		System.out.println("Ordered Items: ");
		
		for(int i = 0; i < qtyOrdered; i++)
		{
			this.itemsOrdered.get(i).print();
		}
		
		System.out.println("Total cost: " + this.totalCost());
		
		
	}
	
	public Media getALuckyItem()
	{
		int lucky_number;
		
		do {
			double rand = Math.random();
			lucky_number = (int)rand;
		}while(lucky_number < 0 || lucky_number >= qtyOrdered);
		
		
		Media lucky_item =  this.itemsOrdered.get(lucky_number);
		this.removeMedia(lucky_item);
		
		return lucky_item;
	}
}
