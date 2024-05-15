package src;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author Marmik Patel
 */
public class Driver {

	/**
	 * main class
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		try {
			PrintStream output = new PrintStream("PA1-code/testCase40.txt");
			System.setOut(output);

		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
			System.exit(0);
		}

		/* Complete here the code for the main method ... */
		Network objNetwork = new Network("network"); /* Activate the network */
		objNetwork.start();
		Server objServer = new Server(); /* Start the server */
		objServer.start();
		Client objClient1 = new Client("sending"); /* Start the sending client */
		objClient1.start();
		Client objClient2 = new Client("receiving"); /* Start the receiving client */
		objClient2.start();

	}
}
