# 📘 **Welcome to the Folder!**
> **I'm the README file of this folder, here to assist you in understanding its structure and the principles it follows!** 🚀

---

## 📂 **Folder Overview** 📂

This folder contains a total of **5 files**, including this README file.  
Here’s a quick look at the files in this folder:

1️⃣ **Library_Item** — Interface file 📄  
2️⃣ **Books** — Class file 📚  
3️⃣ **CD** — Class file 💿  
4️⃣ **DVD** — Class file 📀  
5️⃣ **README.md** — This very file to guide you! 😊

---

## 📝 **Detailed Explanation of Each File** 📝

### 🔍 **1️⃣ Library_Item** (Interface)
> **Concepts Applied:**
> - ✅ **Single Responsibility Principle (SRP)**
> - ✅ **Open-Closed Principle (OCP)**
> - ✅ **Interface Segregation Principle (ISP)**

#### 📘 **What This File Contains**
The **Library_Item** file is an **interface** that defines the structure for all library items.
> **Why It Matters?**
- 📚 **Single Responsibility Principle (SRP)** — The interface defines the structure for library items, focusing only on handling information about library items.
- 📐 **Open-Closed Principle (OCP)** — New items (like newspapers, magazines) can be added without modifying this interface.
- ✂️ **Interface Segregation Principle (ISP)** — The interface is divided to ensure it only handles a **single task** and does not contain unrelated behaviors.
> **Key Takeaway:**  
The **Library_Item** interface promotes the idea of **openness for extension** (new items can be added) but **closed for modification** (the interface doesn't change).

---

### 🔍 **2️⃣ Books, 3️⃣ CD, 4️⃣ DVD** (Class Files)
> **Concepts Applied:**
> - ✅ **Open-Closed Principle (OCP)**

#### 📘 **What These Files Contain**
These three files — **Books**, **CD**, and **DVD** — are **classes that inherit from the Library_Item interface**.
> **Why It Matters?**
- 📚 **Open-Closed Principle (OCP)** — New library items can be created (like **Newspapers** or **Magazines**) by adding new classes without changing existing code.
- 🔒 **Closed for Modification** — The functions of **Library_Item** cannot be modified directly unless the interface is updated.
> **Key Takeaway:**  
These classes show that the system is **open for extension** (new items like **Books, CDs, DVDs** can be added) but **closed for modification** (no need to change existing code).

---

## 🔥 **Summary of SOLID Principles Used** 🔥

| 🔥 **SOLID Principle**       | 📄 **File**           | 📘 **Explanation**                                   |
|----------------------------|----------------------|-----------------------------------------------------|
| 🧱 **Single Responsibility Principle (SRP)** | 📜 **Library_Item** | The interface only defines the structure for library items, ensuring a single responsibility. |
| 🧱 **Open-Closed Principle (OCP)**         | 📜 **Library_Item**, 📚 **Books**, 💿 **CD**, 📀 **DVD** | New library items can be added (like newspapers, magazines) without modifying existing code. |
| 🧱 **Interface Segregation Principle (ISP)**| 📜 **Library_Item** | Interface only handles one specific responsibility, ensuring clean, focused design. |

---

## 🚀 **Why It Matters** 🚀
Applying **SOLID Principles** in this folder helps in:
- **Writing Clean Code** 🧹 — Well-structured, clear, and easy-to-read code.
- **Reusability** 🔄 — Code that can be reused and extended without rewriting.
- **Maintainability** 🔧 — Code that is easy to maintain and fix.
- **Scalability** 📈 — Easily add new features or new types of library items.

---

## 🎉 **Get Ready to Dive In!** 🎉

This folder demonstrates **SOLID principles** in action. Each file showcases the use of concepts like **SRP, OCP, and ISP** to ensure the code is clean, maintainable, and extensible. If you'd like help or more explanations on **SOLID principles** or the files inside, feel free to ask!

🚀 **Happy Coding!** 🚀  
