
public class SubClassOne extends Calculator {
	public static void main(String[] args) {
		SubClassOne one = new SubClassOne();
		float result = one.calculate(10, 20, 30);
		System.out.println("Result: " + result);
		
	}

//	@Override
//	float calculate(int a, int b) {
//		return a * b;
//	}

	float calculate(int a, int b, int c) {
		return a * b * c;
	}

@Override
boolean login(String userID, String password) {
	return false;
}

}
