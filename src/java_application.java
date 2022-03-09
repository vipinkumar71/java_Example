import java.util.Scanner;

public class java_application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = sc.nextInt(); //5
        System.out.println("Enter second number");
        int secondNumber = sc.nextInt(); //7
        int temp=0;
        temp= firstNumber; //5
        firstNumber = secondNumber; //7
        secondNumber = temp; //5

        System.out.println("Our first Number is "+ firstNumber);
        System.out.println("Our second Number "+ secondNumber);
    }
}
