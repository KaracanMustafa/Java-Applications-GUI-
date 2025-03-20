# CoffeeMaker

## 📌 Project Description
CoffeeMaker is a Java-based desktop application that allows users to prepare different types of coffee. It is developed using Java Swing and follows a state-based architecture to manage the coffee-making process efficiently.

## 🚀 Features
- User-friendly graphical interface (GUI)
- Multiple coffee options: Espresso, Americano, Latte, etc.
- State-based coffee machine logic
- Database integration for storing preferences or stock management
- Real-time process tracking

## 🏗 Project Structure
### Core Classes & Responsibilities
- **`CoffeeMachine.java`** – The main control class that manages the coffee-making process.
- **`BrewingState.java`** – Represents the coffee machine's brewing state.
- **`DatabaseConnection.java`** – Manages database connectivity, storing user preferences or stock levels.
- **`DoneState.java`** – The state representing the completion of the coffee-making process.
- **`EmptyState.java`** – Indicates the machine is out of ingredients.
- **`IdleState.java`** – Represents the machine's idle or waiting mode.
- **`MachineState.java`** – A base class/interface implementing the State Design Pattern to manage machine states.
- **`MainPage.java`** – Manages the GUI interactions and user input.
- **`MainPage.form`** – Java Swing form file for the graphical interface.

**Clone the repository:**
   ```bash
   git clone https://github.com/KaracanMustafa/Java-Applications-GUI-/tree/main/CoffeeMaker
   ```
   
## 📌 Requirements
- **Java 8+** (JDK must be installed)
- **Java Swing** support in your IDE

## 📜 License
This project is licensed under the MIT License. See the `LICENSE` file for details.
