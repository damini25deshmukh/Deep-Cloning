package deepclonning;

public class AddressStu implements Cloneable {
	String city;
	String country;
	int pinNumber;
	public AddressStu() {
		
	}
	public AddressStu( String city, String country,int pinNumber) {
		this.city=city;
		this.country=country;
		this.pinNumber=pinNumber;
	}
	
		@Override
	public String toString() {
		return "AddressStu [city=" + city + ", country=" + country + ", pinNumber=" + pinNumber + "]";
	}
		@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
