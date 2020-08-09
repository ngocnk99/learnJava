package de;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 3;
	public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	public int qtyOrdered = 0;
	private  String dateOrdered;
    public final int LIMITED_NUMBER_OREDERED = 5;
    private static int nbOrder = 0;
    
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
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc)
	{
		if(this.qtyOrdered >= MAX_NUMBER_ORDERED ) {
			System.out.print("The order is almost full/n");
			
		}
		else {
			this.itemsOrdered[this.qtyOrdered] = disc;
			this.qtyOrdered += 1;
			System.out.print("The disc has been added \n");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		int i;
		for ( i = 0; i < dvdList.length; i++) {
			if(this.qtyOrdered >= MAX_NUMBER_ORDERED ) {
				System.out.print("The order is almost full \n");
			}
			else {
				this.itemsOrdered[this.qtyOrdered] = dvdList[i];
				System.out.print("The disc has been added \n");
				this.qtyOrdered += 1;
			}
		}	
		System.out.printf("So dia them thanh cong: %d\n", i-1 );
	}
	
	public void addDigitalVideoDisc(int a,DigitalVideoDisc [] dvdList) {
		int i;
		for ( i = 0; i < dvdList.length; i++) {
			if(this.qtyOrdered >= MAX_NUMBER_ORDERED ) {
				System.out.print("The order is almost full \n");
			}
			else {
				this.itemsOrdered[this.qtyOrdered] = dvdList[i];
				System.out.print("The disc has been added \n");
				this.qtyOrdered += 1;
			}
		}	
		System.out.printf("So dia them thanh cong: %d\n", i-1 );
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc)
	{
		if(this.qtyOrdered == 0)
		{
			System.out.print("cant remove /n");
			
		} else {
			int i ;
			for( i = 0; i < this.qtyOrdered; i++)
			{
				if(this.itemsOrdered[i] == disc)
				{
					this.itemsOrdered[i] = this.itemsOrdered[i+1];
					System.out.print(" remove succeess \n\n");
					break;
				}
			}
			
			for(int j  = i+1; j < this.qtyOrdered; j++)
			{
				
					this.itemsOrdered[j] = this.itemsOrdered[j+1];
			}
			this.qtyOrdered = this.qtyOrdered -1;
		}
		
	}
	
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < this.qtyOrdered; i++)
		{  	
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
   
   public void showorder() {
	   System.out.print("----------------------------\n" );
	   for(int i = 0; i < this.qtyOrdered; i++)
		{  
		   int j = i+1;
		   System.out.print("STT:" +j +"\n" );
		   this.itemsOrdered[i].Showinfo();
		}
   }
		
	public void printOrder(DigitalVideoDisc dvd)
	{
		System.out.println("DVD - " + dvd.getTitle() + " - " + dvd.getCategory() + " - " + dvd.getDirector() + " - " + dvd.getLength() + ": " + dvd.getCost() + "$");
	}
	
	public void printListOrders()
	{
		System.out.println("*********************Order************************");
		System.out.println("Date: " + dateOrdered);
		System.out.println("Ordered Items: ");
		
		for(int i = 0; i < qtyOrdered; i++)
		{
			this.printOrder(itemsOrdered[i]);
		}
		
		System.out.println("Total cost: " + this.totalCost());
	}

}
