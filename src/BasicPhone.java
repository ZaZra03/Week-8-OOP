public class BasicPhone {
	//Class Fields
	private String manufacturer;
	private String model;
	private String simNumber;
	private double loadBalance;

	/** 
	 * This method is used to set the sim number.
	 * @param String simNumber This is the parameter.
	 * @return String This returns the sim number.
	 */
	
	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}

	/** 
	 * This method is used to get the sim number.
	 * @param None.
	 * @return String This returns the current object's simNumber.
	 */
	
	public String getSimNumber() {
		return this.simNumber;
	}

	/** 
	 * This is a parameterized constructor.
	 * @param String manufacturer This is the first parameter.
	 * @param String model This is the second parameter.
	 * @param String simNumber This is the third parameter.
	 * @return String This returns the current object's simNumber.
	 */
	
	public BasicPhone(String manufacturer, String model, String simNumber) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.simNumber = simNumber;
		this.loadBalance = 0;
	}
	
	/** 
	 * This method is used increase the amount of load balance.
	 * @param double amount.
	 * @return None.
	 */

	public void BuyLoad(double amount) {
		this.loadBalance += amount;
		System.out.println("Load registered successfully.");
	}

	/** 
	 * This method is used check the load balance.
	 * @param None.
	 * @return None.
	 */
	
	public void CheckBalance() {
		System.out.println("Balance: " + this.loadBalance);
	}
	
	/** 
	 * This method is used check the load balance.
	 * @param String simNumber This is the first parameter.
	 * @param int seconds This is the second parameter.
	 * @return None.
	 */

	public void Call(String simNumber, int seconds) {
		int cost = (5*(Math.round(seconds/60)));
		double remainingBalance = this.loadBalance - cost;
		if(remainingBalance >=0) {
			int minute =  (int) Math.floor(seconds/60);
			int second =  (int) (seconds-(Math.floor(seconds/60)*60));
			System.out.println("You called "+simNumber+" for "+ minute+":"+second+". ");
			this.loadBalance = remainingBalance;
		}else {
			System.out.println("Insufficient balance!\nPlease try again.");
		}
	}
	
	/** 
	 * This method is used check the load balance.
	 * @param String receiverNumber This is the first parameter.
	 * @param String message This is the second parameter.
	 * @return None.
	 */

	public void Text(String receiverNumber, String message) {
		double textCost = 0.01 * message.length();
		if (textCost < this.loadBalance) {
			this.loadBalance = this.loadBalance - textCost;
			System.out.println(
					"\nMessage to: " + receiverNumber + "\n" + message + "\n" + "\nMessage amount: " + textCost);
			System.out.println();
		} else
			System.out.println("Insufficient balance. Please try again.");
	}

	/** 
	 * This method is used check the load balance.
	 * @param String receiverNumber This is the parameter.
	 * @return None.
	 */
	
	public void ChangeNumber(String newNumber) {
		if (this.simNumber == newNumber) {
			System.out.println("Error. Cannot change to the same number.");
		} else {
			this.simNumber = newNumber;
		}

	}
	
	/** 
	 * This method is used check the load balance.
	 * @param None.
	 * @return None.
	 */
	
	public void DisplayInformation() {
		System.out.println("MANUFACTURER: " + this.manufacturer);
		System.out.println("MODEL : " + this.model);
		System.out.println("SIM NUMBER : " + this.simNumber);
	}

	public void Shutdown() {
		System.exit(0);
	}
}
