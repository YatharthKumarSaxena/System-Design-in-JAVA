# Hi , I am the README file of this folder to assist you
# This folder consist of total four files including this file .
# One file consist the interface and the rest two files contain the classes 
<h2>Each file detailed information that how SOLID design principle is applied is given below :- </h2>
<h3> LateFeeCalculate </h3>
<h4> // It contains an interface that help in implementing Interface Segregation principle in Library_Item interface of Library_items folder // Here We can observe that our interface is not fat as well as it handle single responsibility of calculating the fees
// Single Responsibility Principle is followed here
// Interface Segregation Principle is followed here</h4>
<h3> LateFeeCalculator </h3>
<h4>// Here we can observe that method is dependent on the interface i.e abstraction not the concrete classes
// Dependency Inversion Principle is followed here</h4>
<h3> Library </h3>
<h4>// In the member function we can observe that :-
// We are iterating over the items of Library_item
// Here Library_Item can be anything like books, CD etc.
// Parent object can be replaced by any of it's child object
// And there is no risk of error
// Hence Liskov's Substitution Principle is followed here</h4>
