package oops;

class After12th {
    void showCourses() {
        System.out.println("Available streams after 12th: Engineering, Medical, Other Courses");
    }
}

class Engineering extends After12th {
    void engCourses() {
        System.out.println("Engineering Courses: IT, Mechanical, CS");
    }
}

class IT extends Engineering {
    void courseName() {
        System.out.println("Course: IT Engineering");
    }
}

class Mechanical extends Engineering {
    void courseName() {
        System.out.println("Course: Mechanical Engineering");
    }
}

class CS extends Engineering {
    void courseName() {
        System.out.println("Course: Computer Science Engineering");
    }
}

class Medical extends After12th {
    void medCourses() {
        System.out.println("Medical Courses: MBBS, BDS");
    }
}

class MBBS extends Medical {
    void courseName() {
        System.out.println("Course: MBBS");
    }
}

class BDS extends Medical {
    void courseName() {
        System.out.println("Course: BDS");
    }
}

class OtherCourses extends After12th {
    void otherCourses() {
        System.out.println("Other Courses: BBA, BCA");
    }
}

class BBA extends OtherCourses {
    void courseName() {
        System.out.println("Course: BBA");
    }
}

class BCA extends OtherCourses {
    void courseName() {
        System.out.println("Course: BCA");
    }
}

public class CareerOptions {

    public static void main(String[] args) {
        // Engineering Branches
        IT it = new IT();
        it.showCourses();
        it.engCourses();
        it.courseName();

        System.out.println();

        Mechanical mech = new Mechanical();
        mech.courseName();

        System.out.println();

        CS cs = new CS();
        cs.courseName();

        System.out.println();

        // Medical Branches
        MBBS mbbs = new MBBS();
        mbbs.medCourses();
        mbbs.courseName();

        System.out.println();

        BDS bds = new BDS();
        bds.courseName();

        System.out.println();

        // Other Courses
        BBA bba = new BBA();
        bba.otherCourses();
        bba.courseName();

        System.out.println();

        BCA bca = new BCA();
        bca.courseName();
    }
}
