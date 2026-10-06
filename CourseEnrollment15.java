class Student {
    String name;
    int rollNo;
    String branch;
    int semester;
    String specialization;
    String thesisGuide;

    Student(String name, int rollNo, String branch, int semester) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.semester = semester;
    }

    Student(String name, int rollNo, String specialization, String thesisGuide) {
        this.name = name;
        this.rollNo = rollNo;
        this.specialization = specialization;
        this.thesisGuide = thesisGuide;
    }

    void displayUG() {
        System.out.println("UG Student");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);
    }

    void displayPG() {
        System.out.println("PG Student");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Specialization: " + specialization);
        System.out.println("Thesis Guide: " + thesisGuide);
    }
}

public class CourseEnrollment15 {
    public static void main(String[] args) {
        Student ug = new Student("Kaushal", 29, "CSM", 2);
        Student pg = new Student("Rahul", 101, "Artificial Intelligence", "Dr. Sharma");

        ug.displayUG();

        System.out.println();

        pg.displayPG();
    }
}