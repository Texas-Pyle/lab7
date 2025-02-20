/**
 * Lab 7
 * 
 * Class representing a restaurant. Food orders may be added to a restaurant as Tickets and will be
 * stored in some way (how they are stored is up to the subclasses). The order in which Tickets are
 * completed is also dependent on the subclass' implementation of the abstract methods.
 * 
 * @author Stephen
 * @version 2018-10-10
 * 
 * @modified by Em Evans
 * @version 2019-09-27
 */
public abstract class Restaurant 
{
	/**
	 *Adds an order to the restaurant.
	 *The restaurant will keep track of this order until it can be completed by completeOrder()
	 * @param order
	 * @return true if the order is successfully added. False otherwise.
	 */
	public abstract boolean addOrder(Order order);
	 /**
     * Determines the number of orders that have been added to the restaurant that have not been completed.
     * i.e. the number of unfulfilled meal orders.
     * 
     * @return The number of orders in the restaurant yet to be completed.
     */
	protected abstract int numberRemainingOrder();
	
    /**
     * Gets the orders that will next be completed. That is, gets the ticket that would be returned by completeOrder
     * without actually completing the ticket.
     * 
     * @return The ticket that will next be completed by the restaurant. null if there are no more tickets to
     * be completed.
     */
	protected abstract Order checkNextCompletedOrder();
	
    /**
     * Uses the abstract methods numberRemainingOrders() and checkNextCompleteOrders()
     * 
     * Gets the current status of the restaurant. Specifically, we get information about the number of orders
     * remaining in the restaurant, and the description of the order that will next be completed.
     * 
     * It is recommended that you use String.format()
     * 
     * @return If there are no incomplete orders left in the restaurant, return the String:
     *    "No orders left."
     * Else, return a string of the format:
     *    "(number of orders in restaurant order list) orders left. Working on: (the toString() of the next order to be completed)"
     */
	public String getCurrentStatus()
	{	String output = "";
		//TODO: implement this
		if(numberRemainingOrder() == 0) {
			output = "No orders left.";
			
		}else {
			output = String.format("%d ordersleft. Working on %s of the next orders to be completed",
									numberRemainingOrder(),checkNextCompletedOrder());
		}
		return output;
	}
    /**
     * Completes an order by updating the underlying data structure of the restaurant. Each restaurant uses this
     * function to determine the order in which tickets are completed. Once a ticket has been completed, it should
     * be considered to be removed from the restaurant. A ticket may not be completed twice. A completed tickets
     * symbolizes a meal that has been prepared and delivered to a customer.
     * 
     * @return The next Ticket to be completed.
     *  null if there are no tickets to be completed.
     */
	protected abstract Order completeOrder();
	
    /**
     * Uses the overloaded protected completeTicket method.
     * 
     * Completes a ticket and calculates the time it took to complete the ticket. The time to complete a ticket
     * is the difference between the time the ticket was completed and the time the ticket was
     * (i.e. the ticket's timeOrdered)
     * 
     * @param timeCompleted The time at which the ticket was completed.
     * @return A string of the format:
     *  "It took (time difference) time units to complete the following order: (toString of completed order)"
     *  if the are no tickets to be created, returns:
     *  "No orders remain. Could not complete an Ticket."
     */
	public String completeOrder(int timeCompleted)
	{
		//TODO: implement this
		
		
	}
	
}

