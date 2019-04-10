package algoritm;
import java.util.*;

public class Customer extends Person implements CustomerAction
{	private ArrayList<Ticket> customerTickets=new ArrayList<>();
private  int calculatePrice (String distance ,int numOfSeats)
{
	return (Integer.valueOf(distance)*5)*numOfSeats;	
}
	public ArrayList<Ticket> getCustomerTickets() {
	return customerTickets;
				}

public void setCustomerTickets(Ticket ticket) {
	this.customerTickets.add(ticket);
}


	
	public ArrayList<Trip> listTrips(String source,String ticketType,String destination,String vehicleType,ArrayList<Trip> tripList)
		{
	        	ArrayList<Trip> foundList = new ArrayList<>();
	        	if (ticketType.equalsIgnoreCase("roundTrip"))
	        	{
		        	ArrayList<Trip> foundListBack = new ArrayList<>();

	        	}
	        	if (destination==null&&source==null)
	        	{
	        		return tripList;
	        	}
	        	tripList.forEach(Trip -> {
	        	 if(Trip.destination.equalsIgnoreCase(destination))
	        		{
	        			if(Trip.source.equalsIgnoreCase(source))
	        			{
	        				if(Trip.vehicleType.equalsIgnoreCase(vehicleType))
		 				  
	        					{
	        						foundList.add(Trip);
	        					}
	        			}
	          		}
	        	 else
	        		 return;
	       	});
	      return foundList;
		 }
		public Customer(String userName, String password) {
			super(userName, password);
			// TODO Auto-generated constructor stub
	}
	public boolean available(Trip selected, Trip selected2, Integer numOfSeats) {
		if (numOfSeats==null)
		{
			numOfSeats=1 ;
		}
		
		if (selected2==null)
		{
		//	if ( numOfSeats == null)
				if (selected.numOfSeats>=numOfSeats)
					return true;
		}
		else
		{
			if ((selected.numOfSeats>=numOfSeats)&&(selected2.numOfSeats>=numOfSeats))
					return true;
		}
		return false;
	}
	public Ticket reserve(Trip selected, Trip selected2, Customer customer,int numOfSeats) 
		
		{
		Ticket ticket;
		
		if(customer.available(selected, selected2, numOfSeats))
		{
					if (selected2==null)
					{
						ticket=new Ticket(String.valueOf(selected.getNumOfSeats()),calculatePrice(selected.getDestance(),numOfSeats),"S",selected,selected2);
						customer.setCustomerTickets(ticket);
						selected.setNumOfSeats(selected.getNumOfSeats()-1);
					}
					else 
						 {
						
							ticket=new Ticket(String.valueOf(selected.getNumOfSeats()),calculatePrice(selected.getDestance(),numOfSeats)+calculatePrice(selected.getDestance(),numOfSeats),"R",selected,selected2);
							customer.setCustomerTickets(ticket);
							selected2.setNumOfSeats(selected2.getNumOfSeats()-1);
							selected.setNumOfSeats(selected.getNumOfSeats()-1);

						 }
				return ticket;
				}
		return null;
	}
}