
public class PhonePay implements UPI {

	@Override
	public void setPin(int pin) {
		System.out.println("set pin - phonepay");

	}
	
	public void payToScan() {
		System.out.println("scan - phonepay");
	}

	@Override
	public int checkBalance() {
		System.out.println("check balance - phonepay");
		return 2000;
	}

}
