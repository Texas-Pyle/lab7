/**
 * Lab 7
 * 
 * Implementation of the Restaurant abstract class. Stores and completes tickets based on a queue data structure.
 * Tickets are treated in a FIFO manner. That is, the first ticket to be added to the restaurant is
 * the first ticket to be completed. i.e. the QueueRestaurant behaves as one would expect a normal restaurant to.
 * The first person to order food will be the first person served.
 * 
 * @author Stephen
 * @version 2018-10-10
 * 
 * @modified by Em Evans
 * @version 2019-30-09
 */
public class QueueRestaurant extends Restaurant{
	
	private Order[] orderList;
	private int head;
	private int tail;
	private int numOrders;
	
	public QueueRestaurant(int maxSize)
	{
		//TODO: implement this
		orderList = new Order[maxSize];
		head = 0;
		tail = 0;
		numOrders = 0;
	}
    /**
     * Add an order to the restaurant. If there is no more room (number of tickets in the restaurant == maxSize of
     * queueRestaurant), do not add an order and return false.
     * 
     * @param order The Order to be added.
     * @return 
     */
	public boolean addOrder(Order order)
	{boolean OrderAdded = false;
		//TODO: implement this
		if (orderList.length != numOrders) {
			orderList[numOrders] = order;
			OrderAdded = true;
			numOrders ++;
			
		}
		return OrderAdded;
	}
    /**
     * [Internal Code - This is not required by the specification but can be a useful construct.]
     * 
     */
	@Override
	protected Order completeOrder()
	{
		//TODO:implement this
		//If no orders, return null
	    //Get first submitted order
		//Update the numOrders and tail and return
		
	}
    /**
     * Computes the number of orders in the restaurant that have not been completed.
     * 
     * @return the number of orders to complete.
     */
	@Override
	protected int numberRemainingOrder()
	{
		//TODO: implement this
	}
    /**
     * [Internal Code - This is not required by the specification but can be a useful construct.]
     */
	@Override
	protected Order checkNextCompletedOrder()
	{
		//TODO: implement this
		//check that the is at least one order
		//if yes, return the next order to be completed
	}
}
