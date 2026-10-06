public class school3 {
    public static void main(String[] args) {
        Student s1 = new Student("Chakri",19,7,'O');
        Student s2 = new Student("Mkdir",19,29,'A');
        Teacher t1 = new Teacher("Kandal Rao",45,"Java",1000000);
        Teacher t2 = new Teacher("pedda",50,"DATA STRUCTURES",1200000);//karun

        Person[] people = {s1, s2, t1, t2};

        for (Person p : people) {
            p.DisplayDetails();  
        }
    }
}

class Person {
    private String Name;
    private int Age;

    public void DisplayDetails() {
        System.out.println("----------------------");
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
    }

    Person(String Name, int age) {
        this.Name = Name;
        this.Age = age;
    }
};

class Student extends Person {
    private int rollno;
    private char grade;

    Student(String Name, int age, int rollno, char grade) {
        super(Name, age);
        this.rollno = rollno;
        this.grade = grade;
    }

    @Override
    public void DisplayDetails() {
        System.out.println("---------------");
        super.DisplayDetails();
        System.out.println("RollNo." + rollno);
        System.out.println("Grade:" + grade);

    }
};

class Teacher extends Person {
    private String Subject;
    private int Salary;

    Teacher(String Name, int age, String Subject, int Salary) {
        super(Name, age);
        this.Subject = Subject;
        this.Salary = Salary;

    }

    @Override
    public void DisplayDetails() {
        System.out.println("----------------");
        super.DisplayDetails();
        System.out.println("Subject:" + Subject);
        System.out.println("Salary:" + Salary);
    }
}
