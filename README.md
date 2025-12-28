A. Project overview

Purpose of the program is to store information about different types of vehicles and their drivers, and also display it if necessary.
Vehicle Management System consists of one superclass and three its subclasses, also there is another class Driver.

Inheritance is used to create subclasses of a superclass with similar but a little different behaviour.
Composition is used to assign drivers to vehicles.
Abstraction is used to create abstract superclass with abstract methods.

B. Class Hierarchy

Vehicle is an abstract superclass.
Concrete classes Car, Motorcycle, Truck are subclasses of superclass Vehicle.
Class Driver is neither superclass nor subclass, it is another class connected with superclass Vehicle(composition and aggregation)

Overridden methods startEngine and stopEngine inform when vehicle start or stop specifying its type.

I use protected access modifier in superclass because we need an access to its fields and methods within subclasses so it is not private.
Private and public access modifiers in other classes are used for encapsulation.

C. Instructions to Compile and Run

javac *.java 
java Main

D. Screenshots

Screenshots demonstrate input and output of program

E. Reflection section

Inheritance simplifies design by creating superclasses and subclasses, it helps to understand functionality of subclasses looking on superclass realization.
It decreases making similar fields and methods, and subclasses are concentrated on realization of unique fields and methods.

Method overriding allows us to change functionality completely to create new implementation of a method.

I did not face any challenges using protected access modifier.
