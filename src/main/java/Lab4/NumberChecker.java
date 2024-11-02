package Lab4;

public class NumberChecker {

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public int fibonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        if(n == 1 || n == 2) {
            return 1;
        }

        for(int i = 1; i < n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }
}
