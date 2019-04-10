package algoritm;
import java.util.*;
	
public class Customer extends Person implements CustomerAction
{	
	public ArrayList<Trip> listTrips(String source,String destination,ArrayList<Trip> tripList)
		{
	        	ArrayList<Trip> foundList = new ArrayList<>();
	        	tripList.forEach(Trip -> {
	        		if ((destination==null&&source
	        			return tripList;
	        		else if(Trip.destination.equalsIgnoreCase(destination))
	        		{
	        			if(Trip.source.equalsIgnoreCase(source))
	        			{
		 				  foundList.add(Trip);
	        			}
	          		}
	        		 
	       	});
	      return foundList;
		 }
		public Customer(String userName, String password) {
			super(userName, password);
			// TODO Auto-generated constructor stub
	}
	public boolean checkAvailability(Trip selected, Trip selected2, int numOfSeats) {
		return false;
	}
	public Ticket reserve(Trip selected, Trip selected2, Person customer,int numOfSeats) {
		return null;
	}
	
	
}	