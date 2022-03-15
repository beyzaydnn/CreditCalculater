
public class Application {

	private Credit[] credits;
	
	
	public Application(Credit[] credits) {
		
		this.credits = credits;
		
	}
	
	void customerApplication(double price,int year) {
		if(credits.length == 0) {
			System.out.println("lütfen kredi türü giriniz!");
		}
		else {
			for(Credit credit :credits) {
				credit.calculate(price, year);
			}
		}
	}
	
}
