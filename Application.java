/**
 * 
 */

/**
 * @author Brandon Esarey
 * @version 5.0 
 * Assignment 1.1
 * CS215 Semester year Fall 2023
 */
public class Application {

	/**
	 * @param <T>
	 * @param args
	 */
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		ResizableArrayBag<Item> cart = new ResizableArrayBag<Item>(40);
		System.out.println("This cart has "+cart.getCurrentSize()+" objects.");
		System.out.println("Is this cart empty: "+cart.isEmpty());
		cart.add(new Item("Batteries",12));
		System.out.println("This cart has "+cart.getCurrentSize()+" objects.");
		System.out.println("Is this cart empty: "+cart.isEmpty());
		cart.remove();
		cart.add(new Item("Batteries",12));
		cart.add(new Item("Milk",3));
		cart.add(new Item("Noodles",7));
		System.out.println("This array is "+cart.getCurrentSize()+" entries long.");
		System.out.println("Put the milk up: "+cart.remove(new Item("Milk",3)));
		System.out.println("Does the cart have batteries: "+ cart.contains(new Item("Batteries",12)));
		System.out.println("How many noodles do we have: "+ cart.getFrequencyOf(new Item("Noodles",7)));
		cart.clear();
		cart.add(new Item("Batteries",12));
		cart.add(new Item("Milk",3));
		cart.add(new Item("Noodles",7));
	}//end main()

}//end Application
