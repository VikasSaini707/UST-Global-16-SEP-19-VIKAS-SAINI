package Oct_23;

public class Toyota implements AutoMobile,AutoMobileWithAbs {

	@Override
	public int gear() {
		System.out.println("gear() method of toyota");
		return 0;
	}

	@Override
	public void gps() {
		System.out.println("gps() method of toyota");
		
	}

	@Override
	public void abs() {
		System.out.println("abs() method of Toyota");
		
	}
	
}
