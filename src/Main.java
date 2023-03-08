import java.util.Scanner;

public class Main {
    private static Scanner input;
    private static int n;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        n = input.nextInt();
        logic();
    }

    public static void program(FizzBuzz code) {
        System.out.print(code.word);
    }

    private static void logic() {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                program(new FizzBuzz("FizzBuzz "));
            } else if (i % 3 == 0) {
                program(new Fizz("Fizz "));
            } else if (i % 5 == 0) {
                program(new Buzz("Buzz "));
            } else {
                System.out.print(i + " ");
            }
        }
    }
}