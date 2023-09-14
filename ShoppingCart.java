/**
 * Holds an array of items.
 */

/**
 * @author Brandon Esarey
 * @version 5.0 
 * Assignment 1.1
 * CS215 Semester year Fall 2023
 */
public interface ShoppingCart<T>{
	/**
	 * Gets the current number of entries in the cart.
	 * 
	 * @return The integer number of entries currently in the cart.
	 */
	public int getCurrentSize();

	/**
	 * Sees whether the cart is empty.
	 * 
	 * @return True if the cart is empty, or false if not.
	 */
	public boolean isEmpty();
	
	/**
	 * Adds a new entry to the cart.
	 * 
	 * @param newEntry The object to be added as a new entry.
	 * @return True if the addition is successful, or false if not.
	 */
	public boolean add(T newEntry);

	/**
	 * Removes one unspecified entry from the cart, if possible.
	 * 
	 * @return Either the removed entry, if the removal. was successful, or null.
	 */
	public T remove();

	/**
	 * Removes one occurrence of a given entry from the cart, if possible.
	 * 
	 * @param anEntry The entry to be removed.
	 * @return True if the removal was successful, or false if not.
	 */
	public boolean remove(T anEntry);

	/** Removes all entries from the cart. */
	public void clear();

	/**
	 * Counts the number of times a given entry appears in the cart.
	 * 
	 * @param anEntry The entry to be counted.
	 * @return The number of times anEntry appears in the cart.
	 */
	public int getFrequencyOf(T anEntry);

	/**
	 * Tests whether the cart contains a given entry.
	 * 
	 * @param anEntry The entry to find.
	 * @return True if the bag contains anEntry, or false if not.
	 */
	public boolean contains(T anEntry);

	/**
	 * Retrieves all entries that are in the cart.
	 * 
	 * @return A newly allocated array of all the entries in the cart. Note: If the
	 *         cart is empty, the returned array is empty.
	 */
	public T[] toArray();
	
	/*
	 * Adds the price of every item in the bag.
	 */
	public void totalPrice();
	
	/*
	 * Multiplies the total cost of items in the cart by .06 and adds the answer to the total cost.
	 */
	public void tax();

}//end ShoppingCart
