public class ArrayExample {
    public static void main(String[] args) {
        int[] marks = new int[5];

        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 78;
        marks[3] = 92;
        marks[4] = 88;

        for(int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i+1) + " Marks: " + marks[i]);
        }
    }
}
