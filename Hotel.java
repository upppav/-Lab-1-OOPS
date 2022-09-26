package GL;

public class Hotel {

	
		private String hotelName;
		private int noOfFloor;
		private Room[][] noOfRooms;
		private int roomPerFloor;
		private Address address;
		public Hotel(String hotelName, int noOfFloor, Room[][] noOfRooms,  int roomPerFloor, Address address) {
			super();
			this.hotelName = hotelName;
			this.noOfFloor = noOfFloor;
			this.noOfRooms = noOfRooms;
			this.roomPerFloor = roomPerFloor;
			this.address = address;
		}
		public String getHotelName() {
			return hotelName;
		}
		public int getNoOfFloor() {
			return noOfFloor;
		}
		public Room[][] getNoOfRooms() {
			return noOfRooms;
		}
		
		public int getRoomPerFloor() {
			return roomPerFloor;
		}
		public Address getAddress() {
			return address;
		}
		
		
		
		
	}

