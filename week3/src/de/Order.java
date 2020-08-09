package de;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	public int qtyOrdered = 0;

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
	   for(int i = 0; i < this.qtyOrdered; i++)
		{  
		   int j = i+1;
		   System.out.print("STT:" +j +"\n" );
		   this.itemsOrdered[i].Showinfo();
		}
   }
		

}
