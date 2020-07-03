public class PatternA {
	void display(int n) {
		// Outer for loop for number of lines
		for (int i = 0; i < n; i++) {
			// Inner for loop for logic execution
			for (int j = 0; j < n; j++) {
				// prints two column lines
				if (j == 0 || j == n - 1 || i == 0 || i == n / 2)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

	// Driver Function

	public static void main(String[] args) {
		PatternA a = new PatternA();
		a.display(7);
	}
}
