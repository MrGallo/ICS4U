class Course {
    String name;
    int gradeLevel;
}


class Student {
    String name;
    int grade;
    double[] marks;
}


class Section {
    Course subject;
    int room;
    Student[] classList;
}


public class ClassesPractice1 {
    public static void main(String[] args) {

        // create a section object, assign it to a variable
        Section compSci = new Section();
        compSci.room = 119;
        System.out.println("compSci.room = " + compSci.room);

        // create a course object
        Course computerStudies = new Course();
        computerStudies.name = "Introduction to Computer Studies";
        computerStudies.gradeLevel = 10;

        // assign it to the section object's subject field
        compSci.subject = computerStudies;
        System.out.println("compSci.subject.name = " + compSci.subject.name);
        System.out.println("compSci.subject.gradeLevel = " + compSci.subject.gradeLevel);

        // Initialize the section's classList array
        compSci.classList = new Student[3];

        // Create three student objects, assign them to the classList array.
        compSci.classList[0] = new Student();
        compSci.classList[1] = new Student();
        compSci.classList[2] = new Student();

        compSci.classList[0].name = "Frank Smith";
        compSci.classList[0].grade = 10;
        System.out.println("compSci.classList[0].name = " + compSci.classList[0].name);
        System.out.println("compSci.classList[0].grade = " + compSci.classList[0].grade);

    }
}
