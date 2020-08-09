package de;

import java.util.*;


public class Aims {
	public static void showMenu()
	{
		System.out.println("Order Management Application");
		System.out.println("-------------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("-------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Order order = new Order();
		
		do
		{
			Aims.showMenu();
			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
			
		
			switch(choice)
			{
				case 1:
				{
					System.out.println("-------------------------");
					if(Order.nbOrder < Order.LIMITED_NUMBER_OREDERED)
					{
						order = new Order();
						System.out.println("Created new item successfully");
					}
					else
					{
						System.out.println("The orders has been almost full");
					}
					
					System.out.println();
					break;
				}
				case 2:
				{
					System.out.println();
					System.out.println("-------------------------");
					System.out.println("Add item to the order");
					System.out.println("-------------------------");
					System.out.print("Enter title: ");
					String title = sc.nextLine();
					System.out.print("Enter category: ");
					String category = sc.nextLine();
					System.out.print("Enter cost: ");
					float cost = Float.parseFloat(sc.nextLine());
					
					Media item = new Media(title, category, cost);
					order.addMedia(item);
					
					break;
				}
				case 3:
				{
					System.out.println();
					System.out.println("-------------------------");
					System.out.println("Delete item by id");
					System.out.println("---------------------------");
					System.out.print("Enter the index you want to delete: ");
					int index = Integer.parseInt(sc.nextLine());
					order.removeMedia(index);
					
					break;
				}
				case 4:
				{
					System.out.println();
					System.out.println("-------------------------");
					System.out.println("Display the items list of order");
					System.out.println("---------------------------");
					for(int i = 0; i < order.getQtyOrdered(); i++)
					{
						order.getItemsOrdered().get(i).print();
					}
					
					break;
				}
				case 0: System.out.println("-------------------------");System.out.println("Goodbye"); break;
				default: System.out.println("Invalid choice"); break;
			}
		}while(choice != 0);
		sc.close();
	}
  
}

