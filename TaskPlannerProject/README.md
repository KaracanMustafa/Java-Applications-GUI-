# Task Planner Application

This is a task planner application developed for the SE 3317 – Software Design and Architecture course at Yaşar University. The application is built using Java and communicates with a MySQL database. It uses a Model-View-Controller (MVC) architectural pattern along with the Observer, Strategy, Composite, and Decorator design patterns.

## Features

- **Task Management**: 
  - Add, delete, and edit tasks.
  - Tasks are stored in a MySQL database.
  - Task details include the task name, description, category, and deadline.
  
- **Task List**: 
  - Upon startup, the list of tasks from the database is displayed.
  - The task list is updated dynamically after adding, deleting, or editing tasks.

- **Notifications**: 
  - A notification appears when a task’s deadline is one day away, displayed in the "Notifications" section.
  
- **Birthday and Date Decorators**: 
  - The “Day”, “Date”, “Birthday Celebration Message”, and “Notifications” sections use the Decorator Pattern to provide custom messages.
  - Displays "Happy Birthday" if the current date matches the user's birthday.

- **Timer**: 
  - A timer updates the day, date, birthday message, and notifications at fixed intervals.

## Architecture

The application is designed using the following software design patterns:
- **MVC (Model-View-Controller)**: Separates the user interface (View), application logic (Controller), and data (Model).
- **Observer Pattern**: Ensures that the application reacts to changes, particularly in task data.
- **Strategy Pattern**: Provides different strategies for interacting with tasks.
- **Composite Pattern**: Organizes and manages task categories.
- **Decorator Pattern**: Adds dynamic behavior to the "Day", "Date", "Birthday Celebration Message", and "Notifications" sections.

## Requirements

- **Java 8 or higher** (for compiling and running the program).
- **MySQL Database** for storing tasks.

## Setup and Installation

### 1. Clone the repository:
```bash
git clone https://github.com/KaracanMustafa/TaskPlannerProject.git
