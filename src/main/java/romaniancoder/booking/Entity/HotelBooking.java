package romaniancoder.booking.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;


public class HotelBooking {
	
	//private Long id;
	
	private String hotelName;
	private double pricePerNight;
	private int nbOfNights;
	
	public HotelBooking(String hotelName, double pricePerNight, int nbOfNights) {
		this.hotelName = hotelName;
		this.pricePerNight = pricePerNight;
		this.nbOfNights = nbOfNights;
	}

	public HotelBooking() {
	}

	/*public Long getId() {
	return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}*/
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getNbOfNights() {
		return nbOfNights;
	}

	public void setNbOfNights(int nbOfNights) {
		this.nbOfNights = nbOfNights;
	}

	
	public double getTotalPrice(){
		return pricePerNight * nbOfNights;
	}
	
}
