class Student {
    private String name;
    private int age;

    // Setter methods
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class NcapsulationMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Umesh");
        s1.setAge(19);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
