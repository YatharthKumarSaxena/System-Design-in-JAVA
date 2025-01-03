# 🛻 Welcome to the Vehicles Folder of the Parking Lot Project!
> **I'm the README.md file of this folder, here to guide you step-by-step!** 🚀

---

## 📖 Table of Contents
- [📖 Introduction](#-introduction)
- [📂 Folder Structure](#-folder-structure)
- [🧩 Key Features and Principles](#-key-features-and-principles)
- [🎯 Final Takeaway](#-final-takeaway)

---

## 📖 **Introduction**
This folder is an integral part of the **Parking Lot Project**, containing essential interfaces and classes related to various vehicle types, tickets, and rental pricing. It demonstrates the use of **design principles** and **design patterns** to maintain code scalability and efficiency.

---

## 📂 **Folder Structure**
This folder consists of a total of **9 files**, described below:

1. 📄 **README.md**: You're currently reading this file, your guide to the folder.
2. 🔗 **Interfaces**:
    - **Vehicle**: Defines the blueprint for all vehicles.
    - **Parking_Ticket**: Handles ticketing details for parking.
    - **Calculate_Rental_Price**: Calculates rental price based on duration.
3. 🏷️ **Classes**:
    - **VehicleFactory**: Implements the **Factory Design Pattern** to create vehicle objects dynamically.
    - **Ticket**: Represents parking ticket details and manages unique IDs.
    - **Car**: Implements vehicle-specific details for a car.
    - **Bike**: Implements vehicle-specific details for a bike.
    - **Auto**: Implements vehicle-specific details for an auto-rickshaw.

---

## 🧩 **Key Features and Principles**

### 🎯 **Design Principles Applied**
1. **Single Responsibility Principle (SRP)**: Each class and interface is focused on a single responsibility, ensuring clarity and maintainability.
2. **Interface Segregation Principle (ISP)**: Interfaces are designed to be specific and not overly complex, preventing unnecessary dependencies.
3. **Open/Closed Principle (OCP)**: New vehicle types (e.g., truck, bus) can be added without modifying existing code.

### 🛠️ **Design Patterns Utilized**
1. **Factory Design Pattern**: The `VehicleFactory` class demonstrates the creation of vehicle objects dynamically based on the input type.

### 🚗 **Features of Vehicle Types**
- **Car**: Categorized as a "Four-Wheeler," with a rental rate of ₹10 per hour.
- **Bike**: Categorized as a "Two-Wheeler," with a rental rate of ₹5 per hour.
- **Auto**: Categorized as a "Three-Wheeler," with a rental rate of ₹8 per hour.

### 🧾 **Ticket Management**
- Automatic ticket ID generation using static initialization.
- Tracks vehicle details, assigned parking slot, and timestamp.

---

## 🎯 **Final Takeaway**
This folder showcases how **object-oriented programming** principles can be effectively applied to design a robust and scalable solution. The **Vehicles** folder is a perfect demonstration of implementing **design principles** and **patterns** like SRP, ISP, and the Factory Design Pattern. By exploring this folder, you'll gain insights into building modular and extendable code for real-world projects.

---
