package hust.soict.ictglobal.aims;

import hust.soict.ictglobal.aims.media.DigitalVideoDisc;
import hust.soict.ictglobal.aims.order.Order;

public class DiskTest {
	public static void main(String[] args) {
		// Order 1
		Order anOrder1 = new Order();
		anOrder1.setDateOrdered("4/1/2020");
		
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		
		// add the dvd to the order
		anOrder1.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder1.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		
		// add the dvd to the order
		anOrder1.addDigitalVideoDisc(dvd3);
		anOrder1.printListOrders();
	
		
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Green Hornet");
		dvd4.setCategory("Action");
		dvd4.setCost(20.5f);
		dvd4.setDirector("Adam Walker");
		dvd4.setLength(119);
		
		// add the dvd to the order
		anOrder1.addDigitalVideoDisc(dvd4);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Monster Killer 3");
		dvd5.setCategory("Animation");
		dvd5.setCost(15.5f);
		dvd5.setDirector("Wu Xin");
		dvd5.setLength(45);
		anOrder1.addDigitalVideoDisc(dvd5);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Rugal");
		dvd6.setCategory("Action");
		dvd6.setCost(37f);
		dvd6.setDirector("Bloodshot");
		dvd6.setLength(60);
		
		anOrder1.addDigitalVideoDisc(dvd6);
		
		// search
		System.out.println("-------------------------SEARCH---------------------------------");
		for(int i = 0; i < anOrder1.getQtyOrdered(); i++)
		{
			DigitalVideoDisc disc = anOrder1.getItemOrdered()[i];
			if(disc.search("The Monster"))
			{
				disc.printOrder();
			}
		}
		
		System.out.println("-------------------------GET LUCKY ITEM---------------------------------");
		DigitalVideoDisc disc = anOrder1.getALuckyItem();
		System.out.println("Get lucky item: " );
		disc.printOrder();
	}
}
