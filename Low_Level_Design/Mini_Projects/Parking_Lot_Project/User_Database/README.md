# 🛒 Welcome to the User Database Folder of the Parking Lot Project!
> **I'm the README.md file of this folder, here to guide you step-by-step!** 🚀

---

## 📚 **Table of Contents**
1. [📖 Introduction](#-introduction)
2. [📂 Folder Structure](#-folder-structure)
3. [✨ Key Highlights](#-key-highlights)
4. [🎯 Final Takeaway](#-final-takeaway)

---

## 📖 **Introduction**
The **User Database** folder plays a pivotal role in managing user information and interactions within the Parking Lot Project. This folder encapsulates user-related functionalities and demonstrates principles like **SRP** (Single Responsibility Principle) and **DRY** (Don't Repeat Yourself). It includes interfaces and class implementations for employees and customers, each with specific responsibilities.

---

## 📂 **Folder Structure**
This folder contains a total of **five files**:

1. **`User`** 🧑‍💼 *(Interface)*:
    - Defines the base user functionalities such as `display_Category`, `get_Name`, `get_ID`, and `get_phoneNumber`.

2. **`Employee_Interface`** 🛠️ *(Interface)*:
    - Extends the `User` interface and adds methods specific to employees like `get_Slot` and `get_Vehicle`.

3. **`Customer_Interface`** 💳 *(Interface)*:
    - Extends the `User` interface and includes methods like `get_Ticket` for customer-specific functionalities.

4. **`Employee`** 📋 *(Class)*:
    - Implements the `Employee_Interface`.
    - Contains data members such as `name`, `ID`, `phoneNumber`, `slot`, and `vehicle`.
    - Follows **SRP** and **DRY** principles.

5. **`Customer`** 🛍️ *(Class)*:
    - Implements the `Customer_Interface`.
    - Contains data members like `name`, `ID`, `phoneNumber`, and `ticket`.
    - Adheres to **SRP** and **DRY** principles.

6. **`README.md`** 📜:
    - This file, providing an overview of the folder's structure and functionalities.

---

## ✨ **Key Highlights**
- **Adherence to Design Principles**:
    - **SRP**: Each interface and class focuses on a single responsibility.
    - **DRY**: Shared functionalities are abstracted into interfaces to avoid redundancy.

- **Comprehensive User Representation**:
    - **Employee**: Includes details like reserved parking slots and associated vehicles.
    - **Customer**: Manages parking tickets and user information.

- **Static Initialization**:
    - Unique `User_ID` and `Cus_ID` ensure distinct identification for every user.

- **Encapsulation**:
    - Private data members with controlled access via public methods.

---

## 🎯 **Final Takeaway**
This folder exemplifies a structured approach to managing user data within a Parking Lot System, highlighting the practical application of **Object-Oriented Programming** principles and design patterns. By leveraging interfaces and adhering to **SRP** and **DRY**, the code is both scalable and maintainable. Dive into the files to explore the seamless integration of these concepts in action!
