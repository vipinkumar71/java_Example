import java.util.Scanner;

public class Bank_application {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter Operation");
        System.out.println("1:Take money");
        System.out.println("2:Put money to your balance");
        System.out.println("3:To Exit");
        int operation =sc.nextInt();
        while(true){
            if(operation ==1){
                System.out.println("Enter balance");
                int balance= sc.nextInt();
                System.out.println("Enter money that you want to take");
                int money = sc.nextInt();
                if(money>balance){
                    System.out.println("You can not do this operation");
                }
                else{
                    System.out.println("You got your money: "+ money);
                }
            }else if (operation == 2){
                System.out.println("Enter your balance");
                int balance = sc.nextInt();
                System.out.println("Enter money that you want to put");
                int put= sc.nextInt();
                System.out.println("your current balance is: "+ (put+balance));
            }
            else if ( operation == 3){
                System.out.println("Exit");
                System.out.println("Please enter operation");
                int restart = sc.nextInt();
            }

        }

    }
}
