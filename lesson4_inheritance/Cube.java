/**
 * 
 */
package lesson4_inheritance;

/**
 * @author Cristian
 *
 */
class Cube {
	int length;
	int breadth;
	int height;
	
	/**
	 * 
	 */
	Cube() {
		this(10, 10);
		System.out.println("Finished with Default Constructor of Cube");
	}
	Cube(int l, int b) {
		this(l, b, 10);
		System.out.println("Finished with Parameterized Constructor having 2 params of Cube");
	}
	Cube(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
		System.out.println("Finished with Parameterized Constructor having 3 params of Cube");
	}
	public int getVolume() {
		return (length * breadth * height);
	}

}