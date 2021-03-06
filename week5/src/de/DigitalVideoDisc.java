package de;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	
	
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}



	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}



	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}



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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public void Showinfo(){
	
		System.out.printf("title: %s \n" , this.title);
		System.out.printf("category: %s\n", this.category);
		System.out.printf("durector: %s\n" , this.director);
		System.out.printf("length: %d\n" , this.length);
		System.out.printf("cost:%f \n" , this.cost);
		System.out.println("------------------------------------\n" );
		
		
	}
	
	public boolean search(String title)
	{
		int check = 0;
		String split_title[] = title.split(" ", 0);
            
		
		for(String ti: split_title)
		{
			if(this.title.contains(ti))
			{
				check += 1;
			}
			else
			{
				break;
			}
		}
		
		if(check == split_title.length)
		{
			return true;
		}
		
		return false;
	}

}
