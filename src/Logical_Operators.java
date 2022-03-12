import java.util.Scanner;

public class Logical_Operators {
public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter a number");
//    int number = sc.nextInt();

     //   && and
    //    != not
    //    || or

//    if(number!=5){
//        System.out.println("Your number is not 5");
//    }else{
//        System.out.println("Your number is  "+ number);
//    }

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter age");
    int age = sc.nextInt();
    if(age>18 && age<50){
        System.out.println("You are adult");
    }
    else if(age<18 ){
        System.out.println("you are not adult");
    }
  }
}
