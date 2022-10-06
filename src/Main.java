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
				System.out.println("------PHONE------");
				System.out.println("\n[1] Buy Load");
				System.out.println("[2] Text");
				System.out.println("[3] Call");
				System.out.println("[4] Change Number");
				System.out.println("[5] Shut Down Phone\n");
				System.out.print("Enter Operation: ");
				operation = Integer.parseInt(in.readLine());
				switch (operation) {
					case 1: // Buy Load
					case 2:
						System.out.print("Enter the number of reciever: ");
						String receiver = in.readLine();
						System.out.print("Enter your message to: " + receiver + "\n");
						String message = in.readLine();
						objBasicPhone.Text(receiver, message);
					case 3: // Call
						while(true) {
							try {
								System.out.print("Enter the number which you would want to call: ");
								int number = Integer.parseInt(in.readLine());
								System.out.print("Enter the amount of time in seconds you would like to call: ");
								int callLength = Integer.parseInt(in.readLine());
								objBasicPhone.Call(String.valueOf(number), callLength);
								break;
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("Invalid input! Try again. ");
							}
						}
						break;
					case 4: // Change Number
					case 5: // Shut Down Phone
						System.out.println("Shutting Down");
						Shutdown();
				}
			} catch (Exception e) {
				System.out.println("Error");
			}

		}

	}
}
