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

import java.lang.Math;
import java.text.NumberFormat;

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

         final double LENGTH_PAPER = 8.5;
         final double WIDTH_PAPER = 11;
         final double INCH_TO_MILLIMETERS = 25.4;

         double area = LENGTH_PAPER * WIDTH_PAPER * Math.pow(INCH_TO_MILLIMETERS, 2);

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
         final double INCH_TO_CENTIMETERS = 2.54;

         double perimeter = INCH_TO_CENTIMETERS * ((2*LENGTH_PAPER) + (2*WIDTH_PAPER));

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
         double hypotenuse = Math.sqrt(Math.pow(LENGTH_PAPER, 2) + Math.pow(WIDTH_PAPER, 2));

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

        final double HOMEWORK_WEIGHT = 0.15;
        final double QUIZ_WEIGHT = 0.35;
        final double TEST_WEIGHT = 0.50;

        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMinimumFractionDigits(2);

        double homeworkTotal = (homework1 + homework2 + homework3); //Should be
        double quizTotal = (quiz1 + quiz2 + quiz3);
        double testTotal = (test1 + test2 + test3);
        double markingPeriodGrade = ((homeworkTotal / 3) * HOMEWORK_WEIGHT)  + ((quizTotal / 3) * QUIZ_WEIGHT) + ((testTotal / 3) * TEST_WEIGHT);

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
         NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

         final double HOURLY_WAGE = 12.5;
         double mondayHours = 7.5;
         double tuesdayHours = 8;
         double wednesdayHours = 10.5;
         double thursdayHours = 9.5;
         double fridayHours = 6;
         double saturdayHours = 11.5;
         double sundayHours = 0;

         double totalHours = mondayHours + tuesdayHours + wednesdayHours + thursdayHours + fridayHours + saturdayHours + sundayHours;
         double payment = totalHours * HOURLY_WAGE;

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
         final double SALARY_PER_YEAR = 117000;
         final double FEDERAL_TAX_RATE = .24;
         final double STATE_TAX_RATE = .0637;
         final double PRE_TAX_401_RATE = .07;

         double salaryPerCheck = SALARY_PER_YEAR / 24;
         double preTaxSalary = (salaryPerCheck - (salaryPerCheck * PRE_TAX_401_RATE));
         double takeHomePay = preTaxSalary * (1 - FEDERAL_TAX_RATE) * (1 - STATE_TAX_RATE);

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

         final int STUDENTS = 273;
         final int TEACHERS = 28;
         final int BUS_CAPACITY = 54;

         int totalPeople = STUDENTS + TEACHERS;
         int totalBuses = (totalPeople / BUS_CAPACITY) + 1; //An additional bus is needed because totalPeople/54 is not an integer.
         int lastBusPassengerCount = totalPeople % BUS_CAPACITY;

         System.out.println("\n" + totalBuses + " buses are needed, with " + lastBusPassengerCount + " passengers on the last bus.");

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         *
         * SOLVED
         *
         */

         final double LENGTH_CORNHOLE = 24;
         final double WIDTH_CORNHOLE = 48;
         final double DIAMETER_CORNHOLE = 6;

         double surfaceArea = (LENGTH_CORNHOLE * WIDTH_CORNHOLE) - (Math.PI * Math.pow((DIAMETER_CORNHOLE / 2), 2));

         System.out.printf("\n%.2f %s\n", surfaceArea, "square inches." );

        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         *
         * SOLVED
         *
         */

         int year = 2020;
         boolean isLeapYear = ((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0);
         System.out.println("\n" + year + " is a leap year..." + isLeapYear + ".");

         year = 2100;
         isLeapYear = ((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0);
         System.out.println(year + " is a leap year..." + isLeapYear + ".");

         year = 2400;
         isLeapYear = ((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0);
         System.out.println(year + " is a leap year..." + isLeapYear + ".");
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
