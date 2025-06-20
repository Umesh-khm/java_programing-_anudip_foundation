class Student {
    int marks = 75;

    void showMarks() {
        System.out.println("Student's marks: " + marks);
    }
}

class ExamStudent extends Student {
    int extraMarks = 10;

    @Override
    void showMarks() {
        super.showMarks(); // Call the parent class version
        System.out.println("Extra marks for project: " + extraMarks);
        System.out.println("Total marks: " + (marks + extraMarks));
    }
}

public class SuperMain {
    public static void main(String[] args) {
        ExamStudent e = new ExamStudent();
        e.showMarks();
    }
}
