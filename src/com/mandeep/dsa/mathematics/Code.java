package com.mandeep.dsa.mathematics;


import static java.lang.Math.floor;
import static java.lang.Math.log10;

public class Code {

    //count digits in a number
    public int countDigitsIterative(int n){
        int count=0;
        while(n!=0){
            n/=10;
            ++count;
        }
        return count;
    }

    public int countDigitsRecursive(int n){
        if (n==0)
            return 0;
        return 1 + countDigitsRecursive(n/10);
    }

    public int countDigitsLogarithmic(int n){
        return (int)floor(log10(n)+1);
    }

    //Palindrome Number
    public boolean isPalindrome(int n){
        int rev=0;
        int temp=n;
        while(temp!=0){
            int lastdigit=temp%10;
            rev=rev*10+lastdigit;
            temp=temp/10;
        }
        return (rev==n);
    }
}
