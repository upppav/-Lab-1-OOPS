package GL;

public class RoomPrice {

	static private double price;
	static double getPrice(RoomOccupancy occupancy) {
		return setPrice(occupancy);
		
	}
	private static double setPrice(RoomOccupancy occupancy) {
		if(occupancy==RoomOccupancy.Single) {
			return 2000;
		}
		else
			return 3000;
	}

}
