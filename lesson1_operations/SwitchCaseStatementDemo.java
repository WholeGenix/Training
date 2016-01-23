/**
 * 
 */
package lesson1_operations;

/**
 * @author Cristian
 *
 */
public class SwitchCaseStatementDemo {

	/**
	 * 
	 */
	public SwitchCaseStatementDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20, c = 30;
		int status = -1;
		if (a > b && a > c) {
			status = 1;
		} else if (b > c) {
			status = 2;
		} else {
			status = 3;
		}
		
		switch (status) {
		case 1:
			System.out.println("a is the greatest");
			break;
		case 2:
			System.out.println("b is the greatest");
			break;
		case 3:
			System.out.println("c is the greatest");
			break;
		default:
			System.out.println("Cannot be determined");
		}
	}

}
