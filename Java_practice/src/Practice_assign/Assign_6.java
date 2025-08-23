package Practice_assign;

class Hospital {
    String hospitalName = "City Hospital";
    String location = "Bangalore";

    void showHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
    }
}

class Patient extends Hospital {
    String patientName = "Ramesh";
    int age = 45;

    void showPatientDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
    }
}

public class Assign_6 {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.showHospitalDetails(); // Access method from Hospital class
        p.showPatientDetails();  // Access method from Patient class
    }
}
