// import java.io.*;

//Java Instance Variables
// public class Employees {

//    public String name;

//    private double salary;

//    public Employees (String empName){
//       name = empName;
//    }

//    public void setSalary(double empSal) {
//       salary = empSal;
//    }

//    public void printEmp() {
//       System.out.println("name : " + name);
//       System.out.println("salary: " + salary);
//    }

//    public static void main(String args[]) {
//       Employees empOne = new Employees("Shruti Shinde");
//       empOne.setSalary(2000000);
//       empOne.printEmp();
//    }
// }

// Java Class/Static Variables
// public class Employee {

//    // salary  variable is a private static variable
//    private static double salary;

//    // DEPARTMENT is a constant
//    public static final String DEPARTMENT = "Development ";

//    public static void main(String args[]) {
//       salary = 1000;
//       System.out.println(DEPARTMENT + "average salary:" + salary);
//    }
// }

// Java Primitive Data Types
// byte, short, int, long, float, double, boolean
// public class JavaTester {
//    public static void main(String args[]) {
//       byte byteValue1 = 2;
//       byte byteValue2 = 4;
//       byte byteResult = (byte)(byteValue1 + byteValue2);

//       System.out.println("Byte: " + byteResult);

//       short s = 10000;
//       short r = -20000;
//       short shortResult = (short)( s + r );

//       System.out.println("Short: " + shortResult);

//       int a = 100000;
//       int b = -200000;
//       int intResult = (int)( a + b);

//       System.out.println("Int: " + intResult);
      
//       long c = 10000L;
//       long d = -20000L;
//       long longResult = (long)( c + d );

//       System.out.println("Long: " + longResult);

//       float f1 = 223.43f;
//       float floatResult = (float)( f1);

//       System.out.println("Float: " + floatResult);

//       double d1 = 123.4;
//       double doubleResult = (double)( d1 );

//       System.out.println("Double: " + doubleResult);

//       boolean one = true;
//       boolean bolResult = (boolean)( one );

//       System.out.println("Boolean value: " + bolResult);

//       char letterA = 'A';
//       char charResult = (char)( letterA );

//       System.out.println("Char value: " + charResult);
//    }
// }

// Java Non-Primitive (Reference/Object) Data Types

// String, Arrays, Classes
// public class myString {
//    public static void main(String[] argv) {
//       String myString = new String("Hello, World!");
//    }
// }

// Java type Casting - (echnique that is used either by the compiler or a programmer to convert one data type to another in Java.) 
// 1)Widening type casting - (Widening type casting is also known as implicit type casting in which a smaller type is converted into a larger type, it is done by the compiler automatically.)

//(byte > short > char > int > float > double)

public class convert {
   public static void main(String[] args) {
      int num1 = 5004;
      double num2 = 2.4;
      double sum = num1 + num2;
      System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
   }
}

// we can't convert larger data types to smaller data types e.g. double--> int

// 2) Narrowing Type Casting - (convert larger to smaller)

// public class convert {
//    public static void main(String[] args) {
//       int num = 2353;
//       // Type casting int to double
//       double doubleNum = (double) num;

//       System.out.println("The value of " + num + " after converting to double is " + doubleNum);

//       // Type casting double back to int
//       int convertedInt = (int) doubleNum;

//       System.out.println("The value of " + doubleNum + " after converting back to int is " + convertedInt);
//    }
// }


