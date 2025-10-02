import java.util.Scanner;

public class Reverse {

    public static int reverse(int num) {
        int res = 0;
        int main = num;

        while(num>0) {
            res = res * 10;
            res += num%10;
            num /= 10;
        }

        return res;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int res = reverse(num);

        System.out.println("Reverse of " + num + " is " + res);
    }
}