
public class Paytm implements UPI {

	@Override
	public void setPin(int pin) {
		System.out.println("set pin - paytm");
	}

	@Override
	public int checkBalance() {
		System.out.println("checkbalance - paytm");
		return 7890;
	}

	public void addMoney(int i) {
		System.out.println("addmoney - paytm");
	}
}
