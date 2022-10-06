/**
 * This program implements A basic phone is a device which allows a 
 * user to communicate though calls and text.
 * 
 * @class Main
 * 
 * @author Group Five Pogi
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	/** 
	 * This is the main method which makes use of isPrime method.
	 * @param args Unused.
	 * @throws IOException If an input or output exception occurred.
	 * @return Nothing.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String manufacturer;
		String model;
		String sim;

		// commit example
		System.out.print("Enter your phone manufacturer: ");
		manufacturer = in.readLine();
		System.out.print("\nEnter your phone model: ");
		model = in.readLine();
		System.out.print("\nEnter your sim card number: ");
		sim = in.readLine();

		BasicPhone objBasicPhone = new BasicPhone(manufacturer, model, sim);

		int operation;
		while (true) {
			try {
				System.out.println("\n------PHONE------");
				System.out.println("");
				System.out.println("\n[1] Buy Load");
				System.out.println("[2] Check Balance");
				System.out.println("[3] Text");
				System.out.println("[4] Call");
				System.out.println("[5] Change Number");
				System.out.println("[6] Shut Down Phone\n");
				System.out.print("Enter Operation: ");
				operation = Integer.parseInt(in.readLine());
				switch (operation) {
				case 1: // Buy Load
					while (true) {
						try {
							System.out.print("\nEnter the amount: ");
							int amount = Integer.parseInt(in.readLine());
							if (amount > 0) {
								objBasicPhone.BuyLoad(amount);
								objBasicPhone.DisplayInformation();
								break;
							} else {
								System.out.println("\nError. Amount cannot be zero or negative.");
							}
						} catch (Exception e) {
							System.out.println("\nError. Please input valid characters.");
						}
					}
					break;
				case 2:
					objBasicPhone.CheckBalance();
					break;
				case 3:
					while (true) {
						try {
							System.out.print("Enter the number of reciever: ");
							int receiver = Integer.parseInt(in.readLine());
							System.out.print("Enter your message to: " + receiver + "\n");
							String message = in.readLine();
							objBasicPhone.Text(String.valueOf(receiver), message);
							break;

						} catch (Exception e) {
							System.out.println("\nError. Please input valid characters.");
						}
					}
					break;
				case 4:
					while (true) {
						try {
							System.out.print("Enter the number which you would want to call: ");
							int number = Integer.parseInt(in.readLine());
							System.out.print("Enter the amount of time in seconds you would like to call: ");
							int callLength = Integer.parseInt(in.readLine());
							objBasicPhone.Call(String.valueOf(number), callLength);
							break;
						} catch (Exception e) {
							System.out.println("\nError. Please input valid characters.");
						}
					}
					break;
				case 5:
					while (true) {
						try {
							System.out.println("Enter new number: ");
							int newNumber = Integer.parseInt(in.readLine());
							objBasicPhone.ChangeNumber(String.valueOf(newNumber));
							break;

						} catch (Exception e) {
							System.out.println("\nError. Please input valid characters.");
						}
					}
					break;
				case 6:
					objBasicPhone.DisplayInformation();
					break;
				case 7:
					objBasicPhone.Shutdown();
					break;
				}
			} catch (Exception e) {
				System.out.println("\nError. Please input valid characters.");
			}

		}

	}
}
