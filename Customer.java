package GL;

public class Customer {

	
		private String name;
		private int age;
		private BookingRequest bookingRequest;
		private NumberOfDays NumberOfDays;
		public Customer(String name, int age, BookingRequest bookingRequest, GL.NumberOfDays numberOfDays) {
			super();
			this.name = name;
			this.age = age;
			this.bookingRequest = bookingRequest;
			NumberOfDays = numberOfDays;
		}
		
		public Customer(String name, int age) {
			this.name=name;
			this.age=age;
			
		}

		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public BookingRequest getBookingRequest() {
			return bookingRequest;
		}
		public NumberOfDays getNumberOfDays() {
			return NumberOfDays;
		}
		
		
	}


