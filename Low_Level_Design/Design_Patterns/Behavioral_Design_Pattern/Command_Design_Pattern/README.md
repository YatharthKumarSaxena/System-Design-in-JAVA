# 📝 Welcome to the Command_Design_Pattern Folder
> **I'm the README.md file of this folder, here to guide you step-by-step!** 🚀

---

## 📂 Table of Contents 📂
1. [Folder Structure](#-folder-structure)
2. [What is Command Design Pattern?](#-what-is-command-design-pattern)
3. [Where is it Used in the Problem Statement?](#-where-is-it-used-in-the-problem-statement)
4. [Get Ready to Dive In!](#-get-ready-to-dive-in)

---

## 📂 Folder Structure
This folder contains the following items:

### Total Items: 3
- Class Files: 1
- Interfaces: 1
- README.md Files: 1 (The one you're reading)

### Breakdown of the Contents:
#### Class File:
- **FormatTextCommand.java** 🖥️: Implements the logic for formatting text as per the command issued.

#### Interface:
- **TextEditorCommand.java** 🧑‍💻: Defines the contract for all text editor commands.

#### README.md File:
- The current README.md file, providing a detailed explanation of this folder's structure and design pattern.

---

## 💡 What is Command Design Pattern?
The Command Design Pattern is a behavioral design pattern that turns a request into a stand-alone object. This object contains all the information about the request, such as the method to be executed, the parameters for the method, and the receiver of the method. By using the command pattern, you can decouple the sender of a request from the object that handles the request.

The pattern consists of:

- **Command** — An interface for executing a command.
- **Concrete Command** — A class that implements the Command interface and defines the binding between a Receiver object and an action.
- **Invoker** — An object that knows how to execute a command but doesn’t know what the specific command is.
- **Receiver** — The object that performs the action associated with the request.

---

## 📝 Where is it Used in the Problem Statement?
In this project, the Command Design Pattern is applied to the Text Editor application. The goal is to provide a mechanism to format the text in various ways. Each formatting action (such as converting the text to uppercase or lowercase) is encapsulated into a command.

### How it's implemented:
- The **FormatTextCommand** class acts as the Concrete Command that executes the formatting.
- The **TextEditorCommand** interface is the Command Interface, ensuring that all formatting commands adhere to the same structure.
- **Invoker** will trigger the commands, without knowing exactly what formatting will take place, thus allowing for easy extensibility.

By using the Command pattern, we can easily add new formatting strategies without modifying the existing code.

---

## 🚀 **Get Ready to Dive In!**
This folder demonstrates the Command Design Pattern applied to a Text Editor project. Explore the code and try adding more commands to expand the functionality of the text editor.

Happy coding! 🎉
