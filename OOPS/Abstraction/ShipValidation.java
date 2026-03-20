abstract class ValidationService {
	
	public void validationProcess(boolean status, double quantity){
	System.out.println("SYSTEM: Audit Started");
	validate(status,quantity);
	System.out.println("SYSTEM: Audit Complete");
	}
	abstract void validate(boolean status, double quantity);
}

class CargoShip extends ValidationService {
	@Override
	void validate(boolean check, double weight) {
		String statusCustom = (check == true)?("Customs Clear"):("Customs Failed");
		System.out.println(statusCustom);
		String statusWeight = (weight <= 5000)?("Weight Clear"):("Weight Failed");
		System.out.println(statusWeight);
	}
}

class PassengerShip extends ValidationService {
	@Override
	void validate(boolean passportClear, double lifeboats) {
		String statusPassport = (passportClear == true)?("Passport Clear"):("Passport Failed");
		System.out.println(statusPassport);
		String statusLifeboat = (lifeboats >= 50)?("Sufficient Lifeboats Clear"):("Sufficient Lifeboats Failed");
		System.out.println(statusLifeboat);
	}
}

public class ShipValidation {
	public static void toValidate(ValidationService type, boolean status, double quantity){
		type.validationProcess(status, quantity);
	}
	public static void main(String[] args) {
		ValidationService cargo = new CargoShip();
		ValidationService passen = new PassengerShip();

		toValidate(cargo, true, 4500);
		toValidate(passen, false, 40);
	}
}