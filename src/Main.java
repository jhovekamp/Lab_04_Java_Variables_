java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 1;
        int intOperandB = 4;
        int intSum = 6; //addition
        int intProduct = 8; //multiplication
        int intDifference = 10; //substraction
        int intQuotient = 12; //division
        int intModulo = 14; //remainder
        double doubleOperandA = 1.00;
        double doubleOperandB = 4.00;
        double doubleSum = 6.00;
        double doubleProduct = 8.00;
        double doubleDifference = 10.00;
        double doubleQuotient = 12.00;

        // Ints
        intSum = intOperandA + intOperandB;//assignment that uses the arithmentic operator +
        System.out.println("The sum of the ints " + intOperandA + " & " + intOperandB + " is " + intSum);//output statement

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of the ints " + intOperandA + " & " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of the ints " + intOperandA + " & " + intOperandB + " is " +intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of the ints " + intOperandA + " & " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA - intOperandB;
        System.out.println("The remainder of the ints " + intOperandA + " & " + intOperandB + " is " + intModulo);

        //Doubles

        doubleSum = doubleOperandA + doubleOperandB;//assignment that uses the arithmentic operator +
        System.out.println("The sum of the doubles " + doubleOperandA + " & " + doubleOperandB + " is " + doubleSum);//output statement

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of the doubles " + doubleOperandA + " & " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of the doubles " + doubleOperandA + " & " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of the doubles " + doubleOperandA + " & " + doubleOperandB + " is " + doubleQuotient);

        //Variables
        double myLunchCost = 12.50;
        System.out.println("The cost of my lunch is: " + myLunchCost);

        int kidsInFam = 3;
        System.out.println("The number of kids in my family is: " + kidsInFam);

        boolean isRaining = false;
        System.out.println("Is it raining? " + isRaining);

        double gasPrice = 3.20;
        System.out.println("The cost of gallon of gas is: " + gasPrice);

        int favNum = 25;
        System.out.println("My favorite number is: " + favNum);

        double shoeSize = 9.5;
        System.out.println("My shoe size is: " + shoeSize);

        int birthMonth = 12;
        System.out.println("My birth month is: " + birthMonth);

        String user = "Jenni";
        String lastName = "Hovekamp";
        String fullName = user + " " + lastName;
        System.out.println("My full name is: " + fullName);

    }
}