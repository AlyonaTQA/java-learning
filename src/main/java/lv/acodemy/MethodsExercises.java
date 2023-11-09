package lv.acodemy;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(fahrenheitConverter(120));
        System.out.println(Math.round(fahrenheitConverter(120)));

        System.out.println(currencyConverter("CZK", 50));
        System.out.println(currencyConverter("GBP", 120));

        System.out.println(isPalindrome("civic"));
        System.out.println(calculator(3, 3, "+"));
        System.out.println(ifCalculator("-", 6, 3));
    }

    public static double fahrenheitConverter(double fahrenheit) {
        return (fahrenheit - 32) / 1.80000;
    }

    public static double currencyConverter(String currency, double money) {
        double convertedAmount;
        switch (currency) {
            case "PLN":
                convertedAmount = money * 4.45;
                break;
            case "CZK":
                convertedAmount = money * 24.55;
                break;
            case "GBP":
                convertedAmount = money * 0.87;
                break;
            default:
                throw new RuntimeException("Unsupported currency: " + currency);
        }
        return convertedAmount;
    }

    public static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return (reversed.equals(word));
    }

    public static double calculator(double firstNumber, double secondNumber, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Incorrect operation");
        }
        return result;
    }

    public static double ifCalculator(String operation, double firstNumber, double secondNumber) {
        double result = 0;
        if (operation == "+") {
            result = firstNumber + secondNumber;
        } else if (operation == "-") {
            result = firstNumber - secondNumber;
        } else if (operation == "*") {
            result = firstNumber * secondNumber;
        } else if (operation == "/") {
            result = firstNumber / secondNumber;
        } else {
            System.out.println("Operation is incorrect!");
        }
        return result;
    }
}


    /*
    1. Create currency converter from X currency to EUR (https://www.bank.lv/statistika/dati-statistika/valutu-kursi/aktualie)
    2. Create Fahrenheit to Celsius formula (F - 32 / 1.80000)
    3. Create simple calculator method
    4. Check if word is Palindrome (civic, radar, level)
     */

