package oops;

public class Family {
//inheritance practice;

	// Parent class
	class Mohan {
	    void surname() {
	        System.out.println("Sharma");
	    }

	    void flat() {
	        System.out.println("2BHK flat");
	    }

	    void car() {
	        System.out.println("Baleno car");
	    }
	}

	// Child class
	class Soham extends Mohan {
	    void bike() {
	        System.out.println("Pulsar");
	    }

	    void job() {
	        System.out.println("Automation tester");
	    }
	}

	// Main class
public class Family {
	    public static void main(String[] args) {
	        Soham son = new Soham();
	        System.out.println("Soham's Inherited and Own Properties:");
	        son.surname();  // From Mohan
	        son.flat();     // From Mohan
	        son.car();      // From Mohan
	        son.bike();     // From Soham
	        son.job();     
	    }
	}
