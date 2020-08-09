package hust.soict.ictglobal.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private String director;
	private int length;
	

	public DigitalVideoDisc(String title) {
		super(title);
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
	
	public void print()
	{
		System.out.println("DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.director + " - " + this.length + ": " + this.getCost() + "$");
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

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
}


