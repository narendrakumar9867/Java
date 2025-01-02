// OOPs Concepts ---(https://www.tutorialspoint.com/java/java_oops_concepts.htm)
// ------Polymorphism
//       Inheritance
//       Encapsulation
//       Object
//       Class
//       Abtraction

// class Dog {
//     // Declaring and initializing the attributes
//     String breed;
//     int age;
//     String color;

//     // methods to set breed, age, and color of the dog
//     public void setBreed(String breed) {
//         this.breed = breed;
//     }
//     public void setage(int age) {
//         this.age = age;
//     }
//     public void setcolor(String color) {
//         this.color = color;
//     }

//     // method to print all three values
//     public void printDetails() {
//         System.out.println("Details: ");
//         System.out.println(this.breed);
//         System.out.println(this.age);
//         System.out.println(this.color);
//     }
// }

// public class Main {
//     public static void main(String []args) {
//         Dog obj = new Dog();

//         obj.setBreed("Golden Retriever");
//         obj.setage(2);
//         obj.setcolor("Golden");

//         obj.printDetails();
//     }
// }


// Accessing Instance Variables and Methods
// public  class Puppy {
//     int PuppyAge;

//     public Puppy(String name) {
//         System.out.println("Name chosen is: " + name);
//     }

//     public void setAge(int age) {
//         PuppyAge = age;
//     }

//     public int getAge() {
//         System.out.println("Puppy's age is: " + PuppyAge);
//         return PuppyAge;
//     }

//     public static void main(String []args) {

//         Puppy myPuppy = new Puppy("tommy");

//         myPuppy.setAge(3);

//         myPuppy.getAge();

//         System.out.println("Variable value: " + myPuppy.PuppyAge);
//     }
// }


// Class Atrribute
// class Student {
//     String name = "Shru";
//     int age = 20;
//     String job_title = "Software";
// }

// public class Main {
//     public static void main(String []args) {
//         // Creating an object of the class Student
//         Student obj = new Student();

//         System.out.println(obj.name);
//         System.out.println(obj.age);
//         System.out.println(obj.job_title);

//         // modify
//         obj.name = "narendra";
//         obj.age = 19;
//         obj.job_title = "Software";

//         // After modification print values
//         System.out.println("The modify values: ");
//         System.out.println(obj.name);
//         System.out.println(obj.age);
//         System.out.println(obj.job_title);


//         // after you can't modify values
//         class Student {
//             final String name = "Shruti";
//         }
//     } 
// }

// Class Methods
class Util {
    public int minimum(int n1, int n2) {
        int mini;
        if (n1 > n2) {
            mini = n2;
        } else {
            mini = n1;
        }
        return mini;
    }
}
public class Tester {
    public static void main(String []args) {
        int a = 11;
        int b = 10;

        Util util = new Util();

        int c = util.minimum(a, b);
        System.out.println("Minimum value is; " + c);
    }
}