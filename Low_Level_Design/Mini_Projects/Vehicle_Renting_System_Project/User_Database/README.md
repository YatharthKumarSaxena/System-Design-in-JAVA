# 🛒 Welcome to the User_Database Folder of the Vehicle_Renting_System_Project!

> **I'm the README.md file of this folder, here to guide you step-by-step!** 🚀

## 📖 **Table of Contents**

- [📖 Introduction](#-introduction)
- [📂 Folder Structure](#-folder-structure)
- [🔑 Design Principles and Patterns](#-design-principles-and-patterns)
- [🎯 Final Takeaway](#-final-takeaway)

---

## 📖 **Introduction**

This folder is part of the **Vehicle Renting System Project**, specifically focusing on the user database management. The primary goal of this section is to handle customer and employee data, including their details like name, phone number, and their respective categories. We adhere to key software principles such as **SRP** (Single Responsibility Principle) and **DRY** (Don’t Repeat Yourself) to ensure efficient and maintainable code.

---

## 📂 **Folder Structure**

The folder contains a total of **5 files**, which are essential for managing the user data in the system. These files include **3 interfaces** and **2 class files**:

- **Interfaces**:
    1. **`User.java`** 📃: A core interface that defines the common properties and methods for both customers and employees.
    2. **`Customer_Interface.java`** 📃: Extends the `User` interface and introduces additional methods specific to customers, such as obtaining a renting ticket.
    3. **`Employee_Interface.java`** 📃: Extends the `User` interface and introduces methods specific to employees, including the calculation of discounts on rentals.

- **Class Files**:
    1. **`Customer.java`** 👥: A class implementing the `Customer_Interface` interface. It stores and manages customer-related information such as name, ID, phone number, and renting tickets.
    2. **`Employee.java`** 👨‍💼: A class implementing the `Employee_Interface` interface. It handles employee-related information such as name, ID, phone number, and rental discounts.

---

## 🔑 **Design Principles and Patterns**

### **Design Principles Used**

1. **Single Responsibility Principle (SRP)**:
    - **What**: The **SRP** states that a class should have only one reason to change, meaning it should only have one job or responsibility.
    - **Where**:
        - The **Customer** and **Employee** classes each have distinct responsibilities.
        - **Customer** class is responsible for managing customer-specific data, such as their name, ID, and ticket.
        - **Employee** class is responsible for managing employee-specific data, such as their name, ID, and phone number. Additionally, the employee has a responsibility to manage the discount on rent.
        - **User**, **Customer_Interface**, and **Employee_Interface** interfaces define the essential user-related operations, separating concerns between different types of users.

2. **Don’t Repeat Yourself (DRY)**:
    - **What**: **DRY** emphasizes minimizing duplication of code. Any functionality that is common across different classes or modules should be written once and reused.
    - **Where**:
        - The **User** interface defines common methods that are shared between the **Customer** and **Employee** classes, such as `get_Name()`, `get_ID()`, and `get_phoneNumber()`. This prevents duplicating code for these common functionalities in both the **Customer** and **Employee** classes.
        - Both **Customer_Interface** and **Employee_Interface** extend the **User** interface, adding specific functionality while reusing the common methods from **User**.

3. **Interface Segregation Principle (ISP)**:
    - **What**: The **ISP** states that no client should be forced to depend on methods it does not use. In essence, interfaces should have a specific, focused set of methods.
    - **Where**:
        - The **Customer_Interface** and **Employee_Interface** interfaces are an example of **ISP**. These interfaces extend the **User** interface, adding user-specific methods.
        - For instance, **Customer_Interface** introduces `get_Ticket()`, which is relevant only to customers, while **Employee_Interface** introduces `get_Discount_On_Rent()`, which applies to employees. Neither class is forced to implement unnecessary methods.

### **Design Patterns Used**:

1. **Strategy Design Pattern**:
- The **Strategy Design Pattern** is applied in this project to handle varying user behaviors. The `Customer` and `Employee` classes implement the `User` interface and share some common methods such as `get_Name()`, `get_ID()`, and `get_phoneNumber()`. However, each class has its own specific behavior, particularly in the `display_Category()` method.
- The pattern allows these different behaviors to be interchangeable. Based on the instance type (either `Customer` or `Employee`), the correct behavior is applied dynamically without the need for complex conditional checks.
- This helps in maintaining the flexibility of the code and adhering to the **Open/Closed Principle**, ensuring that the system can accommodate future user types easily by simply creating new classes that implement the `User` interface.

---

## 🎯 **Final Takeaway**

In this folder, we utilized object-oriented programming principles to build a scalable solution for managing users in the **Vehicle Renting System**. By leveraging interfaces and adhering to principles like **SRP** and **DRY**, we have created a flexible and maintainable system for handling both customers and employees. This structure ensures that adding new types of users or extending existing features can be done seamlessly while maintaining code quality.

---


