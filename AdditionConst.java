public class AdditionConst {
    int num1, num2, sum;

    // Constructor 
    AdditionConst(int a, int b) {
        num1 = a;
        num2 = b;
        sum = num1 + num2;
    }

    
    void display() {
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
    
        Addition obj = new Addition(25, 15);
        obj.display();
    }
}
