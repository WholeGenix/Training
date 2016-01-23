/**
 * 
 */
package lesson2_methods;

/**
 * @author Cristian
 *
 */
public class Cube {
	int length = 10;
	int breadth = 10;
	int height = 10;
	
	/**
	 * 
	 */
	public Cube() {
		// TODO Auto-generated constructor stub
	}
	public int getVolume() {
		return (length * breadth * height);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cubeObj; // Creates a Cube Reference
		cubeObj = new Cube(); // Creates an Object of Cube
		System.out.println("Volume of Cube is : " + cubeObj.getVolume());
	}

}
