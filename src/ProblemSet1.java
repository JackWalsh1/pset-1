/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

 //Any abbreviations (ex. aIM) should be referenced above for meaning (areaInMillimeters).

import java.text.NumberFormat;
import java.lang.Math;

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         *
         * SOLVED
         *
         */

         final double lengthPaper = 8.5;
         final double widthPaper = 11;
         final double inchToMillimeters = 25.4;
         final double area = lengthPaper * widthPaper * Math.pow(inchToMillimeters, 2);
         System.out.printf("\n%,.2f %s\n", area, "square millimeters.");
         /*First portion is formatting the variable (area by "\n%,.2f")
         and second portion is formatting string ("square millimeters" by %s).*/

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         *
         * SOLVED
         *
         */

         //Using length / width of Exercise 1.
         final double inchToCentimeters = 2.54;
         final double perimeter = inchToCentimeters * ((2*lengthPaper) + (2*widthPaper));
         System.out.printf("\n%,.2f %s\n", perimeter, "centimeters.");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         *
         * SOLVED
         *
         */

         //Using length / width of Exercise 1.
         final double hypotenuse = Math.sqrt(Math.pow(lengthPaper, 2) + Math.pow(widthPaper, 2));
         System.out.printf("\n%.2f %s\n", hypotenuse, "inches." );

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         *
         * SOLVED
         *
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        final double homeworkWeight = 0.15;
        final double quizWeight = 0.35;
        final double testWeight = 0.50;
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMinimumFractionDigits(2);
        double homeworkTotal = (homework1 + homework2 + homework3); //Should be
        double quizTotal = (quiz1 + quiz2 + quiz3);
        double testTotal = (test1 + test2 + test3);
        double markingPeriodGrade = ((homeworkTotal / 3) * homeworkWeight)  + ((quizTotal / 3) * quizWeight) + ((testTotal / 3) * testWeight);
        System.out.println("\n" + percentFormat.format(markingPeriodGrade / 100));




        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         *
         * SOLVED
         *
         */

         final double hourlyWage = 12.5;
         NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
         double mondayHours = 7.5;
         double tuesdayHours = 8;
         double wednesdayHours = 10.5;
         double thursdayHours = 9.5;
         double fridayHours = 6;
         double saturdayHours = 11.5;
         double sundayHours = 0;
         double totalHours = mondayHours + tuesdayHours + wednesdayHours + thursdayHours + fridayHours + saturdayHours + sundayHours;
         double payment = totalHours * hourlyWage;
         System.out.println("\n" + currencyFormat.format(payment) + ".");

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         *
         * SOLVED
         *
         */

         //Using above formatting for currency.
         final double salaryPerYear = 117000;
         final double federalTaxRate = .24;
         final double stateTaxRate = .0637;
         final double preTax401Rate = .07;
         double salaryPerCheck = 117000 / 24;
         double preTaxSalary = (salaryPerCheck - (salaryPerCheck * preTax401Rate));
         double takeHomePay = preTaxSalary * (1 - federalTaxRate) * (1 - stateTaxRate);
         System.out.println("\n" + currencyFormat.format(takeHomePay) + ".");

        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         *
         * SOLVED
         *
         */

         final int students = 273;
         final int teachers = 28;
         final int busCapacity = 54;
         int totalPeople = students + teachers;
         int totalBuses = (totalPeople / busCapacity) + 1; //An additional bus is needed because totalPeople/54 is not an integer.
         int lastBusPassengerCount = totalPeople % busCapacity;
         System.out.println("\n" + totalBuses + " buses are needed, with " + lastBusPassengerCount + " passengers on the last bus.");

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         *
         * SOLVED
         *
         */

         final double lengthCornhole = 24;
         final double widthCornhole = 48;
         final double diameterCornhole = 6;
         double surfaceArea = (lengthCornhole * widthCornhole) - (Math.PI * Math.pow((diameterCornhole / 2), 2));
         System.out.printf("\n%.2f %s\n", surfaceArea, "square inches." );

        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         *
         *
         *
         */

         int year;
         boolean leapYear;

         year = 2020;
         leapYear = true;
         System.out.println("\n" + year + " is a leap year..." + leapYear + ".");

         year = 2100;
         leapYear = false;
         System.out.println(year + " is a leap year..." + leapYear + ".");

         year = 2400;
         leapYear = true;
         System.out.println(year + " is a leap year..." + leapYear + ".");
        /*
         * Exercise 10.
         *
         * What is the wind chill?
         *
         * SOLVED
         *
         */

         double temperature = 38;
         double windSpeed = 14;
         double windChill = 35.74 + (.6215 * temperature) + (((.4275 * temperature) - 35.75) * Math.pow(windSpeed, .16));
         System.out.printf("\n%.1f %s\n", windChill, "degrees." );



    }
}
