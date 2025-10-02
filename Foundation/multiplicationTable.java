import java.util.Scanner;

public class multiplicationTable {

    public static void multiTable(int num) {

        for (int i = 1; i<=10; i++) {
            System.out.println(num + " *  " + i + " = " + num*i);
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        multiTable(num);
    }
}