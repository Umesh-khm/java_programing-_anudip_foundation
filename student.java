 class student {
    // Data members
    String name;
    int age;

    // Parameterized Constructor
     student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        
        student s1 = new student("arya", 20);
        student s2 = new student("Namit", 22);
        student s3 = new student("Riya", 21);

        s1.display();
        System.out.println("----");
        s2.display();
        System.out.println("----");
        s3.display();
       
    }
}
