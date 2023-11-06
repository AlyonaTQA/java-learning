package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("This is Variables.java file");

        // int (number)
        int myCurrentAge = 39;
        System.out.println(myCurrentAge);

        /*
        This is
        multi line
        comment approach
        TODO Delete it later
         */

        byte myWeight = 55; // byte data type
        short salary = 2000; // short data type
        char myFirstLetterOfName = 'A'; // char data type
        long populationOfLatvia = 1900000; // long data type

        double numberPi = Math.PI; // PI number
        float randomNumber = 313813.23131313f;

        // Boolean true/false is, has
        // Example: isSummer, isAdult

        boolean isSummer = false;
        boolean isAutumn = true;

        // Exercise 1.
        //Create 2 variables for each data type
        //Variable should be meaningful as it possible
        //Variable name should contain at least 2 word
        //Lower camel case
        //Print all the variables values

        int x, y, z;
        x = 10;
        y = 4;
        z = 8;

        int summa = x + y + z;
        System.out.println(summa);

        int summaExample = 10 + 5 + 2 + x + y + z;
        System.out.println(summaExample);

        //2a(a + b); result
        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
        System.out.println(result);

        int remainder = 10 % 3;
        System.out.println(remainder);

        String firstName = "Alyona";
        String lastName = "Vasjuchenko";

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.printf("My full name is: %s %s\n", firstName, lastName);

        System.out.println("Hello World");
    }
}
