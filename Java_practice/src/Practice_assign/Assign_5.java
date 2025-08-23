package Practice_assign;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Four_wheeler extends Vehicle {
    void type() {
        System.out.println("This is a four wheeler");
    }
}

class Petrol_Four_Wheeler extends Four_wheeler {
    void fuel() {
        System.out.println("Runs on Petrol");
    }
}

class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_Wheeler {
    void seats() {
        System.out.println("It has 5 seats");
    }
}

class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler {
    void model() {
        System.out.println("Model name: Baleno");
    }
}

public class Assign_5 {
    public static void main(String[] args) {
        Baleno_FiveSeater_Petrol_Four_Wheeler obj = new Baleno_FiveSeater_Petrol_Four_Wheeler();
        obj.start();
        obj.type();
        obj.fuel();
        obj.seats();
        obj.model();
    }
}
