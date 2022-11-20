package com.mandeep.dsa;

import com.mandeep.dsa.mathematics.Code;

public class Main {
    public static void main(String[] args) {

        Code maths = new Code();

        int num=123456;

        int a = maths.countDigitsIterative(num);
        System.out.println(a);

        int b = maths.countDigitsRecursive(num);
        System.out.println(b);

        int c = maths.countDigitsLogarithmic(num);
        System.out.println(c);

        boolean d=maths.isPalindrome(123321);
        System.out.println(d);
    }
}