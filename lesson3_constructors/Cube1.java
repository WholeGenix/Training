/**
 * 
 */
package lesson3_constructors;

/**
 * @author Cristian
 *
 */
public class Cube1 {
	int length;
	int breadth;
	int height;
	/**
	 * 
	 */
	public Cube1() {
		// TODO Auto-generated constructor stub
		length = 10;
		breadth = 10;
		height = 10;
	}
	Cube1(int l, int b, int h) {
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
		Cube1 cubeObj1, cubeObj2;
		cubeObj1 = new Cube1();
		cubeObj2 = new Cube1(10, 20, 30);
		System.out.println("Volume of Cube1 is : " + cubeObj1.getVolume());
		System.out.println("Volume of Cube1 is : " + cubeObj2.getVolume());
	}

}
