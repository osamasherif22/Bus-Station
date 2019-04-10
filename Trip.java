package algoritm;

public class Trip {
	String id;
	String source;
	String destination;
	/*String day;
	String month;
	String year;*/
	String date;
	String time;
	
	//String driver;
	
	String vehicleType;
	int  numOfSeats;
	String destance;
	public Trip(String id, String source, String destination,String date , String time,/* String vehicleType,	*/int numOfSeats,String destance) {
	
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.date=date;
		this.time = time;
		/*this.day = day;
		this.month = month;
		this.year = year;
		
		this.vehicleType = vehicleType;*/
		this.numOfSeats=numOfSeats;
		this.destance=destance;
	}
	public String getDestance() {
		return destance;
	}
	public void setDestance(String destance) {
		this.destance = destance;
	}
	/*public void printTripList(ArrayList<Trip> tripList)
	{
		
	}*/
	public Trip() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
}
