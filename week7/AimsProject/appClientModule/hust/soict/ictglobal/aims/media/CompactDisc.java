package hust.soict.ictglobal.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private int length;
	ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title) {
		super(title);
	}
	
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void addTrack(Track track)
	{
		if(this.tracks.contains(track))
		{
			System.out.println("Already exist in the list of tracks");
		}
		else
		{
			this.tracks.add(track);
			System.out.println("The track has been added");
		}
	}
	
	public void removeTrack(Track track)
	{
		if(this.tracks.contains(track))
		{
			this.tracks.remove(track);
			System.out.println("The trach has been deleted");
		}
		else
		{
			System.out.println("Dont exist in the list of tracks");
		}
	}
	
	public void removeTrack(int i)
	{
		this.tracks.remove(i);
		System.out.println("The trach has been deleted");
	}
	
	public int getLength()
	{
		int l = 0;
		
		for(Track e: tracks)
		{
			l += e.getLength();
		}
		
		return l;
	}

	@Override
	public void play() {
		System.out.println("---------PLAY THE LIST OF TRACKS----------");
		for(Track e: tracks)
		{
			e.play();
		}
		
	}
}
