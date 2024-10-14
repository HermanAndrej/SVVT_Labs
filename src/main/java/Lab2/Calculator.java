package Lab2;

import java.sql.Array;
import java.util.Arrays;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public int factorial(int a) {
        int result = 1;
        for(int i = a; i > 0; i--){
            result = result * i;
        }
        return result;
    }

    public String[] stringToArrayOfWords(String s) {
        if(s == null) {
            return null;
        }
        String[] arr = new String[100];
        arr = s.split(" ");
        return arr;
    }

    public int[] sort(int[] arr){
        if(arr.length == 0) {
            return arr;
        }
        Arrays.sort(arr);
        return arr;
    }
}


