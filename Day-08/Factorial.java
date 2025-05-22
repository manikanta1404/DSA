public class Factorial {
    static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }

    static int facto(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * facto(n - 1);
        }

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("fibnociss "+fib(n));
        System.out.println("factorial  "+facto(n));
    }
}