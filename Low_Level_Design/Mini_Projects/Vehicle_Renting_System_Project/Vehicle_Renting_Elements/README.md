# 🛒 Welcome to the Vehicle Renting System Project!
> **I'm the README.md file of this folder, here to guide you step-by-step!** 🚀

## 📖 **Table of Contents**
- [📖 Introduction](#-introduction)
- [📂 Folder Structure](#-folder-structure)
- [🎨 Design Patterns & Principles](#-design-patterns--principles)
- [🎯 Final Takeaway](#-final-takeaway)

## 📖 **Introduction**
This project simulates a **Vehicle Renting System**, where users can rent vehicles from various renting houses, with features such as managing vehicle availability, generating tickets, and applying discounts for VIP users.

The system focuses on modularity, scalability, and flexibility. It is built using Object-Oriented Programming (OOP) principles and practices.

## 📂 **Folder Structure**
This folder consists of a total of 9 files, out of which four are interface files, and the remaining are class files.

### Interface Files:
- **Address**: Defines methods related to the address of a renting house.
- **Renting_House_Interface**: Specifies methods related to managing the renting house.
- **Renting_Ticket**: Describes methods related to vehicle ticket handling.
- **Vehicle_Slots**: Specifies methods for slot management in the system.

### Class Files:
- **Address_Of_Renting_House**: Implements the `Address` interface, providing details of a renting house address.
- **Renting_House**: Implements the `Renting_House_Interface` interface and handles vehicle listings and parking slot management.
- **Ticket**: Implements the `Renting_Ticket` interface, representing a basic vehicle renting ticket.
- **VIP_Ticket**: Extends the `Ticket` class, adding functionality for VIP tickets with discount handling.
- **Slot**: Implements the `Vehicle_Slots` interface, handling parking slot availability.

## 🎨 **Design Patterns & Principles**
### **Design Patterns** Used:

1. **Factory Method Pattern**
    - Used for dynamically creating different ticket types (`Ticket`, `VIP_Ticket`) based on runtime requirements.
    - **Benefit**: This pattern encapsulates object creation, promoting flexibility in extending ticket types without changing the core logic.

2. **Singleton Pattern**
    - Used for managing static resources like `Slot_ID` to ensure a unique ID is assigned to each slot.
    - **Benefit**: Ensures only one instance of certain resources (e.g., slot IDs) exists, maintaining consistency across the system.

3. **Strategy Pattern**
    - Applied in the `VIP_Ticket` class, where different discount strategies can be applied dynamically based on the employee’s privileges.
    - **Benefit**: Promotes flexibility by allowing different strategies to be used at runtime.

4. **Observer Pattern**
    - Although not fully implemented, it can be inferred that components like `Renting_House` can observe changes in vehicle slot status (availability), reacting accordingly.
    - **Benefit**: Facilitates event-driven programming, allowing components to react to changes in real-time.

5. **Decorator Pattern**
    - The `VIP_Ticket` class extends the functionality of the `Ticket` class, adding features like applying discounts without changing the core ticket logic.
    - **Benefit**: Enhances functionality without modifying existing code, promoting the open/closed principle.

6. **Composite Pattern**
    - The `Renting_House` class can be seen as a container of `Vehicle` objects, implying a composite structure.
    - **Benefit**: Allows uniform treatment of complex hierarchies, simplifying code interaction.

### **Design Principles** Followed:

1. **Single Responsibility Principle (SRP)**
    - Each class has a singular responsibility, ensuring that changes are easier to manage. For instance, the `Ticket` class is solely responsible for ticket details, while the `Renting_House` class focuses on managing vehicles and slots.

2. **Open/Closed Principle (OCP)**
    - The system is designed to be open for extension (e.g., new ticket types or vehicle categories) but closed for modification, allowing easy integration of new features.

3. **Liskov Substitution Principle (LSP)**
    - Derived classes, such as `VIP_Ticket`, can replace their base class (`Ticket`) without affecting the correctness of the program, ensuring proper behavior across the system.

4. **Interface Segregation Principle (ISP)**
    - The system uses focused interfaces like `Renting_Ticket` and `Vehicle_Slots` to ensure that classes implement only the methods they need, improving flexibility and maintainability.

5. **Dependency Inversion Principle (DIP)**
    - High-level modules like `Renting_House` depend on abstractions (interfaces) rather than concrete classes, making the system more flexible and decoupled.

## 🎯 **Final Takeaway**
This project utilizes multiple design patterns and principles to ensure that it is both scalable and maintainable. By adhering to **OOP principles**, **design patterns**, and **best practices**, we have created a robust and modular vehicle renting system that is easily extensible for future improvements.
