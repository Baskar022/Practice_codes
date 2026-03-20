class Route {
	public double calculateCost (double distance){
	return (distance * 10);
	}
}

class OceanicRoute extends Route {
	@Override
	public double calculateCost (double distance) {
	return (distance * 15);
	}
}

class CoastalRoute extends Route {
	@Override
	public double calculateCost (double distance) {
	return (distance * 5);
	}
}

public class InvoiceService {
	public static double generateInvoice (Route route, double distance) {
	return route.calculateCost(distance);
	}

	public static void main () {
	Route byOcean = new OceanicRoute();
	Route byCoast = new CoastalRoute();

	System.out.println("Invoiced Cost as per Oceanic route: " + generateInvoice(byOcean, 580.5));
	System.out.println("Invoiced Cost as per Coastal route: " + generateInvoice(byCoast, 298.7));
	}
}