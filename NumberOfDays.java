package GL;
import java.util.Date;

public class NumberOfDays {

	private Date checkIn;
	private int noOfDays;
	public NumberOfDays(Date checkIn, int noOfDays)
	{
		
		this.checkIn = checkIn;
		this.noOfDays = noOfDays;
	}

	
	public Date getCheckIn() {
		return checkIn;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	
}
	
	
	

