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
		this.loadBalance += amount;
	}
	public void CheckBalance(){
		
	}
	public void Shutdown(){
		System.exit(0);	
	public void Call(String simNumber, int seconds) {
		int cost = (5*(Math.round(seconds/60)));
		double remainingBalance = this.loadBalance - cost;
		if(remainingBalance >=0) {
			String minute = String.format("%02d", Math.floor(seconds/60));
			String second = String.format("%02d", seconds-((Math.floor(seconds/60)*60)));
			System.out.println("You called "+simNumber+" for "+ minute+":"+second+". ");
		}else {
			System.out.println("Insufficient balance!\nPlease try again.");
		}
	}

	public void Text(String receiverNumber, String message) {
		double textCost = 0.01 * message.length();
		if(textCost < this.loadBalance) {
			this.loadBalance = this.loadBalance - textCost;
			System.out.println("\nMessage to: " + receiverNumber + "\n" + message + "\n" + "\nMessage amount: " + textCost);
			System.out.println();
		} else
			System.out.println("Insufficient balance.");
	}
	
	public void ChangeNumber(String newNumber) {
		if (this.simNumber == newNumber) {
			System.out.println("Error. Same Number.");
		} else {
			this.simNumber = newNumber;
		}

	}

	public void DisplayInformation() {
		System.out.println("MANUFACTURER: " + this.manufacturer);
		System.out.println("MODEL : " + this.model);
		System.out.println("SIM NUMBER : " + this.simNumber);
	}
	
	public void Shutdown(){
		Sytem.out.println("Phone is shutting down.);
		System.exit(0);
	}	
}
