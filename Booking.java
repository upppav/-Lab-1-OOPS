package GL;

public class Booking {

	private Customer customer;
	private double totalprice;
	private Room room;
	private NumberOfDays numberOfDays;
	public Booking(Customer customer, double totalprice, Room room, NumberOfDays numberOfDays) {
		
		this.customer = customer;
		this.totalprice = totalprice;
		this.room = room;
		this.numberOfDays = numberOfDays;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public Room getRoom() {
		return room;
	}
	public NumberOfDays getNumberOfDays() {
		return numberOfDays;
	}

	

}
