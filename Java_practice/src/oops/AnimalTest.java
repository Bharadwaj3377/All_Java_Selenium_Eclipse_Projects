package oops;


class Animal {
    void eat(String eats) {
        System.out.println("Eats = " + eats);
    }

    void sound(String sd) {
        System.out.println("Sound = " + sd);
    }
}

class D_animal extends Animal {
    void lives(String live) {
        System.out.println("Lives in the " + live);
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        D_animal dog = new D_animal();
        System.out.println("************ Dog ************");
        dog.eat("Royal Canin");
        dog.sound("Barking");
        dog.lives("City");

        System.out.println("************ Cat ************");
        D_animal cat = new D_animal();
        cat.eat("Fish");
        cat.sound("Meow");
        cat.lives("City");

        System.out.println("************ Cow ************");
        D_animal cow = new D_animal();
        cow.eat("Grass");
        cow.sound("Moo");
        cow.lives("Village");
    }
}




