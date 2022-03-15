
public class CarCreditManager implements Credit {
	
	@Override
	public void calculate(double price, int year) {
		double totalPrice = price + price*year*(0.18);
		
		System.out.println(" Car Credit Price is : " + totalPrice);
	}
}
