package de;

import java.util.Scanner;


public class test {
     static Order anOrder1 = new Order();
  
	public static void main(String[] args) {

		
		
	    DigitalVideoDisc List[] = new DigitalVideoDisc[4];
		
	    
		List[0] = new DigitalVideoDisc("1 The Lion King");
		List[0].setCategory("Animation");
		List[0].setCost(19.95f);
		List[0].setDirector("Roger Allers");
		List[0].setLength(87);
		
		List[1] = new DigitalVideoDisc("2 The Lion King");
		List[1].setCategory("2Animation");
		
		List[2] = new DigitalVideoDisc("3 The Lion King");
		List[2].setCategory("3Animation");
		
		List[3] = new DigitalVideoDisc("4 The Lion King");
		List[3].setCategory(" 4 Animation");

		anOrder1.addDigitalVideoDisc(4,List);
		anOrder1.printListOrders();
		
		searchDisc();
		
		System.out.println("-------------------------GET LUCKY ITEM---------------------------------");
		DigitalVideoDisc disc = anOrder1.getALuckyItem();
		System.out.println("Get lucky item: " );
		disc.Showinfo();

	}
	
	public static void searchDisc() {
		String a ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten disc ");
		a = sc.nextLine();
		
		for (int i = 0; i < anOrder1.qtyOrdered; i++) {
			DigitalVideoDisc disc = anOrder1.getItemsOrdered()[i];
			if(disc.search(a)) {
			
				System.out.println("tim thay:\n");
			    disc.Showinfo();;
		    }
		}
	}

}
