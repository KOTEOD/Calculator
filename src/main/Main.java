package main;

import additions.ArabicNumbers;
import additions.RomanNumerals;
import exceptions.CalcException;
import exceptions.Exception1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));
    }

    public static String calc(String input) {
        if (Pattern.compile("\\b([1-9]|10)\\s*([-+*/])\\s*([1-9]|10)\\b").matcher(input).matches()) {
            ArabicNumbers arabicNumbers = new ArabicNumbers();
            arabicNumbers.setStringArabicNumbers(input);
            return arabicNumbers.getStringArabicNumbers();
        } else if (Pattern.compile("([IVX]{1,10})\\s*([-+*/])\\s*([IVX]{1,10})").matcher(input).matches()) {
            RomanNumerals romanNumerals = new RomanNumerals();
            romanNumerals.setStringRomanNumbers(input);
            return romanNumerals.getStringRomanNumbers();
        } else {
            Exception1 exception1 = new Exception1();
            return exception1.inputException(input);
        }
    }
}