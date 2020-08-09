package de;

public class Media {
	private String title;
	private String category;
	private float cost;
	
	
	
	
	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}




	public float getCost() {
		return cost;
	}




	public void setCost(float cost) {
		this.cost = cost;
	}


     

	public Media(String title) {
		super();
		this.title = title;
	}

    


	public Media(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}

    
   

	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}




	public void print()
	{
		System.out.println("Item:  Title-" + this.getTitle() + "  Category- " + this.getCategory() +  "  Cost- " + this.getCost() + "$");
	}
}
