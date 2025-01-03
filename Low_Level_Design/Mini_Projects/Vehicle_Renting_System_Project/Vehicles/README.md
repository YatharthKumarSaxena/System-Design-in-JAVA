# 🛠️ Welcome to the Vehicles Folder of the Vehicle Renting System Project!
> **I'm the README.md file of this folder, here to guide you step-by-step!** 🚀

---

## 📑 Table of Contents
1. [📖 Introduction](#-introduction)
2. [📂 Folder Structure](#-folder-structure)
3. [🛡️ Design Principles and Patterns Used](#-design-principles-and-patterns-used)
4. [🎯 Final Takeaway](#-final-takeaway)

---

## 📖 **Introduction**
Welcome to the **Vehicles Folder** of the **Vehicle Renting System Project**, where we explore the core components of the vehicle rental logic. This folder encapsulates the use of interfaces and classes designed with adherence to the **SOLID principles** and **design patterns** to ensure scalability and maintainability.

Here, we focus on:
- **Defining interfaces** for modularity.
- **Implementing SRP (Single Responsibility Principle)** and **ISP (Interface Segregation Principle)**.
- Using the **Factory Design Pattern** to dynamically create vehicles based on input.

---

## 📂 **Folder Structure**
This folder contains a total of **8 files**, as described below:

### Interface Files:
1. 📘 **`Vehicle` Interface**:
    - Defines methods for vehicle properties and behavior, such as `getID()`, `getBrand()`, and `displayVehicleCategory()`.

2. 📘 **`ChargeRent` Interface**:
    - Handles rental charge calculations with methods like `getChargePerKilometers()` and `setChargeAfterDiscount()`.

### Class Files:
1. 🚗 **`Car`**:
    - Represents a car entity with attributes like brand, value, and charge per kilometer.

2. 🏍️ **`Bike`**:
    - Represents a bike entity with similar attributes and lower rental charges compared to a car.

3. 🚌 **`Bus`**:
    - Models a bus entity with higher rental charges and a larger slot size.

4. 🚚 **`Truck`**:
    - Represents a truck entity with attributes suitable for heavy-duty vehicle rental.

5. 🏭 **`VehicleFactory`**:
    - Implements the **Factory Design Pattern**, allowing dynamic creation of vehicles based on type.

### README File:
8. 📄 **`README.md`**:
    - This guide you're currently reading, which provides an overview of the folder structure and project elements.

---

## 🛡️ **Design Principles and Patterns Used**
Here’s how design principles and patterns are applied in this folder:

1. **Single Responsibility Principle (SRP)**:
    - Each class and interface has a distinct, well-defined responsibility. For instance:
        - `Vehicle` Interface handles vehicle properties.
        - `ChargeRent` Interface focuses on rental charge calculations.
        - Individual vehicle classes (`Car`, `Bike`, `Bus`, `Truck`) manage specific vehicle-related logic.

2. **Interface Segregation Principle (ISP)**:
    - Interfaces are kept specific and concise to avoid being too "fat". The `Vehicle` and `ChargeRent` interfaces serve distinct purposes.

3. **Open-Closed Principle (OCP)**:
    - New vehicle types can be added (e.g., `Taxi`, `Scooter`) without modifying existing code, thanks to the **Factory Design Pattern**.

4. **Factory Design Pattern**:
    - The `VehicleFactory` class dynamically creates vehicles based on type, ensuring flexibility and scalability.

---

## 🎯 **Final Takeaway**
- This folder demonstrates the **practical application of SOLID principles**, ensuring that each interface and class has a clear, defined responsibility.
- By employing the **Factory Design Pattern**, the project allows for the seamless addition of new vehicle types without modifying existing code, adhering to the **Open-Closed Principle**.
- The combination of **intuitive design** and **scalable architecture** makes this project an excellent resource for understanding **object-oriented programming and design patterns** in action.

---  
**Keep exploring, and happy coding!** 🚀
