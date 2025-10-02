import java.util.Scanner;

public class fib {

    public static void fib(int num) {

        int first = 0, second = 1;
        System.out.println(first + " ");
        System.out.println(second + " ");

        for(int i = 1; i<num; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.println(second + " ");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        fib(num);
    }
}