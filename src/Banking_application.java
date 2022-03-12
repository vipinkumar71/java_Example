import java.util.Scanner;

public class Banking_application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome banking application");
        System.out.println("Ours Operations");
        System.out.println("Click 1 to exist from System");
        System.out.println("Click 2 for money transfer");
        System.out.println("Click 3 to get money");
        int operation = sc.nextInt();
        if(operation== 1){
            System.out.println("Exiting from system");
        }
        else if (operation==2){
            System.out.println("How much money do you have?");
            int balance = sc.nextInt(); // 500
            System.out.println("How much money you want to transfer");
            int transfer = sc.nextInt();// 100
            if(balance<transfer){
                System.out.println("You can not do this operation, because your balance is not enough");
            }
            else if(balance>=transfer){
                System.out.println("You transferred " + transfer);
                System.out.println("Your current balance is: " +(balance-transfer));
            }
//            else if (balance == transfer){
//                System.out.println("You transferred " + transfer);
//                System.out.println("Your current balance is:" +(balance-transfer));
//            }
        }
        else if (operation == 3){
            System.out.println("Enter your balance");
            int balance = sc.nextInt();
            System.out.println("How much money you want to take");
            int money = sc.nextInt();
            if(balance<money){
                System.out.println("Your balance is not enough to do this operation");
            }
            else if (balance > money){
                System.out.println("You got your money " +money);
                System.out.println("Your current balance is: " +(balance - money));
            }
            else if (balance==money){
                System.out.println("You got all of your money");
            }


        }
        else{
            System.out.println("Invalid operation");
        }
    }
}
