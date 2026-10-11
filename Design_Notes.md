1. Why you used ArrayList instead of array?
I used ArrayList to store collections of students, courses, and enrollments because it provides dynamic resizing and convenient methods for managing objects.An array has a fixed size once it is created. If the number of students or courses increases, an array cannot automatically grow. We would need to create a new array and copy the existing elements.An ArrayList, on the other hand, can grow or shrink as elements are added or removed.

2. Where you used static members and why?
In my LearnTrack project, I used the static keyword in the main() method:

public static void main(String args[])

The main() method is static because the Java Virtual Machine (JVM) needs to start program execution without creating an object of the Main class.
A static method belongs to the class rather than to an individual object.

Why is main() static?
The JVM can call it directly using the class.
An object of the Main class is not required to start the application.
It provides the standard entry point for a Java application.

3. Where you used inheritance and what you gained from it?
Inheritance allows one class to acquire accessible fields and methods from another class using the extends keyword.

I have create Person class extended in student class. As person can be student , trainer or choach.

