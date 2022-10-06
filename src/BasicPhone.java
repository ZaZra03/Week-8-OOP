public class BasicPhone {
	private String manufacturer;
	private String model;
	private String simNumber;
	private double loadBalance;

	public String getManufacturer() {
		return this.manufacturer;
	}

	public String getModel() {
		return this.model;
	}

	public String getSimNumber() {
		return this.simNumber;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}

	public BasicPhone(String manufacturer, String model, String simNumber) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.simNumber = simNumber;
		this.loadBalance = 0;

	}
	
	public void BuyLoad(double amount) {
		
	}

	public void CallNumber() {

	}

	public void TextNumber() {

	}

	public void DisplayInformation() {
		System.out.println("MANUFACTURER: " + this.getManufacturer());
		System.out.println("MODEL : " + this.getModel());
		System.out.println("SIM NUMBER : " + this.getSimNumber());
	}
}