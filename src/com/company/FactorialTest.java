package com.company;

/**
 * @author ：Tony.L
 * @version ：2020 Version：1.0
 * @create ：2020/11/04 18:07
 */
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(50));
        System.out.println(test(81));
        System.out.println(addDigits(81));
    }

    public static long factorial(long i) {
        return i == 1 ? i : factorial(i - 1) * i;
    }

    public static int test(int i) {
        int ret = i % 10 + i / 10;
        return ret < 10 ? ret : test(ret);
    }

    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int i  = num % 9;
        return i == 0 ? 9 : i;
    }
}
