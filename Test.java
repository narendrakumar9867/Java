//Using Unicode Escape Sequences - (Unicode escape sequence starts with the characters '\ u' followed by four hexadecimal digits that represent the Unicode code point of the desired character.)
// public class UnicodeCharDemo {
//     public static void main (String[]args) {
//        char unicodeChar = '\u0041';
//        System.out.println("Stored Unicode Character: " + unicodeChar);
//     }
// }

// Storing Unicode Values Directly 
// public class UnicodeCharDemo {
//    public static void main(String[]args) {
//       char unicodeChar = 'A';
//       System.out.println("Stored Unicode Character: " + unicodeChar);
//    }
// }

// Operators

// public class demoTest {
//     public static void main(String []args) {
//         // Conditional Operator ( ? : )
//         int a, b;
//         a = 10;
//         b = ( a == 1 ) ? 20: 30;
//         System.out.println("Value of b is : " + b);

//         b = ( a == 10 ) ? 20: 30;
//         System.out.println("Value of b is : " + b);

//         // instanceof Operator
//         String name = "James";

//         boolean result = name instanceof String;
//         System.out.println( result );
//     }
// }


//Methods for Different Types of User Inputs
// import java.math.BigDecimal;
// import java.util.Scanner;

// public class AddTwoNumber {
//     public static void main(String []args) {
//         // Creating an object of scanner class
//         Scanner sc = new Scanner(System.in);

//         /*
//          * Reading two integer numbers using nextInt() method
//          */
//         System.out.print("Enter the first number: ");
//         BigDecimal num1 = sc.nextBigDecimal();

//         System.out.print("Enter the second number: ");
//         BigDecimal num2 = sc.nextBigDecimal();

//         // Calculating the sum
//         // int sum = num1 + num2;
//         BigDecimal sum = num1.add(num2);

//         // Printing the sum
//         System.out.println("The sum of the two numbers is: " + sum);
//     }
// }

// Date and Time
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
// public class DateDemo {
    // public static void main(String []args) {

        // Getting Current Date and Time
        // Date date = new Date();

        // System.out.println(date.toString());

        // // Date Formatting Using SimpleDateFormat
        // SimpleDateFormat ft = new SimpleDateFormat("E D yyyy.MM.dd 'at' hh:mm:ss a zzz");

        // System.out.println("Current Date: " + ft.format(date));

        // // Usingg printf
        // String str = String.format("Current Date/Time: %tc", date);
        // System.out.println(str);

        // //Measuring Elapsed Time
        // try {
        //     long start = System.currentTimeMillis();
        //     System.out.println(new Date() + "\n");

        //     Thread.sleep(5*60*10);
        //     System.out.println(new Date() + "\n");

        //     long end = System.currentTimeMillis();
        //     long diff = end - start;
        //     System.out.println("Difference is: " + diff);
        // } catch (Exception e) {
        //     System.out.println("Got an exceptional!");
        // }
//     }
// }


// import java.util.*;
// public class GregorianCalendarDemo {
//     public static void main(String []args) {
//         String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

//         int year;

//         GregorianCalendar gcalendar = new GregorianCalendar();

//         System.out.print("Date: ");
//         System.out.print(months[gcalendar.get(Calendar.MONTH)]);
//         System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
//         System.out.print(year = gcalendar.get(Calendar.YEAR));
//         System.out.print(" " + "Time: ");
//         System.out.print(gcalendar.get(Calendar.HOUR) + ":");
//         System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
//         System.out.println(gcalendar.get(Calendar.SECOND));

//         if (gcalendar.isLeapYear(year)) {
//             System.out.println("The current year is a leap year");
//         } else {
//             System.out.println("The current year is not a leap year");
//         }
//     }
// }


// Loops
// while loop, for loop, do...while loop, Enhanced for loop
// Loop Control Statements
// Break statement, continue statement


// Decision Making - (if statement, if...else statement, nested if statement, switch statement)


// public class Test {
//     public static void main(String []args) {

//         //if statment - (The ? : Operator)
//         int a, b;
//         a = 10;
//         b = (a == 1) ? 20:30;
//         System.out.println("The value of b: " + b);

//         b = (a == 10) ? 20:30;
//         System.out.println("The value of b: " + b);

//         // if else statement, if...else if...else statement
//         if (a < 20) {
//             System.out.println("The value of a is correct.");
//         } else if(a > 30) {
//             System.out.println("The value of a is wrong.");
//         } else {
//             System.out.println("The value of a is undefined.");
//         }

//         // nested if-else statement
//         if(a < 20) {
//             System.out.println("true");
//             if(a > 30) {
//                 System.out.println("false");
//             }
//         }

//         //Switch statement
//         char grade = 'A';

//         switch(grade) {
//             case 'A':
//                 System.out.println("Excellent");
//                 break;
//             case 'B' :
//             case 'C' :
//                 System.out.println("Well done");
//                 break;
//             case 'D' :
//             System.out.println("you passed");
//             case 'F' :
//             System.out.println("Better try again!");
//             break;
//             default :
//             System.out.println("Invalid grade");
//         }
//         System.out.println("Your grade is: " + grade);

//         // Using default Keyword With switch Statement
//         int month = 13;

//         switch (month) {
//             case 1:
//             System.out.println("January");
//             break;
//             case 2:
//             System.out.println("February");
//             break;
//             case 3:
//             System.out.println("march");
//             break;
//             case 4:
//             System.out.println("April");
//             break;
//             default:
//             System.out.println("Invalid month");
//             break;
//         }
//     }
// }


// for loop
// public class Test {
//     public static void main(String []args) {
//         for(int x = 1; x <= 100; x++) {
//             int [] num = {x};
//             for(int index = 0;index < num.length; index++ ) {
//             System.out.println("The value of arr: " + num[index]);
//             }
//         }
//     }
// }

// import java.util.Arrays;
// import java.util.List;

// public class Test {
//     public static void main(String []args) {

        // Nested for Loop in Java
        //Print Tables from 1 to 10 Using Nested for Loop
        // int num = 1;
        // int i = 1;

        // for( num = 1; num <= 10; num++) {
        //     System.out.println("Table of " + num + " is : ");
        //     for(i = 1; i <= 10; i++) {
        //         System.out.println(num * i + " ");
        //     }
        //     System.out.println();
        // }

        // for each loop
        // List<Integer> numbers = Arrays.asList(10,20,30,40,50);

        // for(Integer x: numbers) {
        //     System.out.println( x );
        //     System.out.println(",");
        // }

//         Candiate[] candiates = { new Candiate(1, "Narendra"), new Candiate(2, "Shruti")};

//         for(Candiate candiate: candiates) {
//             System.out.println(candiate);
//             System.out.println(",");
//         }
//     }
// }
// class Candiate {
//     int rollno;
//     String name;

//     Candiate(int rollno, String name){
//         this.rollno = rollno;
//         this.name =name;
//     }

//     @Override
//     public String toString() {
//         return "[" + this.rollno + ", " + this.name + " ]";
//     }
// }

// while loop

// import java.util.List;

// public class Test {
//     public static void main(String []args) {
//         int x = 10;

//         while( x < 20) {
//             System.out.println("value of x: "+ x);
//             x++;
//         }

//         int [] numbers = {10,20,30,40,50};
//         int index = 0;
//         while( index < 5) {
//             System.out.println("value of: " + numbers[index]);
//             index++;
//         }
//     }
// }

// do...while loop
public class Test {
    public static void main(String []args) {
        int x = 10;

        do {
            System.out.println("value of x: "+ x);
            x++;
        } while( x < 30 );
    }
}