public class Main
{
	public static void main(String[] args) {
		Offering offering = new Icecream();
		offering = new Rum(offering);
		offering = new Gin(offering);
		System.out.println(offering.getname() + " = " + offering.price());
		
	}
}
