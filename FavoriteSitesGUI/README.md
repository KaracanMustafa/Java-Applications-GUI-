# FavoriteSites - Desktop Application

This is a **FavoriteSites** project developed for the SE 2224 - Software System Analysis course at Yaşar University. The application allows users to maintain a list of locations they have visited and liked, with functionality to share this information with their friends. The application is built using Java and communicates with a MySQL database.

## Features

- **User Authentication**: 
  - Users must log in with a username and password to access the main functionality.
  
- **Add, Delete, Edit Visits**:
  - Add locations to the database with details like country, city, year, season, best feature, comments, and rating.
  - Edit or delete visits by visit ID.

- **Favorite Locations**:
  - Share favorite visits with friends.
  - Display shared visits from friends.

- **Display Information**:
  - Display sorted country names based on ratings where the best feature is food.
  - Display images related to locations from a predefined set.
  - Display visit information based on year, most visited countries, or countries visited only in spring.

- **Database**:
  - MySQL database with three tables: 
    - **userinfo**: Stores user credentials (username, password, user ID).
    - **visits**: Stores visit data (country, city, year, season, feature, comments, rating, user ID).
    - **sharedvisits**: Stores the shared visit information (usernames and visit IDs).

## Architecture

The application follows a basic layered architecture with:
- **GUI (LoginFrame, MainFrame)**: Java Swing components for interaction.
- **Database Access Layer**: Interactions with the MySQL database.
- **Business Logic Layer**: Implements the logic for adding, deleting, editing, and displaying visits, as well as the sharing functionality.

## Requirements

- **Java 8 or higher** (for compiling and running the program).
- **MySQL Database** to store user and visit information.

## Setup and Installation

### 1. Clone the repository:
```bash
git clone https://github.com/yourusername/favoritesites.git
