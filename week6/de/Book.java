package de;

import java.util.*;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title) {
		super(title);
	}

	public Book (String title, String category) {
		super(title, category);
	}
	
	public Book (String title, String category, List<String> authors)
	{
		super(title, category);
		this.authors = authors;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName)
	{
		if(this.authors.indexOf(authorName) == -1)
		{
			this.authors.add(authorName);
			System.out.println("The authorName had been added");
		}
		else
		{
			System.out.println("The author name has been exist");
		}
	}
	
	public void removeAuthor(String authorName)
	{
		int index = this.authors.indexOf(authorName);
		if(index != -1)
		{
			this.authors.remove(index);
			System.out.println("The author name has been removed");
		}
		else
		{
			System.out.println("The author name dont exist");
		}
	}
}
