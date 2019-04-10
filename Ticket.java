package algoritm;

public class Ticket {
	/*String ticketType;
	String ticketFlavor;*/
	String seatNum;
	int price;
private	Trip trip1;
public Trip getTrip1() {
	return trip1;
}



public void setTrip1(Trip trip1) {
	this.trip1 = trip1;
}



public Trip getTrip2() {
	return trip2;
}



public void setTrip2(Trip trip2) {
	this.trip2 = trip2;
}



private Trip trip2;
	String ticketType;
	
	
	
	/*public Ticket (/*String ticketType,String ticketFlavorString seatNum,int price)
	{
		/*this.ticketFlavor=ticketFlavor;
		this.ticketType=ticketType;
		this.seatNum=seatNum;
		this.price=price;
	}*/



	public Ticket(String seatNum, int price, String ticketType,Trip trip1, Trip trip2) {
		this.seatNum = seatNum;
		this.price = price;
		this.trip1 = trip1;
		this.trip2 = trip2;
		this.ticketType = ticketType;
	}



	public String getSeatNum() {
		return seatNum;
	}



	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getTicketType() {
		return ticketType;
	}



	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	
}
