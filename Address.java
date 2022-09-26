package GL;

public class Address {

	
		private String city;
		private String state;
		private String country;
		private int postalCode;
	
		
		public Address(String city,String state, String country , int postalCode)
		{
			this.city=city;
			this.state=state;
			this.country=country;
			this.postalCode=postalCode;
			
		}
		public String getCity()
		{
			return city;
		}
		public String getState()
		{
			return state;

		}
		public String getCountry()
		{
			return country;
		}
		public int getPostalCode()
		{
			return postalCode;
		}
	
	

}
