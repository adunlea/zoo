/**
 * 
 */
package zoo.animals;

/**
 * @author ad186076
 *
 */
public class Dog extends Animal {

	/**
	 * @param name
	 */
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void Speak() {
		System.out.println("My name is " + this.name + " and I am a dog.");
	}

}
