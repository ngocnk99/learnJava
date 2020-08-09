package de;

public class Aims {
	public static void main(String[] args) {
		Order anOrder = new Order();
		
		//System.out.printf("STT: %d\n",anOrder.getQtyOrdered());

		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("1 The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);

		
		// add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
		System.out.printf("STT: %d\n",anOrder.getQtyOrdered());
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("2 Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		
		anOrder.addDigitalVideoDisc(dvd2);
		System.out.printf("STT: %d\n",anOrder.getQtyOrdered());
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("3 Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		
		anOrder.addDigitalVideoDisc(dvd3);
		System.out.printf("STT: %d\n",anOrder.getQtyOrdered());
		
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("4 Bladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(28.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(80);
		
		anOrder.addDigitalVideoDisc(dvd4);
		System.out.printf("STT: %d\n",anOrder.getQtyOrdered());
		anOrder.removeDigitalVideoDisc(dvd2);
		//System.out.printf("STT: %d\n",anOrder.getQtyOrdered());
	    anOrder.showorder();
	    

		
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
	}

}
