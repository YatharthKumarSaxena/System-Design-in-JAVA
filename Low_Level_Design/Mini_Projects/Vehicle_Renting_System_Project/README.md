# 🚗 Welcome to the Vehicle Renting System Project!
> **I'm the README.md file of this folder, here to guide you step-by-step!** 🚀

## 📚 **Table of Contents**
- [📖 Introduction](#-introduction)
- [📂 Folder Structure](#-folder-structure)
- [🏗️ Design Patterns and Principles](#️-design-patterns-and-principles)
- [📜 Code Highlights](#-code-highlights)
- [🎯 **Final Takeaway**](#-final-takeaway)

---

## 📖 **Introduction**
This project is a practical implementation of a **Vehicle Renting System**, designed to demonstrate the application of object-oriented programming principles, design patterns, and Java best practices. The system manages renting vehicles via renting houses, showcasing its flexibility and scalability for real-world applications.

---

## 📂 **Folder Structure**
The folder contains a total of **4 subfolders**, **2 class files**, and **1 README.md file**:
- 📁 **Transaction_Management**: Handles ticket generation and bill processing.
- 📁 **User_Database**: Manages user data for employees and customers.
- 📁 **Vehicle_Renting_Elements**: Includes components for managing renting houses and addresses.
- 📁 **Vehicles**: Provides functionality for creating and managing vehicles.
- 📄 **Vehicle_Renting_Company**: Implements a singleton pattern for managing the renting company.
- 📄 **Vehicle_Renting_System**: Entry point showcasing the functionality of the system.
- 📄 **README.md**: You're currently reading it!

Each folder contains a `README.md` file detailing its respective implementation.

---

## 🏗️ **Design Patterns and Principles**
### **Design Patterns Used**
1. **Singleton Pattern**: Ensures a single instance of the renting company for the entire system.
2. **Composite Pattern**: Treats collections of renting houses as single entities, supporting scalability.
3. **Factory Pattern**: Used for vehicle and gate creation to simplify object instantiation.

### **Design Principles Followed**
- **SRP (Single Responsibility Principle)**: Each class has a single, well-defined responsibility.
- **LSP (Liskov Substitution Principle)**: New types of renting houses can be added without modifying existing code.

---

## 📜 **Code Highlights**
- **Vehicle Management**: Vehicles are created dynamically using a factory pattern with assigned parking slots.
- **Renting Houses**: Houses are organized with vehicles and addresses, enabling flexibility in renting operations.
- **Customer and Employee Management**: Distinguishes between user categories and provides tailored functionalities.
- **Gates and Billing**: Efficient entry and exit gates handle ticketing and billing processes.

### Example Features:
- Dynamic allocation of vehicles to slots.
- VIP ticket system for employees.
- Real-time slot status updates (empty vs. filled).
- Composite design for managing multiple renting houses.

---

## 🎯 **Final Takeaway**
This project is an excellent demonstration of applying OOP principles, design patterns, and Java features to solve a real-world problem. It emphasizes modularity, scalability, and maintainability, ensuring a clear understanding of system design concepts. 🚀
