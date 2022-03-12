import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] arg){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int firstNumber =sc.nextInt();
        System.out.println("Enter Second Number:");
        int secondNumber= sc.nextInt();
        int temp=0;
        temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;//5
        System.out.println("our first Number is:" +firstNumber);
        System.out.println("our second number is :" + secondNumber);
    }
}
