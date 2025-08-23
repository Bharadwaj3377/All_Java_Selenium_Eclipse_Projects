package polymorphism_basic;

class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
	void sound()
	{
		System.out.println("Sound");
	}
	
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Eats=Royal canin");
	}
	void sound()
	{
		System.out.println("Sound=Barking");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("Eats=meat");
		
	}
	void sound()
	{
		System.out.println("Sound=Roaarrr");
	}
}

public class Animal_p {

	public static void main(String[] args) {
		Dog max=new Dog();
		max.eat();
		max.sound();
		
		Tiger sher=new Tiger();
		sher.eat();
		sher.sound();

	}

}
