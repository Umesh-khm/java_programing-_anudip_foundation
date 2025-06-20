class Printer {
    void print(String text) {
        System.out.println("Text: " + text);
    }

    void print(String text, int copies) {
        for (int i = 1; i <= copies; i++) {
            System.out.println("Copy " + i + ": " + text);
        }
    }
}

public class OverloadingMain {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Hello");           // Calls method with 1 argument
        p.print("Hello", 3);        // Calls method with 2 arguments
    }
}
