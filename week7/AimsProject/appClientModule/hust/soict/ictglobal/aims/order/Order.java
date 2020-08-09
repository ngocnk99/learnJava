package hust.soict.ictglobal.aims.order;
import java.util.ArrayList;
import hust.soict.ictglobal.aims.media.Media; 

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private int qtyOrdered;
	private String dateOrdered;
	public static final int MAX_LIMITTED_ORDERS = 5;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public static int nbOrders = 0;
	
	public void addMedia(Media media)
	{
		if(this.checkFull() == 0)
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
	
	public String getDateOrdered() {
		return dateOrdered;
	}

	public Order() {
		super();
		qtyOrdered = 0;
		Order.nbOrders += 1;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}


	public int getQtyOrdered() {
		return this.qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public int checkFull()
	{
		if(qtyOrdered == MAX_NUMBERS_ORDERED)
		{
			return 1;
		}
		
		return 0;
	}
	
	public float totalCost()
	{	
		float sum = 0;
		for(int i = 0; i < qtyOrdered; i++)
		{  	
			sum += itemsOrdered.get(i).getCost();
		}
		
		return sum;
	}
	

	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
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

