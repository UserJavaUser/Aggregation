package by.htp.tours.entity;

public class Tour {
	
	private int id;
	private int day;
	private int price;
	private FoodType foodType;
	private TourType tourType;
	private TransportType transportType;
	
	public Tour() {
		
	}
	
	public Tour(int id, int day, int price, FoodType foodType, TourType tourType, TransportType transportType) {
		this.id = id;
		this.day = day;
		this.price = price;
		this.foodType = foodType;
		this.tourType = tourType;
		this.transportType = transportType;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public TourType getTourType() {
		return tourType;
	}

	public void setTourType(TourType tourType) {
		this.tourType = tourType;
	}

	public TransportType getTransportType() {
		return transportType;
	}

	public void setTransportType(TransportType transportType) {
		this.transportType = transportType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
		result = prime * result + id;
		result = prime * result + price;
		result = prime * result + ((tourType == null) ? 0 : tourType.hashCode());
		result = prime * result + ((transportType == null) ? 0 : transportType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tour other = (Tour) obj;
		if (day != other.day)
			return false;
		if (foodType != other.foodType)
			return false;
		if (id != other.id)
			return false;
		if (price != other.price)
			return false;
		if (tourType != other.tourType)
			return false;
		if (transportType != other.transportType)
			return false;
		return true;
	}

	@Override
	public String toString(){
		return "Tour " + id + " [" + day + " days, " + price + " USD , foodType - " + foodType + ", " + tourType
				+ ", " + transportType + "]";
	}
	
	
}
