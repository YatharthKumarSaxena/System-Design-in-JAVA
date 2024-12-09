# 📘 **Welcome to the Folder!**
> **I'm the README file of this folder, here to assist you in understanding its contents and purpose!** 🚀

---

## 📂 **Folder Overview** 📂

This folder contains a total of **4 files**, including this README file.  
Here's the breakdown of the files inside:  
1️⃣ **LateFeeCalculate** — Interface file  
2️⃣ **LateFeeCalculator** — Class file  
3️⃣ **Library** — Class file  
4️⃣ **README.md** — This very file to guide you! 😊

---

## 📝 **Detailed Explanation of Each File** 📝

### 🔍 **1️⃣ LateFeeCalculate** (Interface)
> **Concepts Applied:**
> - ✅ **Single Responsibility Principle (SRP)**
> - ✅ **Interface Segregation Principle (ISP)**

#### 📘 **What This File Contains**
This file contains an **interface** that demonstrates the application of the **Interface Segregation Principle (ISP)**.
> **Why It Matters?**
- The interface is designed to handle only **one single responsibility** — **Calculating the Late Fees**.
- It is a **lean, focused interface** — not a "fat" or overloaded one.
- This ensures the design is clean and modular, promoting **SRP** and **ISP**.

---

### 🔍 **2️⃣ LateFeeCalculator** (Class)
> **Concepts Applied:**
> - ✅ **Dependency Inversion Principle (DIP)**

#### 📘 **What This File Contains**
This file contains a **class** that follows the **Dependency Inversion Principle (DIP)**.
> **Why It Matters?**
- The method inside the class depends on an **interface** (abstraction) rather than a concrete class.
- This ensures **flexibility and maintainability** of the code.
- It allows you to **swap implementations** without affecting the rest of the system.

---

### 🔍 **3️⃣ Library** (Class)
> **Concepts Applied:**
> - ✅ **Liskov Substitution Principle (LSP)**

#### 📘 **What This File Contains**
This file contains a **class** that demonstrates the application of the **Liskov Substitution Principle (LSP)**.
> **Why It Matters?**
- In the member function of this file, we iterate over the **items of Library_Item**.
- **Library_Item** can be of any type (like **Books**, **CDs**, **DVDs**, etc.).
- We can **replace the parent object (Library_Item) with any of its child objects** (like **Book, CD, DVD**) without any errors.
- This is the essence of the **Liskov Substitution Principle** — child classes can be used in place of the parent class without breaking the system.

---

## 🎉 **Summary of SOLID Principles Used** 🎉

| 🔥 **SOLID Principle**     | 📄 **File**        | 📘 **Explanation**                                    |
|--------------------------|-------------------|-----------------------------------------------------|
| 🧱 **Single Responsibility Principle (SRP)** | 📜 **LateFeeCalculate** | Ensures the interface has only one job — Calculating fees. |
| 🧱 **Interface Segregation Principle (ISP)** | 📜 **LateFeeCalculate** | The interface is lean, not "fat," handling only what is necessary. |
| 🧱 **Dependency Inversion Principle (DIP)**  | 📜 **LateFeeCalculator** | Class depends on abstractions, not concrete classes.  |
| 🧱 **Liskov Substitution Principle (LSP)**   | 📜 **Library**          | Parent object (Library_Item) can be replaced by child objects (Books, CDs, DVDs) with no errors. |

---

## 🚀 **Why It Matters** 🚀
Applying **SOLID Principles** in this folder helps in:
- **Writing Clean Code** 🧹 — Well-organized and easy-to-read code.
- **Reusability** 🔄 — Code that can be reused without rewriting.
- **Maintainability** 🔧 — Simple to fix or add new features.
- **Scalability** 📈 — Easily extend the system with new features.

---

## 🎉 **Get Ready to Dive In!** 🎉

This folder is a **showcase of SOLID principles** in action. By following these principles, you’ll create more maintainable, flexible, and robust systems. If you'd like help or more explanations on **SOLID principles** or the files inside, let me know!

🚀 **Happy Coding!** 🚀  
