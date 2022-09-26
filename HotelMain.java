package GL;
import java.util.Scanner;

public class HotelMain {


	static Room room11=new Room(101,1,false,RoomStatus.NotOccupied,RoomOccupancy.Single);
	static Room room12=new Room(102,1,true,RoomStatus.NotOccupied,RoomOccupancy.Double);
	static Room room13=new Room(103,1,false,RoomStatus.NotOccupied,RoomOccupancy.Single);
	static Room room14=new Room(104,1,false,RoomStatus.NotOccupied,RoomOccupancy.Single);
	
	static Room room21=new Room(201,2,true,RoomStatus.NotOccupied,RoomOccupancy.Single);
	static Room room22=new Room(202,2,false,RoomStatus.NotOccupied,RoomOccupancy.Double);
	static Room room23=new Room(203,2,true,RoomStatus.NotOccupied,RoomOccupancy.Double);
	static Room room24=new Room(204,2,false,RoomStatus.NotOccupied,RoomOccupancy.Single);
	
    static Room[][] rooms= {{room11,room12,room13,room14},{room21,room22,room23,room24}};
    
    
    static Address address=new Address("Hydrabad","telangana","india",560046);
    static Hotel hotel =new Hotel("feel homes", 2 ,rooms,4,address);
    public static void main(String[] args)
    {
    	BookingRequest bookingRequest;
    	NumberOfDays numberOfDays;
    	Customer customer =new Customer("umer",21);
    	Scanner sc=new Scanner(System.in);
    	try {
    		while(true) {
    			System.out.println("enter occupancy : Single Double");
    			String occupancy=sc.next();
    			System.out.println("enter floor number(optional)");
    			int floor=sc.nextInt();
    			System.out.println("AC needed (true or fals)");
    			boolean ac=sc.nextBoolean();
    			bookingRequest=new BookingRequest(RoomOccupancy.valueOf(occupancy),floor,ac);
    			Room roomisAvailable=checkIncustomer(bookingRequest,hotel.getNoOfRooms());
    			if(roomisAvailable !=null) {
    				Booking a=bookingPriceAndDetails(roomisAvailable,customer);
    				System.out.println("       room details are        ");
    				System.out.println("Room number: "+a.getRoom().getRoomNo()+"\n"+"Floor number: "+a.getRoom().getFloorNo()+"\n"+
    				"occupancy: "+ a.getRoom().getOccupancy()+"\n"+"need ac"+a.getRoom().getAc()+"\n"+"ac cost: "+a.getRoom().getAcCost()+"\n"+"total price: "+a.getTotalprice());
    				
    			}
    			else {
    				System.out.println("room is not available");
    			}
    			
    		}
    		
    	}
    	catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    }
    private static Booking bookingPriceAndDetails(Room room,Customer customer) {
    	double totalprice=0.0;
    	if(room.getAc())
    	{
    		totalprice+=room.getAcCost();
    	}
    	totalprice +=RoomPrice.getPrice(room.getOccupancy());
    	return new Booking(customer,totalprice,room,customer.getNumberOfDays());
    }
    private static Room checkIncustomer(BookingRequest bookingRequest,Room[][] rooms) {
    	Room room=null;
    	if(bookingRequest.getFloorNumber() !=0) {
    		int i=bookingRequest.getFloorNumber() -1;
    		for(int j=0;j<rooms[i].length;j++)
    		{
    			room=roomavailable(rooms[i][j],  bookingRequest);
    			if(room !=null)
    				break;
    			
    		}
    	}
    	
    	else {
    		for(Room[] value :rooms) {
    			for(Room item :value) {
    				room=roomavailable(item,bookingRequest);
    				if(room !=null)
    					break;
    			}
    		}
    	}
    	if(room !=null)
    		room.setRoomStatus(RoomStatus.Occupied);
    	return room;
    }
    private static Room roomavailable(Room room,BookingRequest bookingRequest) {
    	if(!room.getRoomStatus().equals(RoomStatus.Occupied)&&(room.getOccupancy().equals(bookingRequest.getOccupancyrequest()))){
    		if(bookingRequest.isNeedAc()) {
    			if(room.getAc()) {
    				return room;
    			}
    			else {
    				return null;
    			}
    		}
    			else {
    				return room;
    			}
    		}
    	 return null;
    }
}

