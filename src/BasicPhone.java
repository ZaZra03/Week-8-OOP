public class BasicPhone {
	private String manufacturer;
	private String model;
	private String simNumber;
	private double loadBalance;

	
	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}
	
	public String getSimNumber() {
		return this.simNumber;
	}

	public BasicPhone(String manufacturer, String model, String simNumber) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.simNumber = simNumber;
		this.loadBalance = 0;
	}
	
	public void BuyLoad(double amount) {
		
	}

	public void Call() {

	}

	public void Text() {

	}
	
	public void ChangeNumber(String newNumber) {

	}

	public void DisplayInformation() {
		System.out.println("MANUFACTURER: " + this.manufacturer);
		System.out.println("MODEL : " + this.model);
		System.out.println("SIM NUMBER : " + this.simNumber);
	}
}
