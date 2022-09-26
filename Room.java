package GL;

public class Room {

	private int roomNo;
	private int floorNo;
	private boolean ac;
	private RoomStatus roomStatus;
	private RoomOccupancy occupancy;
	private double acCost;
	
	public double getAcCost() {
		return acCost;
	}
	public Room(int roomNo, int floorNo, boolean ac, RoomStatus roomStatus, RoomOccupancy occupancy) {
		
		this.roomNo = roomNo;
		this.floorNo = floorNo;
		this.ac = ac;
		this.roomStatus = roomStatus;
		this.occupancy = occupancy;
		
		if(ac) {
			this.acCost=1000;
		}
		
	}
	public int getRoomNo() {
		return roomNo;
	}
	
	public int getFloorNo() {
		return floorNo;
	}
	
	public boolean getAc() {
		return ac;
	}
	
	public RoomStatus getRoomStatus() {
		return roomStatus;
	}
	
	public RoomOccupancy getOccupancy() {
		return occupancy;
	}
	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus=roomStatus;
		
	}
	
}
	
	
	
	
	
	

		
	


