package de;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	public DigitalVideoDisc(String title) {
		super(title);
		
	}
	
	
	
	public DigitalVideoDisc(String title, String category) {
		super(title,category);
		
	}



	public DigitalVideoDisc(String title, String category, String director) {
		super(title,category);
		this.director = director;

	}



	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
        this.director = director;
        this.length = length;
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
	public void Showinfo(){
	
		System.out.printf("title: %s \n" , this.getTitle());
		System.out.printf("category: %s\n", this.getCategory());
		System.out.printf("durector: %s\n" , this.getDirector());
		System.out.printf("length: %d\n" , this.getLength());
		System.out.printf("cost:%f \n" , this.getCost());
		System.out.println("------------------------------------\n" );
		
		
	}
	
	public boolean search(String title)
	{
		int check = 0;
		String split_title[] = title.split(" ", 0);
            
		
		for(String ti: split_title)
		{
			if(this.getTitle().contains(ti))
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
