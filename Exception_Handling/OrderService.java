import java.io.IOException;
import java.lang.*;

interface PaymentGateway{
	void charge(double amount) throws Exception;
}

class Stripe implements PaymentGateway {
	@Override
	public void charge(double amount) throws IOException{
		System.out.println("Connecting to Stripe gateway..");
		//for network timeout
		throw new IOException("Stripe API timeout");
	}
}

class OutOfStockException extends RuntimeException {
	public OutOfStockException(String message){
			super(message);
	}
}

class OrderProcessingException extends RuntimeException {
	public OrderProcessingException(String message, Throwable cause) {
		super(message, cause);
	}
}

public class OrderService {

	void processOrder (String name, int quantity, double price) {
		System.out.println("\n*** Initializing Order: " + name + " ***");
		try {
			if (quantity > 10) {
			throw new OutOfStockException("Required quantity (" + quantity + ") More Than Available Stock");	
		}
		if (quantity <= 0 ) {
			throw new IllegalArgumentException("Quantity should be greater than ZERO");
		}

		PaymentGateway paymentDeduct = new Stripe();
		paymentDeduct.charge(price * quantity);
		System.out.println("Payment Successful");

		}
		catch (IllegalArgumentException e) {
			System.out.println("Invalid Argument: " + e.getMessage());
		} 
		catch (OutOfStockException e) {
			System.out.println("Inventory Error " + e.getMessage());
		}
		
		catch (Exception e){
			throw new OrderProcessingException("Payment Processing Failed", e);
		}
		finally {
			System.out.println("==AUDIT: Checkout process end for item: " + name +"==");
		}
	}

	public static void main (String[] args) {
		OrderService service = new OrderService();
		try {
			service.processOrder("Shoes", -5, 500);
			service.processOrder("Shirt", 12, 5500);
			service.processOrder("Mobile", 2, 65000);
		}
		catch (OrderProcessingException e){
			System.err.println("\nCRITICAL SYSTEM ALERT");
			System.err.println("Business reason: " + e.getMessage());
			System.err.println("Technical root cause: " + e.getCause().getMessage());
		}

		try {
			service.processOrder("Laptop", 1, 78000);
		}
		catch (OrderProcessingException e){
			System.err.println("Laptop Order failed :" + e.getMessage());
		}
		
	}
}