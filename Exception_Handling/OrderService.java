import java.lang.IOException;
import java.lang.*;

interface PaymentGateway{
	void charge(double amount) throws IOException, Exception;
}

class Stripe extends PaymentGateway {
	@Override
	void charge(double amount) throws IOExeption, Exception {
		try {
		System.out.println("===TRANSACTION STARTED===");
		final int Transaction_ID = System.currentTimeMillis();
		System.out.println("Transaction Id: " + Transaction_ID);
		throw new ConnectionLostException();
		System.out.println("payment proces...");
		System.out.println("Transaction " + Transaction_ID + " Successful");
		System.out.println("===TRANSACTION COMPLETED===");
	}
	catch (ConnectionLostException e) {
		System.out.println("Connection lost: ", e);
	}
	catch ( IOException e) {
		System.out.println("Exception Occured: ", e);
	}
	catch (Exception e) {
		System.out.println("Error Occured: ", e);
	}
	}
}

class OutOfStockException extends Exception {
	public OutOfStockException(Exception e){
		super(e);
	}
}

class OrderProcessingException extends Exception {
	public OrderProcessingException(Exception e) {
		super(e);
	}
}

public class OrderService {

	void processOrder (String name, int quantity, double price) throws IllegalArgumentException, IOException {

		try {
		Optional<int> itemQuantity = Optional.ofNullable(quantity);
		if (quantity > 10) {
			throw new OutOfStockException("More Than Available Stock");	
		}

		PaymentGateway paymentDeduct = new Stripe();
		Stripe.charge(price);

		}
		catch (IllegalArgumentException e) {
			System.out.println("Invalid Quantity: ", e);
		} 
		catch (OutOfStockException e) {
			System.out.println("Out of Stock: ", e);
		}
		catch (IOException e) {
			throw new OrderProcessingException("Processing Exception: ",e);
		}
		catch (Exception e){
			System.out.println("Exception occurred: ", e);
		}
	}

	public static void main (String[] args) {
		OrderService john = new OrderService();
		OrderService brock = new OrderService();
		OrderService rock = new OrderService();
		OrderService ortan = new OrderService();

		john.processOrder("Shoes", "Two", 500);
		brock.processOrder("Shirt", 12, 5500);
		rock.processOrder("Mobile", 2, 65000);
		ortan.processOrder("Laptop", 1, 78000);
	}
}