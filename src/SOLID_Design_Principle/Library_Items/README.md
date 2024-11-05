# Hi , I am the README file of this folder to assist you 
# This folder consist of total five files including this file .
# One file consist the interface and the rest three files contain the classes that inherits the properties of the interface
<h2>Each file detailed information that how SOLID design principle is applied is given below :- </h2>
<h3> Books & CD & DVD</h3>
<h4>Open Closed Principle is followed here
Closed Principle is followed here as the library item is implemented by DVD, CD and Books
We cannot do any modification in it's function itself until and unless if we change the code of LibraryItem
This means modification by Interface here is restricted hence closed principle is followed here</h4>
<h3> Library_Item </h3>
<h4>// Library Item contains here the information about the items of library
// Hence Single Responsibility Principle is followed here


// Open Closed Principle here is followed as other library item can be added without any modification in code
// Here we can observe open principle is followed as by this interface I can add new library item like newspaper , magazine etc just like CD,DVD etc
// Hence our program is open for extensions

// Here We can observe that our interface is not fat as well as it handle single responsibility of returning the values
// Interface segregation is done here because we found that interface Library_Item was doing two different functions
// First behavior includes a function that return ome value
// Second behavior includes a function that do some calculation
// In this way we can understand one thing that abiding the interface segregation principle also lead to abiding the single responsibilty function as well
// Because as per Single Responsibility Principle an interface must perform a single task not multiple tasks</h4>