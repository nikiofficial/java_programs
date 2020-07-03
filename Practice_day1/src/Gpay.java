
public class Gpay implements UPI {

	public void fingerPrint() {
		System.out.println("fingerprint - gpay");
	}

	@Override
	public void setPin(int pin) {
		System.out.println("set pin- gpay");
	}

	@Override
	public int checkBalance() {
		System.out.println("Check balance gpay");
		return 10000;

	}

}
