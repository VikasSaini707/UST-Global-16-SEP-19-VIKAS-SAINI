package Oct_23;

public class BMW implements AutoMobile,AutoMobileWithAbs {

	@Override
	public int gear() {
		System.out.println("gear() method of BMW");
		return 0;
	}

	@Override
	public void gps() {
		System.out.println("gps() method of BMW");
		
	}

	@Override
	public void abs() {
		System.out.println("abs() method of abs");
		
	}

}
