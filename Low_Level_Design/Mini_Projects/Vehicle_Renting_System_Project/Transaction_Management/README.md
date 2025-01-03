# 🛒 Welcome to the Transaction Management Folder of the Vehicle Renting System Project!
> **I'm the README.md file of this folder, here to guide you step-by-step!** 🚀

## 📖 **Table of Contents**
- [📖 Introduction](#-introduction)
- [📂 Folder Structure](#-folder-structure)
- [🧩 Design Patterns & Principles](#-design-patterns--principles)
- [📑 Classes and Interfaces](#-classes-and-interfaces)
- [🎯 Final Takeaway](#-final-takeaway)

---

## 📖 **Introduction**
Welcome to the **Transaction Management** folder! This folder plays a critical role in managing transactions within the **Vehicle Renting System**. The key functionality of this module revolves around handling the entry and exit gates, where users interact to either rent vehicles or return them.

Here, we define various interfaces and implement the gates using classes. Let's walk through the structure of this folder, and understand how the files collaborate with each other to manage the renting system's transaction flow.

---

## 📂 **Folder Structure**
This folder consists of a total of **6 files**:
- **3 Class Files**:
    - 🏷️ `Entry_Gate.java`
    - 🏷️ `Exit_Gate.java`
    - 🏷️ `GateFactory.java`
- **3 Interface Files**:
    - 📄 `Ticket_Gate.java`
    - 📄 `Gate.java`
    - 📄 `Bill_Gate.java`

Each of these files serves a specific role in the vehicle renting system's transaction flow. The **Entry_Gate** and **Exit_Gate** classes are the main components of this system, whereas the interfaces define the contract that each gate type must adhere to.

---

## 🧩 **Design Patterns & Principles**
### **1. Factory Design Pattern**
- **Where**: `GateFactory` class.
- **Usage**: The Factory Design Pattern is used to instantiate different types of gates (Entry and Exit Gates) based on the provided `Renting_House_Interface`. This pattern ensures that the gate creation logic is decoupled from the rest of the system.
- **Purpose**: Provides flexibility in creating gate instances and adds scalability to the system.

### **2. Interface Segregation Principle (ISP)**
- **Where**: The use of multiple interfaces like `Ticket_Gate`, `Gate`, and `Bill_Gate`.
- **Usage**: Each interface focuses on specific functionality, preventing classes from being forced to implement unnecessary methods.
- **Purpose**: Ensures that no class is burdened with unnecessary methods, making the system more maintainable.

### **3. Single Responsibility Principle (SRP)**
- **Where**: `Entry_Gate` and `Exit_Gate` classes.
- **Usage**: Each class has a single responsibility. `Entry_Gate` focuses on ticket generation, and `Exit_Gate` handles bill generation.
- **Purpose**: Ensures that each class is focused on one task, improving maintainability.

### **4. Dependency Injection**
- **Where**: In the constructors of `Entry_Gate` and `Exit_Gate`, where the `Renting_House_Interface` is passed as a parameter.
- **Usage**: The dependencies (like the renting house) are injected into the classes, making the system more flexible and testable.
- **Purpose**: Decouples object creation and makes the system easier to maintain and extend.

---

## 📑 **Classes and Interfaces**

### 🏷️ **Entry_Gate** Class
- This class implements the `Ticket_Gate` interface and represents the **Entry Gate** of the vehicle renting system.
- **Main Functionality**: It generates a ticket for a vehicle and marks the vehicle slot as unavailable.

### 🏷️ **Exit_Gate** Class
- This class implements the `Bill_Gate` interface and represents the **Exit Gate** of the system.
- **Main Functionality**: It calculates the bill for the rented vehicle based on the distance traveled and marks the vehicle slot as available upon exit.

### 📄 **GateFactory** Class
- This class uses the **Factory Design Pattern** to create instances of `Entry_Gate` and `Exit_Gate` based on the provided `Renting_House_Interface`.

### 📄 **Ticket_Gate** Interface
- This interface defines the methods that must be implemented by the **Entry Gate**.
- **Main Functionality**: It includes the method for generating a renting ticket for a vehicle.

### 📄 **Gate** Interface
- This interface serves as a blueprint for the different gate types and defines common methods, such as `get_ID()` and `get_Renting_House()`.

### 📄 **Bill_Gate** Interface
- This interface is implemented by the **Exit Gate** and provides the method for generating the bill based on the rented vehicle's distance traveled.

---

## 🎯 **Final Takeaway**
Through the **Transaction Management** folder, we see how the combination of **interfaces** and **classes** creates a scalable solution for managing vehicle renting transactions. The **Entry Gate** handles ticket generation, while the **Exit Gate** calculates and generates the bill. The **Factory Design Pattern** is used to manage the creation of gate instances, ensuring flexibility and reusability.

This system is built to be easily extendable and adaptable to changes, such as adding new gate types or modifying the vehicle rental logic.

---