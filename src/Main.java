import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String manufacturer;
		String model;
		String sim;
		
		//commit example
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
					case 1:
						System.out.println("Enter amount: ");
						int loadAmount = Integer.parseInt(in.readLine());
						
					case 2:
						objBasicPhone.CheckBalance();
						break;
						
					case 3:
							try {
								System.out.print("Enter the number of reciever: ");
								int receiver = Integer.parseInt(in.readLine());
								System.out.print("Enter your message to: " + receiver + "\n");
								String message = in.readLine();
								objBasicPhone.Text(String.valueOf(receiver), message);
								break;
								
							} catch (Exception e) {
								System.out.println("Invalid input! Try again.");
							}
							
					case 4: 
					case 5: 
					case 6: 
				}
			} catch (Exception e) {
				System.out.println("Error");
			}

		}

	}
}
