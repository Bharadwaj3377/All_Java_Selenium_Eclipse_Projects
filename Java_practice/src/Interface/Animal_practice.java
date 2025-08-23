package Interface;

interface Animal
{
	String name="Animal.family";
	String name1="Animal family";
	int a=10;
	void eat();
	void sound();
   default void show()
	{
		System.out.println("Hello");
	}
	
	
}
class Dog implements Animal
{
	public void eat()
	{
		System.out.println("Royal canin");
	}
	public void sound()
	{
		System.out.println("Barking");
	}
}


public class Animal_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Dog max=new Dog();
             max.eat();
             max.sound();
	}

}
