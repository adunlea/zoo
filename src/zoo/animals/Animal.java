package zoo.animals;

public class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void Speak() {
		System.out.println("Hi! My name is " + name);
	}
}
