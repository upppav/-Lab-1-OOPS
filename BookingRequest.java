package GL;

public class BookingRequest {

	
		private RoomOccupancy occupancyrequest;
		private int floorNumber;
		private boolean needAc;
		public BookingRequest(RoomOccupancy occupancyrequest, int floorNumber, boolean needAc) {
			
			this.occupancyrequest = occupancyrequest;
			this.floorNumber = floorNumber;
			this.needAc = needAc;
		}
		public BookingRequest(RoomOccupancy occupancyrequest)
		{
			this.occupancyrequest=occupancyrequest;
		}
		public BookingRequest(int floorNumber) 
		{
			this.floorNumber=floorNumber;
		}
		
		public BookingRequest(boolean needAc)
		{
			this.needAc=needAc;
		}
		public RoomOccupancy getOccupancyrequest() {
			return occupancyrequest;
		}
		public int getFloorNumber() {
			return floorNumber;
		}
		public boolean isNeedAc() {
			return needAc;
		}
		
	
}
		

