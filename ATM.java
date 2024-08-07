import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        int pin=2553;
        int balance=10000;
        int add_amount=0;
        int take_amount=0;
        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your pin number:");
        int password=input.nextInt();
        if(password==pin){
            System.out.println("Enter your name :");
            name=input.next();
            System.out.println("welcome "+name);
            while (true){
                System.out.println("press 1 to check your balance");
                System.out.println("press 2 to add a amount");
                System.out.println("press 3 to take a amount");
                System.out.println("press 4 to take recipt");
                System.out.println("press 5 to EXIT");
                System.out.println("click any option");
                int option=input.nextInt();
                switch(option) {
                    case 1:
                        System.out.println("your balance is " + balance);
                        break;
                    case 2:
                        System.out.println("how much amount did you add your account");
                        add_amount = input.nextInt();
                        System.out.println("sucessfully credited");
                        balance = balance+ add_amount;
                        break;
                    case 3:
                        System.out.println("how much amount did you taken in your account");
                        take_amount = input.nextInt();
                        if (take_amount>balance) {
                            System.out.println("your balance is insufficnet");
                            System.out.println("try less than your available balance ");
                        } else {
                            System.out.println("successfully taken your amount");
                            balance = balance - take_amount;
                        }
                        break;
                    case 4:
                        System.out.println("welcome to canara bank ATM");
                        System.out.println("avaiable balance:" + balance);
                        System.out.println("amount credit:" + add_amount);
                        System.out.println("amount taken:" + take_amount);
                        System.out.println("Thank for coming");
                        break;
                }
                if (option==5){
                    System.out.println("Thank you");
                    break;
                }

            }
        }
        else
        {
            System.out.println("wrong pin");
        }
    }
}