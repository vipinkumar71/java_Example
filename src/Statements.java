import java.util.Scanner;

public class Statements {
    public static void main(String[] args){
        // java statements;
        // if
        // else
        // else if

        // if statement

//         int a = 3;
//        if(a>4){
//            System.out.println("This number is bigger than 4");
//            System.out.println("This is false block");
//        } // block
//        if(a<100){
//            System.out.println("This is true block");
//            System.out.println("Hello world");
//        }

        // if else statements

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter a number");
//        int a = sc.nextInt();
//
//        if(a<50){
//            System.out.println("Your number is smaller than fifty");
//        }
//
//        else if (a>90){
//            System.out.println("Your number is bigger than 90");
//        }
//        else{
//            System.out.println("Your number is bigger than fifty");
//        }
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your first Exam result");
        int firstResult = sc.nextInt();
        System.out.println("Second result");
        int SecondResult = sc.nextInt();

        if (firstResult>50 && SecondResult>30){
            System.out.println("You got college degree");
        }
        if(firstResult>50 || SecondResult>60){
            System.out.println("You got college degree");
        }

// for && and operator both condition have to be true
// for || or operator only one of them is true, we can enter in this statement
        else{
            System.out.println("You can not get college degree ");
        }
    }
}
