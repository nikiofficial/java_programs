import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		System.out.println("Enter your mode of payment");
		Scanner scanner = new Scanner(System.in);
		String paymentMode = scanner.next();
		UPI payMode = null;
		if (paymentMode.equalsIgnoreCase("gpay")) {
			payMode = new Gpay();
		} else if (paymentMode.equalsIgnoreCase("phonepay")) {
			payMode = new PhonePay();
		} else if (paymentMode.equalsIgnoreCase("paytm")) {
			payMode = new Paytm();
		}

		if (payMode != null) {
			if (payMode instanceof Gpay) {
				Gpay gpay = (Gpay) payMode;
				gpay.fingerPrint();
				gpay.setPin(5);
			} else if (payMode instanceof PhonePay) {
				PhonePay phonepay = (PhonePay) payMode;
				phonepay.setPin(1010);
				phonepay.payToScan();
			} else if (payMode instanceof Paytm) {
				Paytm paytm = (Paytm) payMode;
				paytm.setPin(1234);
				paytm.addMoney(10000);
			}
			payMode.checkBalance();
		} else {
			System.out.println("error");
		}

	}
}