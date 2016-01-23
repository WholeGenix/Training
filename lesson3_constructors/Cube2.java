/**
 * 
 */
package lesson3_constructors;

/**
 * @author Cristian
 *
 */
public class Cube2 {
	int length;
	int breadth;
	int height;
	/**
	 * 
	 */
	public Cube2() {
		// TODO Auto-generated constructor stub
		length = 10;
		breadth = 10;
		height = 10;
	}
	Cube2(int l, int b) {
		this(l, b, 10);
		System.out.println("Finished with Parameterized Constructor having 2 params");
	}
	Cube2(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}
	
	public int getVolume() {
		return (length * breadth * height);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube2 cubeObj1, cubeObj2;
		cubeObj1 = new Cube2();
		cubeObj2 = new Cube2(10, 20);
		System.out.println("Volume of Cube1 is : " + cubeObj1.getVolume());
		System.out.println("Volume of Cube2 is : " + cubeObj2.getVolume());
	}

}
