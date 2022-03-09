import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Exam result");
        int examResult = sc.nextInt();
        switch(examResult){
            case 50:
                System.out.println("You got D degree");
             break;
            case 60:
                System.out.println("You got C degree");
              break;
            case 75:
                System.out.println("You got B degree");
               break;
            case 90:
                System.out.println("You got A degree");
             break;
        }
    }
}
