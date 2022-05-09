package exception;

public class exceptionDemo {

	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 0;
		int k = 0;

		try {
			k = b / c;
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception is " + ae);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Exception is " + e);
		} catch (Exception e) {
			System.out.println("Exception is " + e);
		} finally {
			System.out.println("Finally block");
		}
	}

}
