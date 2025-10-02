import java.util.Scanner;

public class Calculator {

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of numbers to be added :");
        int total = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < total; i++) {
            int a = sc.nextInt();
            sum += a;
        }

        System.out.println("Total sum of " +total + "numbers are :" + sum);
    }

    public static void sub() {

    }

    public static void mult() {

    }

    public static void div() {

    }

    public static void main(String args[]) {
        
        int choice = 0;

        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("Enter choice :");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    add();
                    break;

                case 2:
                    sub();
                    break;
                
                case 3:
                    mult();
                    break;
                
                case 4:
                    div();
                    break;
                case 5:
                    break;
                
                default:
                    System.out.println("Invalid choice ");
            }
        } while (choice != 5);

    }
}