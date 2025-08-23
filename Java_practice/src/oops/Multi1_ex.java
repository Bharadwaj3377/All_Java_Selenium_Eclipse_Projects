package oops;

class Hospital {
    void type(String name) {
        System.out.println("Super speciality : " + name);
    }
}

class Doctor extends Hospital {
    void doctor(String dname) {
        System.out.println("Type of Doctor : " + dname);
    }
}

class Gynac extends Doctor {
    void deliverytype(String dty) {
        System.out.println("Delivery type : " + dty);
    }
}

class Endo extends Doctor {
    void treatment(String t) {
        System.out.println("Treatment type : " + t);
    }
}

class Cardiac extends Doctor {
    void heartSurgery(String hs) {
        System.out.println("Heart surgery type : " + hs);
    }
}

class Operation extends Cardiac {
    void prepareForOperation(String opt) {
        System.out.println("Get ready for operation : " + opt);
    }
}

class OPD extends Cardiac {
    void OPDtype(String opd) {
        System.out.println("OPD type : " + opd);
    }
}

class Accountant extends Hospital {
    void collectBill(String bill) {
        System.out.println("Collect bill : " + bill);
    }
}

class Payments extends Accountant {
    void paymentDetails(String dt) {
        System.out.println("Verify payment details : " + dt);
    }
}

class Documentation extends Accountant {
    void document(String doc) {
        System.out.println("Take documentation : " + doc);
    }
}

class Nurse extends Doctor {
    void nurseName(String nname) {
        System.out.println("Nurse name : " + nname);
    }
}

public class Multi1_ex {
    public static void main(String[] args) {

        System.out.println("---- Gynac Doctor ----");
        Gynac gyn = new Gynac();
        gyn.type("Mother Care Hospital");
        gyn.doctor("Gynaecologist");
        gyn.deliverytype("C-Section");

        System.out.println("\n---- Endocrinologist ----");
        Endo endo = new Endo();
        endo.type("Endocrine Clinic");
        endo.doctor("Endocrinologist");
        endo.treatment("Diabetes Treatment");

        System.out.println("\n---- Cardiac ----");
        Cardiac cardiac = new Cardiac();
        cardiac.type("Heart Care Hospital");
        cardiac.doctor("Cardiologist");
        cardiac.heartSurgery("Bypass");

        System.out.println("\n---- Operation Department ----");
        Operation op = new Operation();
        op.type("Cardiology Dept");
        op.doctor("Heart Surgeon");
        op.heartSurgery("Valve Replacement");
        op.prepareForOperation("Sterilization");

        System.out.println("\n---- OPD ----");
        OPD opd = new OPD();
        opd.type("General Ward");
        opd.doctor("Consulting Doctor");
        opd.heartSurgery("Checkup Review");
        opd.OPDtype("Morning Shift");

        System.out.println("\n---- Accounts ----");
        Accountant acc = new Accountant();
        acc.type("Billing Dept");
        acc.collectBill("INR 5000");

        System.out.println("\n---- Payments ----");
        Payments pay = new Payments();
        pay.type("Accounts Dept");
        pay.collectBill("INR 8000");
        pay.paymentDetails("UPI/Online");

        System.out.println("\n---- Documentation ----");
        Documentation doc = new Documentation();
        doc.type("Records Room");
        doc.collectBill("INR 4500");
        doc.document("Discharge Summary");

        System.out.println("\n---- Nurse ----");
        Nurse nurse = new Nurse();
        nurse.type("ICU");
        nurse.doctor("Assistant Nurse");
        nurse.nurseName("Sister Mary");
    }
}
