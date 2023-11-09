package lv.acodemy;

public class Methods {
    public static void main(String[] args) {

        String acodemy = "Acodemy";
        printSomeText(10, acodemy);
        printSomeText(5, "IT courses!");

        System.out.println(calculateSumOfTwoNumbers(5, 5));
        int sumOfTwoNumbers = calculateSumOfTwoNumbers(10, 20);
        System.out.println(sumOfTwoNumbers);

        printInfo("Alyona", "Vasjuchecnko", 39);

    }

    public static void printSomeText(int loopCount, String text) {
        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);
        }
    }

    public static int calculateSumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void printInfo(String firstName, String secondName, int age) {
        if (firstName.equals("John")) {
            System.out.println("You are fool!");
        } else {
            System.out.printf("My name is %s. My secondName is %s. I am %d years old.\n",
                    firstName, secondName, age);
        }
    }

}
